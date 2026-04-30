package com.school.labs.lab04.six.three;

public class Rect extends Geometry {
    double a, b;

    Rect(double a, double b) {
        this.a = a;
        this.b = b;
    }

   // 【代码1】
   @Override
   public double getArea() {
       return a * b;
   }
}