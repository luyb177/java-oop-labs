package com.school.labs.lab07.one;

import java.io.*;

public class FileCopyTest {

    // 普通字节流复制
    public static long copyByFileStream(String source, String target) {
        long start = System.nanoTime();

        try (
                FileInputStream fis = new FileInputStream(source);
                FileOutputStream fos = new FileOutputStream(target)
        ) {
            byte[] buffer = new byte[1024];
            int len;

            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        long end = System.nanoTime();
        return end - start;
    }

    // 缓冲字节流复制
    public static long copyByBufferedStream(String source, String target) {
        long start = System.nanoTime();

        try (
                BufferedInputStream bis =
                        new BufferedInputStream(new FileInputStream(source));
                BufferedOutputStream bos =
                        new BufferedOutputStream(new FileOutputStream(target))
        ) {
            byte[] buffer = new byte[1024];
            int len;

            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }

            bos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        long end = System.nanoTime();
        return end - start;
    }

    public static void main(String[] args) {
        String sourceFile = "src/com/school/labs/lab07/one/source.txt";

        String normalTarget = "src/com/school/labs/lab07/one/destination_normal.txt";
        String bufferedTarget = "src/com/school/labs/lab07/one/destination_buffered.txt";

        long normalTime = copyByFileStream(sourceFile, normalTarget);
        long bufferedTime = copyByBufferedStream(sourceFile, bufferedTarget);

        System.out.println("===== 文件复制结果 =====");
        System.out.println("普通字节流耗时: "
                + normalTime / 1_000_000.0 + " ms");

        System.out.println("缓冲字节流耗时: "
                + bufferedTime / 1_000_000.0 + " ms");

        if (bufferedTime < normalTime) {
            System.out.println("缓冲字节流效率更高");
        } else {
            System.out.println("两者效率接近");
        }
    }
}
