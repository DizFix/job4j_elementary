package ru.job4j.calculator;

public class fit {
    public static double manWeight(short height) {
        double rsl = (height - 100)*1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110)*1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = fit.manWeight(height);
        System.out.println("Man 187 is " + man);
        double woman = fit.womanWeight(height);
        System.out.println("Woman 187 is " + woman);
    }

}
