package com.school.labs.lab02.two;

public class SeriesSumFor {
    public static  void main(){
        double sum = 0.0;
        long factorial = 1;

        for (int i = 1; i <= 20; i++){
            factorial *= i;
            sum += 1.0 / factorial;
        }
        System.out.println("1/1! + 1/2! + ... + 1/20! = " + sum);
    }
}
