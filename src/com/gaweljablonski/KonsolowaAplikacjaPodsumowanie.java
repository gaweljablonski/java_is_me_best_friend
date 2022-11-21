package com.gaweljablonski;

import java.util.Scanner;

public class KonsolowaAplikacjaPodsumowanie {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean schouldContinue = true;

        Party party = new Party();

        while (schouldContinue){
            System.out.println("Wybierz opcję:");
            System.out.println();
            System.out.println("1. Wyświetl gości");
            System.out.println("2. Dodaj gościa");
            System.out.println("3. Wyświetl potrawy");
            System.out.println("4. Wyświetl gościa po numerze telefonu");
            System.out.println("5. Wyjście");
            System.out.println(":");

            int userChoise = scanner.nextInt();

            switch (userChoise) {
                case 1 -> party.displayGuest();
                case 2 -> party.addGuest();
                case 3 -> party.displayMeals();
                case 4 -> party.displayGuestByPhoneNumber();
                case 5 -> schouldContinue = false;
            }
        }
    }
}
