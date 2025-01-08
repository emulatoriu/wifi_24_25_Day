package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {  // Infinite loop
            try {
                // Ask the user for input
                System.out.print("Enter a month number (1-12): ");
                int Month = scanner.nextInt();  // Attempt to read an integer

                // Print the corresponding month name
                System.out.println(MonthFinder(Month));
            } catch (Exception e) {
                // If a non-integer is entered, print the error message and exit
                System.out.println("exiting...");
                break;  // Exit the loop (and program)
            }
        }
        scanner.close();  // Close the scanner after exiting the loop
    }

    public static String MonthFinder(int MonthNumber) {
        String[] Months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        if (MonthNumber < 1 || MonthNumber > 12) {
            return "Invalid Month Number";
        } else {
            return Months[MonthNumber - 1];
        }
    }
}
