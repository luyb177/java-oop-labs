package com.school.labs.lab08.two;

import java.util.*;

public class StudentSortDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("张三", 85));
        students.add(new Student("李四", 92));
        students.add(new Student("王五", 78));
        students.add(new Student("赵六", 95));
        students.add(new Student("钱七", 88));
        students.add(new Student("孙八", 73));
        students.add(new Student("周九", 90));
        students.add(new Student("吴十", 66));

        // 线程1：打印排序结果
        Thread printThread = new Thread(() -> {
            synchronized (students) {
                students.sort(Comparator.comparingInt(Student::getScore));
                System.out.println("===== 线程1: 排序结果 =====");
                for (Student s : students) {
                    System.out.println(s);
                }
            }
        });

        // 线程2：随机修改3个学生的分数并重新排序
        Thread modifyThread = new Thread(() -> {
            synchronized (students) {
                Random rand = new Random();
                System.out.println("\n===== 线程2: 随机修改3个学生的分数 =====");
                for (int i = 0; i < 3; i++) {
                    int idx = rand.nextInt(students.size());
                    int newScore = rand.nextInt(101);
                    System.out.println("将 " + students.get(idx).getName() +
                            " 的分数从 " + students.get(idx).getScore() +
                            " 修改为 " + newScore);
                    students.get(idx).setScore(newScore);
                }
                students.sort(Comparator.comparingInt(Student::getScore));
                System.out.println("\n===== 线程2: 重新排序后 =====");
                for (Student s : students) {
                    System.out.println(s);
                }
            }
        });

        printThread.start();
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        modifyThread.start();
        try {
            printThread.join();
            modifyThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() { return name; }
    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }

    @Override
    public String toString() {
        return name + ": " + score + "分";
    }
}
