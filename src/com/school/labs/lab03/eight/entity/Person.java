package com.school.labs.lab03.eight.entity;

public class Person {
    private int id;
    String name;             // 默认(友好)
    protected int age;
    public String gender;

    // 无参构造
    public Person() {
    }

    // 带参构造
    public Person(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // private
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // gender
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // 打印信息
    public void showPerson() {
        System.out.println("id=" + id +
                ", name=" + name +
                ", age=" + age +
                ", gender=" + gender);
    }
}