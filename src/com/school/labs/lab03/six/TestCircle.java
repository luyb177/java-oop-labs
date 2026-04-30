package com.school.labs.lab03.six;

public class TestCircle {
    public static void main(String[] args) {
        // 使用无参构造
        Circle c1 = new Circle();
        System.out.println("面积：" + c1.getArea());

        System.out.println("------------------");

        // 使用带参构造
        Circle c2 = new Circle(2.5);
        System.out.println("面积：" + c2.getArea());
    }
}