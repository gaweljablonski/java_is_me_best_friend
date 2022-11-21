package com.gaweljablonski;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        int los;
        int odp;
        int rangeLos;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zakres liczbowy:");
        rangeLos = scanner.nextInt();
        los = random.nextInt(rangeLos) + 1;


        System.out.println("Zgadnij liczbę od 1 do " + rangeLos + "!");

        do{
            i++;
            System.out.print("Podaj Liczbe: ");
            odp = scanner.nextInt();
            if(odp >los){
                System.out.println("Niestety nie zgadłeś! Moja liczba jest mniejsza");
            }else if(odp < los){
                System.out.println("Niestery nie zgadłeś!  Moja liczba jest większa!");
            }
        }while (odp != los);
        System.out.println("Brawo odgadłeś liczbę za " + i + " razem");

    }
}
