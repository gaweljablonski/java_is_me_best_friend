package com.gaweljablonski;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int botChoise;
        int userChoise;
        boolean wantToContinueBoolean;
        wantToContinueBoolean = true;

        while (wantToContinueBoolean) {
            int wantToContinueInt;
            System.out.println("Czy chcesz kontynuować?");
            System.out.println("1 - Tak");
            System.out.println("2 - Nie");

            wantToContinueInt = scanner.nextInt();

            if(wantToContinueInt == 1) {
                botChoise = random.nextInt(3) + 1;
                System.out.println();
                System.out.println("Gra w Kamień Papier Norzyce!");
                System.out.println("1...");
                System.out.println("2...");
                System.out.println("3...");
                System.out.println("");
                System.out.println("1 - kamień");
                System.out.println("2 - papier");
                System.out.println("3 - norzyce");
                System.out.println("Wybierz: ");

                userChoise = scanner.nextInt();

                if (userChoise == 1 && botChoise == 1) {
                    System.out.println("wybrałeś kamien");
                    System.out.println("Bot wybrał kamien");
                    System.out.println("REMIS");
                } else if (userChoise == 2 && botChoise == 1) {
                    System.out.println("wybrłeś papier");
                    System.out.println("Bot wybrał kamien");
                    System.out.println("WYGRAŁEŚ");
                } else if (userChoise == 3 && botChoise == 1) {
                    System.out.println("wyrbrałeś norzyce");
                    System.out.println("Bot wybrał kamien");
                    System.out.println("PRZEGRAŁEŚ");
                } else if (userChoise == 1 && botChoise == 2) {
                    System.out.println("wybrałeś kamien");
                    System.out.println("Bot wybrał papier");
                    System.out.println("PRZEGRAŁEŚ");
                } else if (userChoise == 2 && botChoise == 2) {
                    System.out.println("wybrłeś papier");
                    System.out.println("Bot wybrał papier");
                    System.out.println("REMIS");
                } else if (userChoise == 3 && botChoise == 2) {
                    System.out.println("wyrbrałeś narzyce");
                    System.out.println("Bot wybrał papier");
                    System.out.println("WYGRAŁEŚ");
                } else if (userChoise == 1 && botChoise == 3) {
                    System.out.println("wybrałeś kapien");
                    System.out.println("Bot wybrał norzyce");
                    System.out.println("WYGRAŁEŚ");
                } else if (userChoise == 2 && botChoise == 3) {
                    System.out.println("wybrłeś papier");
                    System.out.println("Bot wybrał norzyce");
                    System.out.println("PRZEGRAŁEŚ");
                } else if (userChoise == 3 && botChoise == 3) {
                    System.out.println("wybrłeś norzyce");
                    System.out.println("Bot wybrał norzyce");
                    System.out.println("REMIS");
                }
            }else if(wantToContinueInt == 2){
                wantToContinueBoolean = false;
            }else {
                break;
            }
        }
    }

}
