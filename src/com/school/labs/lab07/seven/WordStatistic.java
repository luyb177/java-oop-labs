package com.school.labs.lab07.seven;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class WordStatistic {

    Vector<String> allWord, noSameWord;
    File file = new File("src/com/school/labs/lab07/seven/english.txt");
    Scanner sc = null;
    String regex;

    WordStatistic() {

        allWord = new Vector<String>();
        noSameWord = new Vector<String>();

        // regex是由空格、数字和符号组成的正则表达式
        regex = "[\\s\\d\\p{Punct}]+";

        try {

            // 【代码1】
            sc = new Scanner(file);

            // 【代码2】
            sc.useDelimiter(regex);

        } catch (IOException exp) {

            System.out.println(exp.toString());
        }
    }

    void setFileName(String name) {

        file = new File(name);

        try {

            sc = new Scanner(file);
            sc.useDelimiter(regex);

        } catch (IOException exp) {

            System.out.println(exp.toString());
        }
    }

    public void wordStatistic() {

        try {

            while (sc.hasNext()) {

                String word = sc.next();

                allWord.add(word);

                if (!noSameWord.contains(word))
                    noSameWord.add(word);
            }

        } catch (Exception e) {
        }
    }

    public Vector<String> getAllWord() {
        return allWord;
    }

    public Vector<String> getNoSameWord() {
        return noSameWord;
    }
}