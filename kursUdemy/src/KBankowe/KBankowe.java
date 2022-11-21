package KBankowe;

import java.util.Scanner;


public class KBankowe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean czyKontynuowac = true;
        String haslo = "48395";

        Funkcje funkcje = new Funkcje();


        while (czyKontynuowac){
            System.out.println();
            System.out.println("1. Stwórz konto Zwykłe");
            System.out.println("2. Wyświetl użytkowników");
            System.out.println("3. Wyświetl numer konta po IMIENIU");
            System.out.println("4. Wyświetl informacje o koncie po numerze konta - (ID)");
            System.out.println("5. Wpłać");
            System.out.println("6. Wypłać");
            System.out.println("7. Zaloguj");
            System.out.println("8. Wyjście");
            System.out.print("Wybierz opcje: ");



            int userChoise = scanner.nextInt();

            switch (userChoise){
                case 1 -> funkcje.tworzeniaKonta();
                case 2 -> funkcje.wyswietlInformacje();
                case 3 -> funkcje.numerKontaPoImieniu();
                case 4 -> funkcje.wyswietlInformacjePoNumerzeKonta();
                case 5 -> funkcje.wplac();
                case 6 -> funkcje.wyplac();
                case 7 -> funkcje.zaloguj();

                case 8 -> czyKontynuowac = false;
            }
        }
    }
}

