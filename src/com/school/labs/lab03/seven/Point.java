package com.school.labs.lab03.seven;

public class Point {
    private int x;
    private int y;

    // 带参构造
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // getter / setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // 显示坐标
    public void showPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }
}
