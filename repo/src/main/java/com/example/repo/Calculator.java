package com.example.repo;

public class Calculator {
    // Метод сложения двух чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Вы можете добавить другие методы, например:
    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
}
