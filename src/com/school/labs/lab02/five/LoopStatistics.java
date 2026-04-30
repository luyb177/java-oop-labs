package com.school.labs.lab02.five;

public class LoopStatistics {
    public static void main() {
        // for 循环
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            sum += i;
        }
        System.out.println("1~100之间的偶数和为：" + sum);

        // while 循环
        int count = 0;
        int num = 1;
        while (num <= 100) {
            if (num % 7 == 0) {
                count++;
            }
            num++;
        }
        System.out.println("1~100之间能被7整除的数的个数为：" + count);
    }
}
