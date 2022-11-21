package KBankowe;

import java.util.*;


public class Funkcje {
    private String adminLogin = "Pokejko";
    private String adminHaslo = "123456";


    private List<Konto> kontaUzytkownikow = new ArrayList<>();              //wszyskie konta
                                                                            //"2. Wyświetl użytkowników"
    private Map <String, Integer> uzytkownikToNumerKonta = new HashMap<>(); //"3. Wyświetl numer konta po IMIENIU"
    private Map <Integer, Konto> numerKontaToKonto = new HashMap<>();       //"4. Wyświetl informacje o koncie po numerze konta - (ID)"
    private Map <Konto, String> kontoToHaslo = new HashMap<>();             //do
    private Map <String, Konto> loginToKonto = new HashMap<>();             //do logowania i wyświetlania jednego konta po loginie
    private Map <Integer, String> numerKontaToUzytkownik = new TreeMap<>(); //do towrzenia konta(sprawdzanie czy nie ma już takiego loginu)
    private Map <String, Double> loginToSaldo = new HashMap<>();

    private Map <String, String> loginHaslo = new HashMap<>();              //"7. Zaloguj"


    Scanner scanner = new Scanner(System.in);

    public void tworzeniaKonta(){
        boolean czyUzytkownikPoprawny = false;
        System.out.print("Podaj imie właściciela konta: ");
        String login = scanner.nextLine();

        Collection<String> nazwyUzytkownikow = numerKontaToUzytkownik.values();

        while (!czyUzytkownikPoprawny) {
            if (nazwyUzytkownikow.contains(login)) {
                System.out.println("BŁĄD: NAZWA JUŻ ISTNIEJE");
                System.out.print("Spróbuj ponownie: ");
                login = scanner.nextLine();
                continue;
            } else {
                czyUzytkownikPoprawny = true;
            }
        }

        System.out.print("Podaj saldo Konta: ");
        double saldoKonta = Double.valueOf(scanner.nextLine());


        boolean czyPuste;

        if (saldoKonta <= 0){
            czyPuste = true;
        }else {
            czyPuste = false;
        }

        int numerKonta = Konto.nastepnyNumerKonta;


        System.out.print("min. 4 znaki" +
                "Podaj hasło: ");
        String haslo = scanner.nextLine();

        while (haslo.length() < 4){
            System.out.println("BŁĘDNE HASŁO (ZA MAŁO ZNAKÓW MIN. 4");
            System.out.print("Ponów próbę: ");
            haslo = scanner.nextLine();
        }

        Konto konto = new Konto(login, saldoKonta, czyPuste, numerKonta, haslo);

        kontaUzytkownikow.add(konto);
        numerKontaToKonto.put(numerKonta, konto);
        uzytkownikToNumerKonta.put(login, numerKonta);
        kontoToHaslo.put(konto, haslo);
        loginToKonto.put(login, konto);
        loginToSaldo.put(login, saldoKonta);
        numerKontaToUzytkownik.put(numerKonta, login);
        loginHaslo.put(login, haslo);

    }
    public void numerKontaPoImieniu(){
        System.out.print("Podaj imie właścieciela konta: ");
        String imie = scanner.nextLine();
        Integer konto = uzytkownikToNumerKonta.get(imie);

        System.out.println("Twój numer konta to: " + konto);

    }

    public void wyswietlInformacjePoNumerzeKonta(){
        System.out.print("Podaj numer Konta: ");
        Integer numerKonta = Integer.valueOf(scanner.nextLine());
        Konto konto = numerKontaToKonto.get(numerKonta);

        konto.wyswietlInformacjeUzytkowniaka();
    }

    public void wyswietlInformacje(){
        System.out.print("Podaj login Admina: ");
        login = scanner.nextLine();
        System.out.print("Podaj hasło do konta: ");
        hasloPrzyLogowaniu = scanner.nextLine();
        if(login.equals(adminLogin) && hasloPrzyLogowaniu.equals(adminHaslo)) {
            for (Konto kontoUzytkownika : kontaUzytkownikow) {
                System.out.println();
                kontoUzytkownika.wyswietlInformacjeUzytkowniaka();
                System.out.println();
            }
        }
        else{
            System.out.println("BŁĄD");
            System.out.println("NIE MA XDDD");
        }
    }

    boolean czyZalogowano = false;
    String login;
    String hasloPrzyLogowaniu;
    public void zaloguj(){
        System.out.print("Podaj nazwę użytkownika: ");
        login = scanner.nextLine();
        System.out.print("Podaj hasło do konta: ");
        hasloPrzyLogowaniu = scanner.nextLine();

        if (hasloPrzyLogowaniu.equals(loginHaslo.get(login))){
            System.out.println("zalogowano");
            czyZalogowano = true;
            System.out.println();

            Konto kontoPrzyLogowaniu = loginToKonto.get(login);
            kontoPrzyLogowaniu.wyswietlInformacjeUzytkowniaka();
        }
        else {
            System.out.println("BŁĄD!!!");

        }


    }


    public void wplac() {
        zaloguj();
        if(czyZalogowano) {
            System.out.println("Przed: " + loginToSaldo.get(login));

            System.out.print("Podaj kwotę do wpłacenia: ");
            Double wplacane = Double.valueOf(scanner.nextLine());
            double tmpSaldo = loginToSaldo.get(login) + wplacane;

            Konto tmpDoSalda = loginToKonto.get(login);
            tmpDoSalda.setSaldoKonta(tmpSaldo);

            if(tmpSaldo <= 0) {
                Konto tmpDoCzyPuste = loginToKonto.get(login);
                tmpDoCzyPuste.setCzyPuste(true);
            }
            else if(tmpSaldo > 0) {
                Konto tmpDoCzyPuste = loginToKonto.get(login);
                tmpDoCzyPuste.setCzyPuste(false);
            }

            loginToSaldo.put(login, tmpSaldo);
            System.out.println("Po wypłaceniu: " + loginToSaldo.get(login));

        }
        else {
            System.out.println("BŁĄD");
        }
    }
    public void wyplac() {
        zaloguj();
        if(czyZalogowano) {
            System.out.println("Przed: " + loginToSaldo.get(login));

            System.out.print("Podaj kwotę do wypłacenia: ");
            Double wyplacane = Double.valueOf(scanner.nextLine());
            double tmpSaldo = Double.valueOf(loginToSaldo.get(login)) - wyplacane;

            Konto tmpDoSalda = loginToKonto.get(login);
            tmpDoSalda.setSaldoKonta(tmpSaldo);

            if(tmpSaldo <= 0) {
                Konto tmpDoCzyPuste = loginToKonto.get(login);
                tmpDoCzyPuste.setCzyPuste(true);
            }
            else if(tmpSaldo > 0) {
                Konto tmpDoCzyPuste = loginToKonto.get(login);
                tmpDoCzyPuste.setCzyPuste(false);
            }

            loginToSaldo.put(login, tmpSaldo);
            System.out.println("Po wypłaceniu: " + loginToSaldo.get(login));

        }
        else {
            System.out.println("BŁĄD");
        }


    }
}
