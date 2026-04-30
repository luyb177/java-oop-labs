package com.school.labs.lab02.one;

public class UnicodeDemo {
    public static void main() {
        char [] chars = {'你','我','他'};
        for (char ch : chars) {
            System.out.printf("汉字%cde Unicode编码为： %d\n", ch, (int)ch);
        }
    }
}
