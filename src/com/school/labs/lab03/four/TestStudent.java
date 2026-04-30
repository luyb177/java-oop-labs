package com.school.labs.lab03.four;

public class TestStudent {
    public static void main(String[] args) {

        // 无参构造 + set 赋值
        Student s1 = new Student();
        s1.setId(1001);
        s1.setName("张三");
        s1.setScore(88.5);

        // 带参构造
        Student s2 = new Student(1002, "李四", 92.0);

        // 输出信息
        s1.showInfo();
        s2.showInfo();
    }
}
