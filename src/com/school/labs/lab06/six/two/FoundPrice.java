package com.school.labs.lab06.six.two;

import java.util.*;

public class FoundPrice {
    public static void main(String args[]) {

        String s = "牛奶:89.8元，香肠:12.9元啤酒:69元巧克力:132元";

        String regex = "[^0123456789.]"; //匹配非数字的正则表达式

        String digitMess = s.replaceAll(regex, "*");

        StringTokenizer fenxi = new StringTokenizer(digitMess, "*"); //【代码1】

        int number = fenxi.countTokens(); //【代码2】

        double sum = 0;

        while (fenxi.hasMoreTokens()) {

            String str = fenxi.nextToken(); //【代码3】

            System.out.println(str);

            sum = sum + Double.parseDouble(str);
        }

        System.out.println("购物小票中的商品种类：" + number + "种");

        System.out.println("购物小票中的价格总额：" + sum + "元");
    }
}
