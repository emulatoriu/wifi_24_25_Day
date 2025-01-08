package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Verschiedene Namen
        String[] names = {"Marcell", "", "John", "Maria"};


        String greeting = "";
        for (String name : names) {
            if (name.equals("")) {
                greeting = "Hello!";
            } else {
                greeting = String.format("Hallo, %s!", name);
            }
            System.out.println(greeting);
        }
    }
}

