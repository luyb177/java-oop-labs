package com.school.labs.lab06.three;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入身份证号
        System.out.print("请输入身份证号：");
        String idCard = scanner.nextLine();

        // 正则表达式：
        // 前17位为数字
        // 最后一位为数字或 X/x
        String regex = "^\\d{17}[0-9Xx]$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(idCard);

        // 验证合法性
        if (matcher.matches()) {
            System.out.println("身份证号格式合法");

            // 提取出生年月日
            String year = idCard.substring(6, 10);
            String month = idCard.substring(10, 12);
            String day = idCard.substring(12, 14);

            String birthday = year + "-" + month + "-" + day;

            System.out.println("出生日期：" + birthday);

            // 第17位判断性别
            int genderNum = idCard.charAt(16) - '0';

            if (genderNum % 2 == 1) {
                System.out.println("性别：男");
            } else {
                System.out.println("性别：女");
            }

        } else {
            System.out.println("身份证号格式不合法");
        }

        scanner.close();
    }
}