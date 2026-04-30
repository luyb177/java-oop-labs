package com.school.labs.lab02.eight;

import java.util.Scanner;
public class BaggageAndMoney {
    public static void main(String[] args) {
        int trainCharge=12;//火车托运计费:每公斤12元
        int carCharge=22;//汽车托运计费:每公斤12元
        double planeCharge=0.062;//飞机托运计费:每克0.062元
        Scanner reader= new Scanner(System.in);
        double weight,charge;
        System.out.print("输入行李重量:");
        weight = reader.nextDouble();
        System.out.printf("行李重量:%f公斤(kg) ",weight);
        System.out.printf("需要计费的重量:%d(kg) ",(int)weight);

        // 代码1 将表达式(int)weight*trainCharge的值赋值给charge
        charge = (int)weight*trainCharge;

        System.out.printf("用火车托运(%d元/kg),费用:%f元 ",trainCharge,charge);
        System.out.printf("需要计费的重量:%d(kg) ",(int)(weight+0.5));

        // 代码2 将表达式(int)(weight+0.5)*carCharge的值赋值给charge
        charge = (int)(weight+0.5)*carCharge;

        System.out.printf("用汽车托运(%d元/kg),费用:%f元 ",carCharge,charge);
        System.out.printf("行李重量:%f克(g) ",weight*1000);
        System.out.printf("需要计费的重量:%d(g) ",(int)(weight*1000+0.5));

        // 代码3 将表达式(int)(weight*1000+0.5)*planeCharge的值赋值给charge
        charge = (int)(weight*1000+0.5)*planeCharge;
        System.out.printf("用飞机托运(%f元/g),费用:%f元 ",planeCharge,charge);
    }
}
