package com.gaweljablonski;

import java.util.Random;
import java.util.Scanner;

public class ZgadnijLiczbę {

    public static void main(String[] args) {

        System.out.println("GRA - zgadnij liczbę :)");

        System.out.println("Podaj zakres Liczbowy:");
        Scanner scanner1 = new Scanner(System.in);
        int rangeLos = scanner1.nextInt();

        System.out.println("LOSOWANIE LICZBY...");
        Random random = new Random();
        int numberToGuess = random.nextInt(rangeLos) + 1;

        Scanner scanner = new Scanner(System.in);

        boolean wasNumberGuessed = false;
        while (!wasNumberGuessed) {
            System.out.println("Podaj liczbę:");
            int userNumber = scanner.nextInt();
            if (userNumber < numberToGuess){
                System.out.println("Podana liczba jest za mała.");
            }
            else if (userNumber > numberToGuess){
                System.out.println("Podana liczba jest za duża.");
            }
            else if (userNumber == numberToGuess){
                System.out.println("BRAWO! Odgadłeś liczbę!");
                wasNumberGuessed = true;
            }
        }

    }
}
