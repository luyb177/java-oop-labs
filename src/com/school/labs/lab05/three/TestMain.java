package com.school.labs.lab05.three;

public class TestMain {
    public static void main(String[] args) {
        Library library = new Library();
        Library.BookLender lender = library.new BookLender();
        try {
            // 正常借书
            lender.borrowBook("Java");

            // 重复借阅（触发 DuplicateLoanException）
            lender.borrowBook("Java");

        } catch (DuplicateLoanException e) {
            System.out.println("重复借阅异常：" + e.getMessage());
        } catch (BookNotFoundException e) {
            System.out.println("图书不存在异常：" + e.getMessage());
        }

        try {
            // 借不存在的书（触发 BookNotFoundException）
            lender.borrowBook("Go");

        } catch (DuplicateLoanException e) {
            System.out.println("重复借阅异常：" + e.getMessage());
        } catch (BookNotFoundException e) {
            System.out.println("图书不存在异常：" + e.getMessage());
        }
    }
}