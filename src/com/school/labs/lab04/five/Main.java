package com.school.labs.lab04.five;

// 接口 Workable
interface Workable {
    // 常量 默认 public static final
    int LEVEL = 5;

    // 抽象方法 默认 public abstract
    void work();

    // default 方法
    default void eat() {
        System.out.println("工作之余要吃饭");
    }

    // static 方法
    static void rule() {
        System.out.println("工作规则：遵守公司制度");
    }
}

// Teacher 类
class Teacher implements Workable {

    @Override
    public void work() {  // 必须 public
        System.out.println("老师在教学");
    }

    @Override
    public void eat() {  // 可以重写 default 方法
        System.out.println("老师吃午餐");
    }
}

// Programmer 类
class Programmer implements Workable {

    @Override
    public void work() {  // 必须 public
        System.out.println("程序员在写代码");
    }
}

// 主类
public class Main {
    public static void main(String[] args) {
        // ===== 接口回调（多态）=====
        Workable w1 = new Teacher();
        Workable w2 = new Programmer();

        // 调用抽象方法（多态）
        w1.work();
        w2.work();

        // 调用 default 方法
        w1.eat();
        w2.eat();

        // 调用接口 static 方法
        Workable.rule();

        // ===== 验证常量 =====
        System.out.println("接口常量 LEVEL：" + Workable.LEVEL);

        // ===== 错误示例（必须写出来说明）=====
        // w1.rule();  编译错误（static 不属于对象）
        // new Teacher().rule();  编译错误（类不继承接口 static 方法）
    }
}