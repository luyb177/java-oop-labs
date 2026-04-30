package com.school.labs.lab03.one;

class AAA {
    static int m;

    static {
        m = 888;
        System.out.println("静态块执行");
    }
}

public class E {
    public static void main(String[] args) {
        AAA a = null;
        System.out.printf("%d:%d", AAA.m, a.m);
    }
}
