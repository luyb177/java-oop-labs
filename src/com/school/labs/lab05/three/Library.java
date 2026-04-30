package com.school.labs.lab05.three;

import java.util.*;

// 自定义异常1：图书不存在
class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}

// 自定义异常2：重复借阅
class DuplicateLoanException extends Exception {
    public DuplicateLoanException(String message) {
        super(message);
    }
}

// 外部类
public class Library {
    private List<String> books = new ArrayList<>();     // 所有图书
    private Set<String> borrowed = new HashSet<>();     // 已借出的书

    // 构造方法初始化一些书
    public Library() {
        books.add("Java");
        books.add("Python");
        books.add("C++");
    }

    // 成员内部类：处理借阅逻辑
    class BookLender {
        // 借书
        public void borrowBook(String name) throws BookNotFoundException, DuplicateLoanException {
            if (!books.contains(name)) {
                throw new BookNotFoundException("图书不存在：" + name);
            }

            if (borrowed.contains(name)) {
                throw new DuplicateLoanException("该书已被借出：" + name);
            }

            borrowed.add(name);
            System.out.println("借阅成功：" + name);
        }

        // 还书
        public void returnBook(String name) {
            if (borrowed.remove(name)) {
                System.out.println("归还成功：" + name);
            } else {
                System.out.println("该书未被借出：" + name);
            }
        }
    }
}