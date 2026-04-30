package com.school.labs.lab03.nine.two;

public class CD {
    int size;
    int[] content;

    public void setSize(int size) {
        this.size = size;
        content = new int[size];
    }

    public int getSize() {
        return size;
    }

    public int[] getContent() {
        return content;
    }

    public void setContent(int[] b) {
        int min = Math.min(content.length, b.length);
        System.arraycopy(b, 0, content, 0, min);
    }
}
