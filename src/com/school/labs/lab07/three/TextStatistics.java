package com.school.labs.lab07.three;

import java.io.*;

public class TextStatistics {

    public static void main(String[] args) {

        String sourceFile = "src/com/school/labs/lab07/three/source.txt";
        String targetFile = "src/com/school/labs/lab07/three/result.txt";

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (
                BufferedReader reader =
                        new BufferedReader(
                                new FileReader(sourceFile));

                BufferedWriter writer =
                        new BufferedWriter(
                                new FileWriter(targetFile))
        ) {

            String line;

            while ((line = reader.readLine()) != null) {

                lineCount++;

                // 字符统计（不统计换行符）
                charCount += line.length();

                // 单词统计
                String[] words =
                        line.trim().split("\\s+");

                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }

                // 数字替换
                String newLine =
                        line.replaceAll("\\d", "#");

                writer.write(newLine);
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("===== 统计结果 =====");
        System.out.println("总行数：" + lineCount);
        System.out.println("总单词数：" + wordCount);
        System.out.println("总字符数：" + charCount);

        System.out.println("处理后的文件已保存到："
                + targetFile);
    }
}