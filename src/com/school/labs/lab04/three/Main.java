package com.school.labs.lab04.three;

// final 类
// 不能被继承
final class MathUtil {
    // final 常量
    public static final double PI = 3.14159;

    // final 方法
    public final double circleArea(double r) {
        return PI * r * r;
    }
}

// 父类 Animal
class Animal {
    void cry() {
        System.out.println("动物在叫");
    }
}

// 子类 Dog
class Dog extends Animal {
    @Override
    void cry() {
        System.out.println("狗在叫：汪汪");
    }

    void lookHome() {
        System.out.println("狗在看家");
    }
}

// 子类 Cat
class Cat extends Animal {
    @Override
    void cry() {
        System.out.println("猫在叫：喵喵");
    }

    void catchMouse() {
        System.out.println("猫在抓老鼠");
    }
}

// 主类
public class Main {
    public static void main(String[] args) {

        // ===== final 测试 =====
        MathUtil mu = new MathUtil();
        double area = mu.circleArea(2);
        System.out.println("圆面积：" + area);
        System.out.println("PI常量：" + MathUtil.PI);

        // ===== 上转型（多态）=====
        Animal a = new Dog(); // 上转型
        Animal b = new Cat(); // 上转型

        // 调用重写方法（多态）
        a.cry();
        b.cry();

        // ===== 验证：上转型限制 =====
        // a.lookHome(); 编译错误
        // b.catchMouse();  编译错误

        // 需要向下转型才能调用
        Dog d = (Dog) a;
        d.lookHome();

        Cat c = (Cat) b;
        c.catchMouse();
    }
}