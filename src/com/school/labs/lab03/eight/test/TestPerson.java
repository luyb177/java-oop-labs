package com.school.labs.lab03.eight.test;

import com.school.labs.lab03.eight.entity.Person;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person();

        // p.id = 1;          private 不可访问
        // p.name = "张三";    默认权限 不同包不可访问
        // p.age = 20;        protected 不同包不可访问(非子类)

        p.gender = "男";     // public 可访问

        // 通过 public 方法访问 private
        p.setId(1001);
        System.out.println("id=" + p.getId());

        // 访问 public 成员
        System.out.println("gender=" + p.gender);

        // 使用方法设置其他属性
        p.setName("李四");
        p.setAge(22);

        p.showPerson();
    }
}