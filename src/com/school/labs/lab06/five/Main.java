package com.school.labs.lab06.five;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入文本
        System.out.print("请输入文本：");
        String text = scanner.nextLine();

        // 敏感词列表
        String[] sensitiveWords = {"bad", "danger"};

        // 遍历敏感词进行替换
        for (String word : sensitiveWords) {

            // (?i) 表示忽略大小写
            Pattern pattern = Pattern.compile("(?i)" + word);
            Matcher matcher = pattern.matcher(text);

            StringBuffer sb = new StringBuffer();

            // 查找并替换
            while (matcher.find()) {
                // 生成等长星号
                String stars = "*".repeat(matcher.group().length());

                matcher.appendReplacement(sb, stars);
            }

            matcher.appendTail(sb);

            // 更新文本
            text = sb.toString();
        }

        // 输出过滤后的文本
        System.out.println("过滤后的文本：");
        System.out.println(text);

        scanner.close();
    }
}
