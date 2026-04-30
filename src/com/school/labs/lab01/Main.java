package com.school.labs.lab01;

public class Main {
    public static void main(String[] args) {
        System.out.println("这是Main,计算不同形状的面积");
        Triangle triangle = new Triangle(5, 10);
        System.out.println("三角形的面积: " + triangle.area());
        Circle circle = new Circle(7);
        System.out.println("圆的面积: " + circle.area());
    }
}

class Triangle {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return 0.5 * base * height;
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }
}