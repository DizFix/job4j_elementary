package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = x2 - x1;
        double second = y2 - y1;
        double step2first = Math.pow(first, 2);
        double step2second = Math.pow(second, 2);
        double sum = step2first + step2second;
        double rsl = Math.sqrt(sum);
        return rsl;
    }
    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point.distance(3, 3, 5, 7);
        System.out.println("result (3, 3) to (5, 5) " + result2);
    }
}
