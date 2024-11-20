package com.example.repo;

/**
 * Класс Calculator предоставляет методы для выполнения базовых арифметических операций.
 */
public final class Calculator {

    /**
     * Метод сложения двух чисел.
     *
     * @param a первое число
     * @param b второе число
     * @return результат сложения a и b
     */
    public final int add(final int a, final int b) {
        return a + b;
    }

    /**
     * Метод вычитания второго числа из первого.
     *
     * @param a первое число
     * @param b второе число
     * @return результат вычитания b из a
     */
    public final int subtract(final int a, final int b) {
        return a - b;
    }

    /**
     * Метод умножения двух чисел.
     *
     * @param a первое число
     * @param b второе число
     * @return результат умножения a и b
     */
    public final int multiply(final int a, final int b) {
        return a * b;
    }

    /**
     * Метод деления первого числа на второе.
     *
     * @param a первое число
     * @param b второе число
     * @return результат деления a на b
     * @throws ArithmeticException если b равно нулю
     */
    public final int divide(final int a, final int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
}
