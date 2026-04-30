package com.school.labs.lab04.six.one;

public class BeijingPeople extends ChinaPeople {
    // 【代码4】
    @Override
    public void averageHeight() {
        height = 172.5;
        System.out.println("北京人的平均身高:" + height + "厘米");
    }

    // 【代码5】
    @Override
    public void averageWeight() {
        weight = 70;
        System.out.println("北京人的平均体重:" + weight + "公斤");
    }

    public void beijingOpera() {
        System.out.println("花脸、青衣、花旦和老生");
    }
}