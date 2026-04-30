package com.school.labs.lab04.one;

// 父类 People
class People {
    String name = "父类名字";
    double height = 170.5;

    void showInfo() {
        System.out.println("【父类showInfo】姓名：" + name + "，身高：" + height);
    }
}

// 子类 Student
class Student extends People {
    // 隐藏父类的 height
    int height = 180;

    int score = 95;

    void study() {
        System.out.println("【子类study】我在学习，成绩：" + score);
    }

    void showHiddenTest() {
        System.out.println("【变量隐藏演示】");
        System.out.println("子类 height（int）：" + height);
        System.out.println("父类 height（double）：" + super.height);
    }
}

// 主类
public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        // 1. 调用子类方法
        s.study();

        // 2. 调用继承的方法
        s.showInfo();

        // 3. 查看变量隐藏效果
        s.showHiddenTest();
    }
}