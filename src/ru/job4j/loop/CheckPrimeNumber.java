package ru.job4j.loop;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        check(6);
        check(5);
    }

    public static boolean check(int number) {
        boolean prime = true;
        for (int count = 2; count < number; count++) {
            if (number % count == 0) {
                prime = false;
                break;
                return prime;
            }
        }
    }
}