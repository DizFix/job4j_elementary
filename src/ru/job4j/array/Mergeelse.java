package ru.job4j.array;

public class Mergeelse {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int positionA1 = 0;
        int positionA2 = 0;

        for (int i = 0; i < rsl.length; i++) {
            if (positionA1 == left.length) {
                rsl[i] = right[positionA2];
                positionA2++;
            } else if (positionA2 == right.length) {
                rsl[i] = left[positionA1];
                positionA1++;
            } else if (left[positionA1] < right[positionA2]) {
                rsl[i] = left[positionA1];
                positionA1++;
            } else {
                rsl[i] = right[positionA2];
                positionA2++;
            }
        }
        return rsl;
    }
}