package com.school.labs.lab03.two;

public class Int {
    private int value;

    // 构造方法
    public Int(int value) {
        this.value = value;
    }

    // 加法
    public Int add(Int other) {
        return new Int(this.value + other.value);
    }

    // 减法
    public Int subtract(Int other) {
        return new Int(this.value - other.value);
    }

    // 乘法
    public Int multiply(Int other) {
        return new Int(this.value * other.value);
    }

    // 除法
    public Int divide(Int other) {
        if (other.value == 0) {
            throw new ArithmeticException("除数不能为0");
        }
        return new Int(this.value / other.value);
    }

    // 重写 equals 方法
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Int)) {
            return false;
        }
        Int other = (Int) obj;
        return this.value == other.value;
    }

    // 重写 toString 方法
    @Override
    public String toString() {
        return String.valueOf(value);
    }

    // 测试 main
    public static void main(String[] args) {
        Int a = new Int(10);
        Int b = new Int(5);

        System.out.println("a + b = " + a.add(b));
        System.out.println("a - b = " + a.subtract(b));
        System.out.println("a * b = " + a.multiply(b));
        System.out.println("a / b = " + a.divide(b));

        Int c = new Int(10);
        System.out.println("a equals c ? " + a.equals(c));
    }
}
