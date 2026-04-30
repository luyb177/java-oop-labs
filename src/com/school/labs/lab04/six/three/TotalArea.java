package com.school.labs.lab04.six.three;

public class TotalArea {
    Geometry[] tuxing;
    double totalArea = 0;

    public void setTuxing(Geometry[] t) {
        tuxing = t;
    }

    public double computerTotalArea() {
        //【代码3】
        for (Geometry geometry : tuxing) {
            totalArea += geometry.getArea();
        }
        return totalArea;
    }
}