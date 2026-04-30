package com.school.labs.lab03.five;

public class TestCalculator {
    public static void main(String[] args) {

        System.out.println(Calculator.add(3, 5));
        System.out.println(Calculator.add(2.5, 3.6));
        System.out.println(Calculator.add(1, 2, 3));
        System.out.println(Calculator.add(10, 20));

        // 打印总调用次数
        System.out.println("总调用次数：" + Calculator.getCount());
    }
}