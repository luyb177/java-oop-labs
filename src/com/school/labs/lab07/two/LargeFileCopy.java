package com.school.labs.lab07.two;

import java.io.*;
import java.util.Scanner;

// src/com/school/labs/lab07/two/source.dmg
// src/com/school/labs/lab07/two/destination.dmg

public class LargeFileCopy {

    private static final int BUFFER_SIZE = 8 * 1024; // 8KB
    private static final long REPORT_SIZE = 100L * 1024 * 1024; //100MB

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入源文件路径：");
        String sourcePath = scanner.nextLine();

        System.out.print("请输入目标文件路径：");
        String targetPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);

        if (!sourceFile.exists()) {
            System.out.println("源文件不存在！");
            return;
        }

        long totalSize = sourceFile.length();

        long startTime = System.currentTimeMillis();

        try (
                BufferedInputStream bis =
                        new BufferedInputStream(
                                new FileInputStream(sourcePath));

                BufferedOutputStream bos =
                        new BufferedOutputStream(
                                new FileOutputStream(targetPath))
        ) {

            byte[] buffer = new byte[BUFFER_SIZE];

            int len;
            long copiedBytes = 0;
            long nextReport = REPORT_SIZE;

            while ((len = bis.read(buffer)) != -1) {

                bos.write(buffer, 0, len);

                copiedBytes += len;

                if (copiedBytes >= nextReport) {

                    double percent =
                            copiedBytes * 100.0 / totalSize;

                    System.out.printf(
                            "当前进度：%.2f%%\n",
                            percent
                    );

                    nextReport += REPORT_SIZE;
                }
            }

            bos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();

        File targetFile = new File(targetPath);

        System.out.println("\n===== 复制完成 =====");

        System.out.println(
                "源文件大小：" +
                        sourceFile.length() / 1024 / 1024 +
                        " MB"
        );

        System.out.println(
                "目标文件大小：" +
                        targetFile.length() / 1024 / 1024 +
                        " MB"
        );

        System.out.println(
                "耗时：" +
                        (endTime - startTime) +
                        " ms"
        );
    }
}
