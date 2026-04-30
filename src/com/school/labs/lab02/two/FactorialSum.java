package com.school.labs.lab02.two;

public class FactorialSum {
    public static void main() {
        long sum = 0;
        long factorial = 1;
        // for 循环
        for (int i = 1; i <= 20; i++){
            factorial *= i;
            sum += factorial;
        }

        // while 循环
        long sum2 = 0;
        long factorial2 = 1;
        int i = 1;
        while (i <= 20) {
            factorial2 *= i;
            sum2 += factorial2;
            i++;
        }
        System.out.println("1! + 2! + ... + 20! = " + sum);
        System.out.println("1! + 2! + ... + 20! = " + sum2);
    }
}
