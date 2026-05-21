package com.school.labs.lab06.one;

import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 接收用户输入
        System.out.print("请输入一个字符串：");
        String str = scanner.nextLine();

        int upperCount = 0; // 大写字母个数
        int lowerCount = 0; // 小写字母个数
        int digitCount = 0; // 数字个数

        // 统计字符类型
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                upperCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        // 输出统计结果
        System.out.println("大写字母个数：" + upperCount);
        System.out.println("小写字母个数：" + lowerCount);
        System.out.println("数字个数：" + digitCount);

        // 字符串反转
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        System.out.println("反转后的字符串：" + reversed);

        // 判断是否为回文字符串
        boolean isPalindrome = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("该字符串是回文字符串");
        } else {
            System.out.println("该字符串不是回文字符串");
        }

        scanner.close();
    }
}