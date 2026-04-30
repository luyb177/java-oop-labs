package com.school.labs.lab02.two;

public class PrimeNumbers {
    public static void main() {
        System.out.println("100以内的素数有：");
        for (int num = 2; num < 100; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
