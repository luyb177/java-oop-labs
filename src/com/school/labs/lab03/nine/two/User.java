package com.school.labs.lab03.nine.two;

public class User {
    public static void main() {
        CD dataCD = new CD();
        int[] b = {1,2,3,4,5,6,7,8};

        dataCD.setSize(b.length);
        dataCD.setContent(b);

        int[] a = dataCD.getContent();
        System.out.println("dataCD上的内容：");
        for (int j : a) System.out.printf("%3d", j);

        Computer computerIMB = new Computer();

        // 【代码1】
        computerIMB.putCD(dataCD);

        System.out.println(" 将dataCD的数据复制到计算机:computerIMB.");

        // 【代码2】
        computerIMB.copyToComputer();

        System.out.println("computerIMB上的内容：");
        computerIMB.showData();

        int m = 12;
        System.out.println(" computerIMB将每个数据增加" + m);

        computerIMB.addData(m);

        System.out.println("computerIMB将增值后的数据复制到CD:dataCD");

        // 【代码3】
        computerIMB.copyToCD();

        System.out.println("dataCD上的内容：");
        a = dataCD.getContent();

        for (int j : a) System.out.printf("%3d", j);
    }
}