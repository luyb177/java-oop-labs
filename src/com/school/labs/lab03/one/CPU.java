package com.school.labs.lab03.one;

public class CPU {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int m) {
        speed = m;
    }

    // 重写 equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof CPU)) return false;
        CPU other = (CPU) obj;
        return this.speed == other.speed;
    }

    // 重写 toString
    @Override
    public String toString() {
        return "CPU speed=" + speed;
    }
}