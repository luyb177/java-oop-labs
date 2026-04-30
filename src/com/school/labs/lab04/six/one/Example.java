package com.school.labs.lab04.six.one;

public class Example {
    public static void main(String[] args) {
        ChinaPeople chinaPeople = new ChinaPeople();
        AmericanPeople americanPeople = new AmericanPeople();
        BeijingPeople beijingPeople = new BeijingPeople();

        // 测试打招呼
        chinaPeople.speakHello();
        americanPeople.speakHello();
        beijingPeople.speakHello();

        // 测试身高
        chinaPeople.averageHeight();
        americanPeople.averageHeight();
        beijingPeople.averageHeight();

        // 测试体重
        chinaPeople.averageWeight();
        americanPeople.averageWeight();
        beijingPeople.averageWeight();

        // 测试特有技能
        chinaPeople.chinaGongfu();
        americanPeople.americanBoxing();
        beijingPeople.beijingOpera();

        // 北京人继承自中国人，所以也会功夫
        beijingPeople.chinaGongfu();
    }
}