package com.school.labs.lab08.six;

public class Student implements Comparable<Student> {
    int height = 0;
    String name;

    Student(String n, int h) {
        name = n;
        height = h;
    }

    public int compareTo(Student b) {
        return (this.height - b.height);
    }
}
