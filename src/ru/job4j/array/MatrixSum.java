package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        int[] second;
        for (int row = 0; row < array.length; row++) {
            second = array[row];
            for (int cell = 0; cell < second.length; cell++) {
                rsl = rsl + array[row][cell];
                /* loops */
            }
        }
        return rsl;
    }
}