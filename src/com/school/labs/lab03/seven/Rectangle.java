package com.school.labs.lab03.seven;

public class Rectangle {
    private Point leftTop;
    private Point rightBottom;

    // 带参构造
    public Rectangle(Point leftTop, Point rightBottom) {
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;
    }

    // 计算面积
    public int getArea() {
        int width = Math.abs(rightBottom.getX() - leftTop.getX());
        int height = Math.abs(rightBottom.getY() - leftTop.getY());
        return width * height;
    }

    // 移动矩形
    public void move(int dx, int dy) {
        leftTop.setX(leftTop.getX() + dx);
        leftTop.setY(leftTop.getY() + dy);

        rightBottom.setX(rightBottom.getX() + dx);
        rightBottom.setY(rightBottom.getY() + dy);
    }
}