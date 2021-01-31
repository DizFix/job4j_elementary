package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int index = 0; index < table.length; index++) {
            for (int second = 0; second < table.length; second++) {
            table[index][second] = (index + 1) * (second + 1);
            }
        }
        return table;
    }
}