package com.school.labs.lab02.six;

public class ArrayBasicDemo {
    public static void main() {
        // 1. 创建数组并赋值
        int[] arr = {12, 25, 7, 30, 18, 9};

        // 2. 输出数组元素
        System.out.println("数组元素：");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 3 求和与平均值
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double avg = (double) sum / arr.length;
        System.out.println("数组元素的和为：" + sum);
        System.out.println("数组元素的平均值为：" + avg);

        // 4. 查找最大值和最小值
        int max = arr[0];
        int min = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("数组元素的最大值为：" + max);
        System.out.println("数组元素的最小值为：" + min);
    }
}
