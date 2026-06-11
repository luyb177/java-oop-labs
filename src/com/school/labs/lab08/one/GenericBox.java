package com.school.labs.lab08.one;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericBox<T> {
    private T item;

    public void add(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }

    @Override
    public String toString() {
        return "GenericBox[" + item + "]";
    }

    public static void main(String[] args) {
        ArrayList<GenericBox<String>> boxes = new ArrayList<>();

        boxes.add(new GenericBox<>());
        boxes.get(0).add("Hello");

        boxes.add(new GenericBox<>());
        boxes.get(1).add("World");

        boxes.add(new GenericBox<>());
        boxes.get(2).add("Java");

        System.out.println("使用迭代器遍历所有 GenericBox 内容:");
        Iterator<GenericBox<String>> iter = boxes.iterator();
        while (iter.hasNext()) {
            GenericBox<String> box = iter.next();
            System.out.println(box.get());
        }
    }
}
