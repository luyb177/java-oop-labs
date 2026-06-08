package com.school.labs.lab07.five;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String FILE_NAME = "students.ser";

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("张三", 18));
        students.add(new Student("李四", 20));
        students.add(new Student("王五", 19));

        serialize(students);

        List<Student> result = deserialize();

        System.out.println("\n===== 反序列化结果 =====");

        if (result != null) {
            result.forEach(System.out::println);
        }
    }

    /**
     * 序列化
     */
    private static void serialize(List<Student> students) {

        try (
                ObjectOutputStream oos =
                        new ObjectOutputStream(
                                new FileOutputStream(FILE_NAME))
        ) {

            oos.writeObject(students);

            System.out.println("对象序列化成功");

        } catch (IOException e) {

            System.out.println("序列化失败");

            e.printStackTrace();
        }
    }

    /**
     * 反序列化
     */
    @SuppressWarnings("unchecked")
    private static List<Student> deserialize() {

        try (
                ObjectInputStream ois =
                        new ObjectInputStream(
                                new FileInputStream(FILE_NAME))
        ) {

            return (List<Student>) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {

            System.out.println("反序列化失败");

            e.printStackTrace();

            return null;
        }
    }
}