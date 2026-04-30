package com.school.labs.lab02.two;

public class PerfectNumber {
    public static void main() {
        System.out.println("1000以内的完数有：");
        int num =1;

        // while 循环
        while(num <= 1000){
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0 ) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.print(num + " ");
            }

            num++;
        }
    }
}
