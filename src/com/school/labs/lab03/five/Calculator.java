package com.school.labs.lab03.five;

public class Calculator {
    // 静态变量，统计调用次数
    private static int count = 0;

    // 两个 int 相加
    public static int add(int a, int b) {
        count++;
        return a + b;
    }

    // 两个 double 相加
    public static double add(double a, double b) {
        count++;
        return a + b;
    }

    // 三个 int 相加
    public static int add(int a, int b, int c) {
        count++;
        return a + b + c;
    }

    // 获取调用次数
    public static int getCount() {
        return count;
    }
}