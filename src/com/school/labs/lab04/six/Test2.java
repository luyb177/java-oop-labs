package com.school.labs.lab04.six;

// 父类：求最大公约数
class MathA {
    public int f(int a, int b) {
        // 欧几里得算法
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}

// 子类：求最小公倍数
class MathB extends MathA {

    @Override
    public int f(int a, int b) {
        // 调用父类方法求最大公约数
        int m = super.f(a, b);

        // 最小公倍数 = (a*b)/最大公约数
        return (a * b) / m;
    }
}

// 主类
public class Test2 {
    public static void main(String[] args) {

        // 父类对象 -> 求最大公约数
        MathA a = new MathA();
        int gcd = a.f(12, 18);
        System.out.println("最大公约数：" + gcd);

        // 向上转型 -> 实际是子类对象
        MathA b = new MathB();
        int lcm = b.f(12, 18);
        System.out.println("最小公倍数：" + lcm);
    }
}