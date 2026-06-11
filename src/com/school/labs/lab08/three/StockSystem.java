package com.school.labs.lab08.three;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class StockSystem {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, Integer> stock = new ConcurrentHashMap<>();
        stock.put("A001", 100);
        stock.put("A002", 100);
        stock.put("A003", 100);
        stock.put("A004", 100);

        System.out.println("初始库存: " + stock);

        ExecutorService pool = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            final int threadId = i;
            pool.execute(() -> {
                String[] ids = {"A001", "A002", "A003", "A004"};
                for (String id : ids) {
                    // 购买5件
                    for (int j = 0; j < 5; j++) {
                        stock.computeIfPresent(id, (k, v) -> {
                            if (v > 0) return v - 1;
                            return v;
                        });
                    }
                }
                System.out.println("线程" + threadId + " 完成购买操作");
            });
        }

        pool.shutdown();
        pool.awaitTermination(10, TimeUnit.SECONDS);

        System.out.println("\n最终剩余库存: " + stock);
    }
}
