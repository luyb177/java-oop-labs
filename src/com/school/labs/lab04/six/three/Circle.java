package com.school.labs.lab04.six.three;

public class Circle extends Geometry {
    double r;

    Circle(double r) {
        this.r = r;
    }

   // 【代码2】
   @Override
   public double getArea() {
       return Math.PI * r * r;
   }
}