package com.school.labs.lab02.two;

public class RussianAlphabet {
    public static void main() {
        // 俄文有33个字母
        // 大写
        System.out.println("俄文大写字母：");
        for (int i = 0; i < 32; i++) {
            System.out.printf("%c ", (char)('А' + i));
        }
        System.out.println("\n俄文小写字母：");
        for (int i = 0; i < 32; i++) {
            System.out.printf("%c ", (char) ('а' + i));
        }
    }
}
