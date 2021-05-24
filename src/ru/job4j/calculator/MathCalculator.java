package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double substractAndDiv(double first, double second) {
        return subtraction(first, second)
                + division(first, second);
    }
    public static double sumAll(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + subtraction(first, second)
                + division(first, second);
    }
    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Разность двух чисел и деление двух чисел: " + substractAndDiv(10, 20));
        System.out.println("Сумма вычисления всех четырех операций: " + sumAll(10, 20));
    }
}