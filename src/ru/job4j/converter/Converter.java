package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(280);
        System.out.println("280 rubles are " + euro + " euro.");
        int usd = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + usd + " usd.");
    }
}
