package com.school.labs.lab02.two;
import java.util.Scanner;

public class GcdLcm {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个正整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个正整数：");
        int b = sc.nextInt();
        sc.close();

        // 辗转相除法
        int x = a, y = b;
        // 当余数为 0 时，x 就是最大公约数
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        int gcd = x;
        int lcm = a * b / gcd;
        System.out.println("最大公约数：" + gcd);
        System.out.println("最小公倍数：" + lcm);
    }
}
