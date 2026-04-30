package com.school.labs.lab02.two;

public class MaxN {
    public static void main() {
        long sum = 0;
        long factorial = 1;
        int num = 1;
        while (true) {
            factorial *= num;
            sum += factorial;
            if (sum > 9999) {
                System.out.println("当n = " + num + "时，1! + 2! + ... + n! 的值首次超过9999");
                break;
            }
            num++;
        }
    }
}
