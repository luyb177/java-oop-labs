package com.school.labs.lab03.eight.entity;

public class Student {
    public void testAccess() {
        Person p = new Person(1, "张三", 20, "男");

        // p.id;   private 不可访问

        System.out.println(p.name);   // 默认权限 同包可访问
        System.out.println(p.age);    // protected 同包可访问
        System.out.println(p.gender); // public 可访问
    }
}