package com.school.labs.lab05.two;

public class MathUtils {
    // 静态嵌套类
    public static class Calculator {
        // 除法
        public static double divide(double a, double b) {
            if (b == 0) {
                throw new ArithmeticException("除数不能为0！");
            }
            return a / b;
        }

        // 开平方
        public static double sqrt(double x) {
            if (x < 0) {
                throw new IllegalArgumentException("不能对负数开平方！");
            }
            return Math.sqrt(x);
        }
    }
}