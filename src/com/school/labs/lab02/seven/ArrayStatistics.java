package com.school.labs.lab02.seven;

public class ArrayStatistics {
    public static void main() {
        int[] arr = {10, -5, 0, 23, -8, 0, 15, -2, 7};

        int positiveCount = 0; // 正数个数
        int negativeCount = 0; // 负数个数
        int zeroCount = 0;     // 零的个数
        int positiveSum = 0;   // 正数的和

        for (int j : arr) {
            if (j > 0) {
                positiveCount++;
                positiveSum += j;
            } else if (j < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("数组元素：");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

        System.out.println("统计结果：");
        System.out.println("正数个数：" + positiveCount);
        System.out.println("负数个数：" + negativeCount);
        System.out.println("零的个数：" + zeroCount);
        System.out.println("正数的总和：" + positiveSum);
    }
}
