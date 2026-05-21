package com.school.labs.lab06.two;

public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        // 循环拼接 1 到 1000
        for (int i = 1; i <= 1000; i++) {
            sb.append(i);

            // 最后一个数字后面不加逗号
            if (i != 1000) {
                sb.append(",");
            }
        }

        // 转换为字符串
        String result = sb.toString();

        // 输出拼接结果
        System.out.println(result);

        // 输出总字符长度
        System.out.println("总字符长度：" + result.length());
    }
}
