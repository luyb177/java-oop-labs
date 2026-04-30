package com.school.labs.lab02.three;

public class BasicTypeDemo {
    public static void main() {
        // 基本数据类型
        byte b = 10;
        short s = 200;
        int i = 1000;
        long l = 10000L;
        float f = 3.14F;
        double d = 6.28;
        char c = 'A';
        boolean bool = true;

        System.out.println("===== 基本数据类型 =====");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        // 2. 算术运算
        int a = 20;
        int b2 = 6;

        System.out.println("\n===== 算术运算 =====");
        System.out.println("加法: " + (a + b2));
        System.out.println("减法: " + (a - b2));
        System.out.println("乘法: " + (a * b2));
        System.out.println("除法: " + (a / b2));
        System.out.println("取余: " + (a % b2));

        // 3. 关系运算
        System.out.println("\n===== 关系运算 =====");
        System.out.println("a > b2: " + (a > b2));
        System.out.println("a < b2: " + (a < b2));
        System.out.println("a == b2: " + (a == b2));
        System.out.println("a != b2: " + (a != b2));

        // 4. 逻辑运算
        int num = 50;

        System.out.println("\n===== 逻辑运算 =====");
        System.out.println("num: " + num);
        System.out.println("num 在10~100之间: " + (num >= 10 && num <= 100));
        System.out.println("num 不在10~100之间: " + !(num >= 10 && num <= 100));
        System.out.println("num < 10 或 num > 100: " + (num < 10 || num > 100));

    }
}
