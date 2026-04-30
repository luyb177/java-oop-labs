package com.school.labs.lab04.four;

// 抽象类 Shape
abstract class Shape {
    // 抽象方法
    abstract double getArea();
    abstract String getShapeName();
}

// 圆形
class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    double getArea() {
        return 3.14159 * r * r;
    }

    @Override
    String getShapeName() {
        return "圆形";
    }
}

// 矩形
class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }

    @Override
    String getShapeName() {
        return "矩形";
    }
}

// 主类
public class Main {
    public static void main(String[] args) {

        // 上转型数组（核心）
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(3, 4);

        // 多态体现：统一调用
        for (Shape s : shapes) {

            System.out.println(s.getShapeName() + "的面积：" + s.getArea());
        }
    }
}