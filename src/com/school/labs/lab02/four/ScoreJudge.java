package com.school.labs.lab02.four;
import  java.util.Scanner;

public class ScoreJudge {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入学生成绩（0~100）：");
        int score = sc.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("输入无效");
        } else if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 80) {
            System.out.println("良好");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }

        sc.close();
    }
}
