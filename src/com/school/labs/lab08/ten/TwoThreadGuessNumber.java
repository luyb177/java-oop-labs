package com.school.labs.lab08.ten;

public class TwoThreadGuessNumber {
    public static void main(String args[]) {
        Number number = new Number();
        number.giveNumberThread.start();
        number.guessNumberThread.start();
    }
}
