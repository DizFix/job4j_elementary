package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first > second ? first : second;
        int result1 = result > third ? result : third;
        return result1;
    }
    public static void main(String[] args) {
        int msg = MultiMax.max(17, 16, 16);
        System.out.println(msg);
    }
}
