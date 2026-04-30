package com.school.labs.lab03.nine.two;

public class Computer {
    int[] data;
    CD includeCD;

    public void putCD(CD cd) {
        includeCD = cd;
        int size = includeCD.getSize();
        data = new int[size];
    }

    void copyToComputer() {
        int[] b = includeCD.getContent();
        int min = Math.min(data.length, b.length);
        System.arraycopy(b, 0, data, 0, min);
    }

    public void addData(int m) {
        for (int i = 0; i < data.length; i++) {
            data[i] = data[i] + m;
        }
    }

    void copyToCD() {
        includeCD.setContent(data);
    }

    void showData() {
        for (int datum : data) {
            System.out.printf("%3d", datum);
        }
    }
}