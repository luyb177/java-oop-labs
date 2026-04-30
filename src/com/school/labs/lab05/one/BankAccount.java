package com.school.labs.lab05.one;

// 自定义异常
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// 外部类
public class BankAccount {
    private double balance; // 账户余额

    // 构造方法
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // 对外提供事务处理方法
    public void processTransaction(double amount, String type) {
        Transaction t = new Transaction(amount, type);
        try {
            t.execute();
        } catch (InsufficientFundsException e) {
            System.out.println("异常：" + e.getMessage());
        }
    }

    // 成员内部类
    class Transaction {
        private double amount;
        private String type; // "deposit" 或 "withdraw"

        public Transaction(double amount, String type) {
            this.amount = amount;
            this.type = type;
        }

        public void execute() throws InsufficientFundsException {
            if (type.equals("deposit")) {
                balance += amount;
                System.out.println("存款成功：" + amount);
            } else if (type.equals("withdraw")) {
                if (amount > balance) {
                    throw new InsufficientFundsException("余额不足！");
                }
                balance -= amount;
                System.out.println("取款成功：" + amount);
            } else {
                System.out.println("未知操作类型");
            }

            System.out.println("当前余额：" + balance);
        }
    }
}