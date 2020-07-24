package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first > second ? first : second;
        return result > third ? result : third;
    }
    public static void main(String[] args) {
        int msg = MultiMax.max(17, 16, 16);
        System.out.println(msg);
    }
}
