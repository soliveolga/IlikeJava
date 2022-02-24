package com.like.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ввести сюда текст из задания:");  // I like Java!!!
        String string = input.nextLine();

        boolean result1;
        boolean result2;
        boolean result3;

        String Java = "Java";
        System.out.println("Текст выше содержит слово Java:");
        result1 = string.contains(Java);   // пункт 1
        System.out.println(result1);

        System.out.println("Текст выше начинается с I like:");
        result2 = string.startsWith("I like");  // пункт 2
        System.out.println(result2);

        System.out.println("Текст выше заканчивается !!!");
        result3 = string.endsWith("!!!");   // пункт 3
        System.out.println(result3);

        if (result1 == result2 == result3) {
            System.out.println("Все наши условия верны, поэтому");
            System.out.println(string.toUpperCase());  // пункт 4
        }

        String replace= string.replace ('a', 'o');   //пункт 5
        System.out.println(replace.substring(7, 11));

    }
}