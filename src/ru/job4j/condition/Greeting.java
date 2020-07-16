package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        String p = " ";
        idea = idea + p + "But I am a newbie";
        int year = 2020;
        idea = idea + p + year;
        System.out.println(idea);
    }
}
