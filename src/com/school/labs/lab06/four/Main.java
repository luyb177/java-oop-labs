package com.school.labs.lab06.four;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // 原始日志时间字符串
        String logTime = "2023-08-1514:30:45";

        // 定义输入格式
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-ddHH:mm:ss");

        // 解析为 LocalDateTime
        LocalDateTime dateTime = LocalDateTime.parse(logTime, inputFormatter);

        // 增加 3 天 5 小时
        LocalDateTime newDateTime = dateTime.plusDays(3).plusHours(5);

        // 定义输出格式
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy/MM/ddHH:mm:ss");

        // 格式化输出
        String result = newDateTime.format(outputFormatter);

        System.out.println("原时间：" + logTime);
        System.out.println("3天5小时后的时间：" + result);
    }
}
