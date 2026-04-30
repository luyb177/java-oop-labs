package com.school.labs.lab02.ten;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main() {
        Scanner reader=new Scanner(System.in);
        Random random=new Random();
        System.out.println("给你一个1至100之间的整数,请猜测这个数");
        int realNumber=random.nextInt(100)+1; //random.nextInt(100)是[0,100)中的随机整数
        int yourGuess=0;
        System.out.print("输入您的猜测:");
        yourGuess=reader.nextInt();

        // 代码1 循环条件
        while (yourGuess != realNumber) {
            // 代码2 猜大了的条件代码
            if (yourGuess > realNumber){
                System.out.print("猜大了,再输入你的猜测:");
                yourGuess=reader.nextInt();
            } else if (yourGuess < realNumber) { // 代码3 猜小了的条件代码
                System.out.print("猜小了,再输入你的猜测:");
                yourGuess=reader.nextInt();
            }
        }
        System.out.println("猜对了!");
    }
}
