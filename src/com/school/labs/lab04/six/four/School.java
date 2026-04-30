package com.school.labs.lab04.six.four;

public class School implements CompurerAverage {
    //【代码1】
    @Override
    public double average(double[] x) {
        double sum = 0;
        for (double v : x) {
            sum += v;
        }
        return sum / x.length;
    }
}