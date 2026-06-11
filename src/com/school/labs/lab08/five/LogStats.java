package com.school.labs.lab08.five;

import java.util.*;
import java.util.concurrent.*;

public class LogStats {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // 模拟日志数据
        List<String> logs = generateLogs();

        ExecutorService pool = Executors.newFixedThreadPool(4);

        // 任务1：统计总行数
        Callable<Integer> countLines = () -> logs.size();

        // 任务2：统计包含"error"的行数
        Callable<Long> countErrors = () ->
                logs.stream().filter(line -> line.toLowerCase().contains("error")).count();

        // 任务3：最长字符串长度
        Callable<Integer> maxLength = () ->
                logs.stream().mapToInt(String::length).max().orElse(0);

        // 任务4：重复字符串次数
        Callable<Long> countDuplicates = () -> {
            Set<String> seen = new HashSet<>();
            Set<String> duplicates = new HashSet<>();
            for (String line : logs) {
                if (!seen.add(line)) {
                    duplicates.add(line);
                }
            }
            return (long) duplicates.size();
        };

        Future<Integer> futureLines = pool.submit(countLines);
        Future<Long> futureErrors = pool.submit(countErrors);
        Future<Integer> futureMaxLen = pool.submit(maxLength);
        Future<Long> futureDups = pool.submit(countDuplicates);

        pool.shutdown();
        pool.awaitTermination(10, TimeUnit.SECONDS);

        System.out.println("===== 日志数据统计结果 =====");
        System.out.println("总行数: " + futureLines.get());
        System.out.println("包含 'error' 的行数: " + futureErrors.get());
        System.out.println("最长字符串长度: " + futureMaxLen.get());
        System.out.println("重复字符串种数: " + futureDups.get());
    }

    private static List<String> generateLogs() {
        List<String> logs = new ArrayList<>();
        String[] levels = {"INFO", "WARN", "ERROR", "DEBUG"};
        Random rand = new Random();

        for (int i = 0; i < 1000; i++) {
            String level = levels[rand.nextInt(levels.length)];
            String msg = "Log-" + i + " [" + level + "] message " + rand.nextInt(50);
            logs.add(msg);
        }
        // 故意添加重复
        for (int i = 0; i < 50; i++) {
            logs.add(logs.get(i));
        }
        return logs;
    }
}
