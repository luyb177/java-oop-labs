package com.school.labs.lab08.four;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerDemo {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);

        // 生产者：生成1到100的随机数
        Thread producer = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                try {
                    int num = (int) (Math.random() * 100) + 1;
                    queue.put(num);
                    System.out.println("生产者 放入: " + num + " (队列大小: " + queue.size() + ")");
                    Thread.sleep((int) (Math.random() * 300));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Producer");

        // 消费者：取出并计算平方
        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                try {
                    int num = queue.take();
                    System.out.println("消费者 取出: " + num + " → 平方=" + (num * num));
                    Thread.sleep((int) (Math.random() * 500));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Consumer");

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();

        System.out.println("\n生产者消费者任务完成!");
    }
}
