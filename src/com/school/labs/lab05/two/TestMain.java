package com.school.labs.lab05.two;

public class TestMain {
    public static void main(String[] args) {

        try {
            // 测试除法（会触发除零异常）
            System.out.println("结果：" + MathUtils.Calculator.divide(10, 0));

            // 测试开平方（会触发负数异常）
            System.out.println("结果：" + MathUtils.Calculator.sqrt(-9));
        }
        catch (ArithmeticException e) { // 处理除零异常
            System.out.println("ArithmeticException：" + e.getMessage());
        }
        catch (IllegalArgumentException e) { // 处理负数异常
            System.out.println("IllegalArgumentException：" + e.getMessage());
        }
    }
}
