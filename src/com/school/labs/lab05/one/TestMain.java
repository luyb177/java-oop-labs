package com.school.labs.lab05.one;


public class TestMain {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        // 存款
        account.processTransaction(500, "deposit");

        // 正常取款
        account.processTransaction(300, "withdraw");

        // 触发异常（余额不足）
        account.processTransaction(2000, "withdraw");
    }
}