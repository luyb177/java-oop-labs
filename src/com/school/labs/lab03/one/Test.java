package com.school.labs.lab03.one;

public class Test {
    public static void main(String[] args) {

        // 创建 CPU
        CPU cpu = new CPU();
        cpu.setSpeed(2200);

        // 创建 HardDisk
        HardDisk disk = new HardDisk();
        disk.setAmount(200);

        // 创建 PC
        PC pc = new PC();

        // 设置 CPU
        pc.setCPU(cpu);

        // 设置 HardDisk
        pc.setHardDisk(disk);

        // 输出
        pc.show();

        // equals 测试
        CPU cpu2 = new CPU();
        cpu2.setSpeed(2200);

        System.out.println(cpu.equals(cpu2));

        // toString 测试
        System.out.println(cpu);
    }
}