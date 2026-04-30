package com.school.labs.lab04.six;

// 类 A
class A {
    void f() {
        System.out.print("英文字母表：");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}

// 子类 B（不重写 f）
class B extends A {

    void g() {
        System.out.println("希腊字母表：α β γ δ ε ζ η θ ι κ λ μ ν ξ ο π ρ σ τ υ φ χ ψ ω");
    }
}

// 测试
public class Test1 {
    public static void main(String[] args) {
        B b = new B();

        b.f(); // 继承的方法
        b.g(); // 子类新增方法
    }
}