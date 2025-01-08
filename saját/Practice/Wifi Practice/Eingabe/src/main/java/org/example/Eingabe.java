package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Eingabe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> zahlenListe = new ArrayList<>();
        String eingabe;

        System.out.println("Geben Sie Zahlen ein, um den Durchschnitt zu berechnen. Geben Sie 'fertig' ein, um die Eingabe zu beenden.");

        while (true) {
            System.out.print("Bitte eine Zahl eingeben: ");
            eingabe = scanner.nextLine();

            if (eingabe.equalsIgnoreCase("fertig")) {
                break;
            }

            try {
                double zahl = Double.parseDouble(eingabe);
                zahlenListe.add(zahl);
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine gültige Zahl ein.");
            }
        }

        if (zahlenListe.isEmpty()) {
            System.out.println("Es wurden keine Zahlen eingegeben. Der Durchschnitt kann nicht berechnet werden.");
        } else {
            double summe = 0;
            for (double zahl : zahlenListe) {
                summe += zahl;
            }
            double durchschnitt = summe / zahlenListe.size();
            System.out.println("Der Durchschnitt der eingegebenen Zahlen ist: " + durchschnitt);
        }

        scanner.close();
    }
}
