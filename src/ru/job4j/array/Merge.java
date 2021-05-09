package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            rsl[i] = left[i];
            count++;
        }
        for (int j = 0; j < right.length; j++) {
            rsl[count] = right[j];
            count++;
        }
        for (int h = 0; h < rsl.length; h++) {
            int min = MinDiapason.findMin(rsl, h, rsl.length - 1);
            int index = FindLoop.indexOf(rsl, min, h, rsl.length - 1);
            int temp = rsl[h];
            rsl[h] = rsl[index];
            rsl[index] = temp;
        }
        return rsl;
    }
}
