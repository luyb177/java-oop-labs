package com.school.labs.lab05.Test.one;

// RedCowForm.java
public class School {
    String schoolName;
    InnerNewsPaper newsPaper; // 【代码1】内部类声明对象newsPaper

    School() {
        this("某某大学"); // 调用带参数的构造方法
    }

    School(String s) {
        newsPaper = new InnerNewsPaper(); // 【代码2】创建对象newsPaper
        String[] content = {
                "学校举办迎新会.",
                "机械系获得机器人大赛冠军.",
                "计算机学院召开学生会换届大会."
        };
        schoolName = s;
        newsPaper.setContent(content);
    }

    public void showNews() {
        newsPaper.showContent();
    }

    class InnerNewsPaper {
        String[] content;
        String paperName = "校新闻周报";

        void setContent(String[] s) {
            content = s;
        }

        public void showContent() {
            System.out.println(schoolName);
            for (String s : content) {
                System.out.println(s);
            }
        }
    }
}