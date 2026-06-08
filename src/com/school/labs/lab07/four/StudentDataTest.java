package com.school.labs.lab07.four;

import java.io.*;
import java.util.*;

public class StudentDataTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fileName = "src/com/school/labs/lab07/four/students.dat";

        // 保存学生信息
        try (
                DataOutputStream dos =
                        new DataOutputStream(
                                new FileOutputStream(fileName))
        ) {

            for (int i = 1; i <= 3; i++) {

                System.out.println("请输入第" + i + "个学生信息");

                System.out.print("姓名：");
                String name = scanner.next();

                System.out.print("年龄：");
                int age = scanner.nextInt();

                System.out.print("成绩：");
                double score = scanner.nextDouble();

                dos.writeUTF(name);
                dos.writeInt(age);
                dos.writeDouble(score);
            }

            System.out.println("学生信息保存成功！");

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n===== 从文件读取 =====");

        List<Student> students = new ArrayList<>();

        double totalScore = 0;

        try (
                DataInputStream dis =
                        new DataInputStream(
                                new FileInputStream(fileName))
        ) {

            while (dis.available() > 0) {

                String name = dis.readUTF();
                int age = dis.readInt();
                double score = dis.readDouble();

                Student student =
                        new Student(name, age, score);

                students.add(student);

                totalScore += score;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Student student : students) {
            System.out.println(student);
        }

        double avg =
                totalScore / students.size();

        System.out.printf(
                "\n平均成绩：%.2f\n",
                avg
        );
    }
}
