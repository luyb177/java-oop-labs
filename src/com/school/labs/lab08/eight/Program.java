package com.school.labs.lab08.eight;

import java.time.LocalDateTime;

public class Program implements Comparable<Program> {
    LocalDateTime time = null;
    String name;

    Program(String name, LocalDateTime time) {
        this.name = name;
        this.time = time;
    }

    public int compareTo(Program b) {
        return time.compareTo(b.getLocalDateTime());
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getLocalDateTime() {
        return time;
    }
}
