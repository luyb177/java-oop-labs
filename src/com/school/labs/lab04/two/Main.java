package com.school.labs.lab04.two;

// 父类 Vehicle
class Vehicle {
    String brand;
    int speed;

    // 构造方法
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void run() {
        System.out.println("【父类run】交通工具运行");
    }
}

// 子类 Car
class Car extends Vehicle {
    int seat;

    // 构造方法
    Car(String brand, int speed, int seat) {
        super(brand, speed); // 在第一行调用父类构造方法
        this.seat = seat;
    }

    // 方法重写（Override）
    @Override
    void run() {
        System.out.println("【子类run】汽车行驶，速度：" + speed);
    }

    // 使用 super 访问父类成员
    void showAll() {
        System.out.println("【showAll信息】");
        System.out.println("品牌：" + super.brand);
        System.out.println("速度：" + super.speed);
        System.out.println("座位数：" + seat);
    }
}

// 主类
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 120, 5);

        // 调用重写方法
        car.run();

        // 调用 super 相关方法
        car.showAll();
    }
}