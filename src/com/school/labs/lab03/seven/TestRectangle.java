package com.school.labs.lab03.seven;

public class TestRectangle {
    public static void main(String[] args) {
        // 创建两个点
        Point p1 = new Point(1, 5);
        Point p2 = new Point(6, 1);

        // 创建矩形
        Rectangle rect = new Rectangle(p1, p2);

        System.out.println("初始坐标：");
        p1.showPoint();
        p2.showPoint();

        System.out.println("矩形面积：" + rect.getArea());

        System.out.println("---- 移动矩形 ----");

        // 移动
        rect.move(2, 1);

        System.out.println("移动后坐标：");
        p1.showPoint();
        p2.showPoint();

        System.out.println("矩形面积：" + rect.getArea());

        System.out.println("---------------");

        // 直接修改 Point
        p1.setX(0);
        p1.setY(0);

        System.out.println("修改后坐标：");
        p1.showPoint();
        p2.showPoint();

        System.out.println("矩形面积：" + rect.getArea());
    }
}
