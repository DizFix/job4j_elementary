package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
            return (ab + ac) > bc && (ac + bc) > ab && (ab + bc) > ac;
        }
    public static void main(String[] args) {
        Triangle.exist(2, 3, 5);
        Triangle.exist(3, 3, 5);
    }
}
