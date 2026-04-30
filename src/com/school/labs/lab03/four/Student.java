package com.school.labs.lab03.four;

public class Student {
    private int id;
    private String name;
    private double score;

    // 无参构造
    public Student() {
    }

    // 带参构造
    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // 显示信息方法
    public void showInfo() {
        System.out.println("学号：" + id +
                "  姓名：" + name +
                "  成绩：" + score);
    }
}
