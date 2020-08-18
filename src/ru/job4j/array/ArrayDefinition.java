package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Chak Norris";
        names[1] = "Jacky Chan";
        names[2] = "Vladimir Putin";
        names[3] = "Alexander Reva";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        String name = names[3];
        System.out.println(name);
    }
}
