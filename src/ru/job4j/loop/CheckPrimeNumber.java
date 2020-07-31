package ru.job4j.loop;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        check(6);
        check(5);
        check(1);
    }

    public static boolean check(int number) {
        boolean prime = true;
        for (int count = 2; count < number; count++) {
            if (number % count == 0) {
                prime = false;
                break;
            }
        }
        if (prime == true) {
            System.out.println(number + " " + "является простым числом");
        } else {
            System.out.println(number + " " + "не является простым числом");
        }
        return prime;
    }
}