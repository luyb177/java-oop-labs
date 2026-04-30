package com.school.labs.lab03.six;

public class Circle {
    // 私有成员变量，默认值 1.0
    private double radius = 1.0;

    // 无参构造
    public Circle() {
    }

    // 带参构造
    public Circle(double radius) {
        this.radius = radius;
    }

    // 计算周长
    public double getPerimeter() {
        return 2 * 3.14 * this.radius;
    }

    // 计算面积
    public double getArea() {
        double perimeter = this.getPerimeter();
        System.out.println("圆的周长：" + perimeter);
        return 3.14 * this.radius * this.radius;
    }
}