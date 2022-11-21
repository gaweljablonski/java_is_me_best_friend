package KBankowe;

import java.util.Scanner;
import java.util.stream.Stream;

public class Konto {
    private String imie;
    private double saldoKonta;
    private boolean czyPuste;
    private int numerKonta;
    private String haslo;

    static int nastepnyNumerKonta = 1;

    public Konto (String imie, double saldoKonta, boolean czyPuste, int numerKonta, String haslo){
        this.imie = imie;
        this.saldoKonta = saldoKonta;
        this.haslo = haslo;

        this.numerKonta = nastepnyNumerKonta;
        nastepnyNumerKonta++;
        
    }


    public static int getNastepnyNumerKonta() {
        return nastepnyNumerKonta;
    }

    public int getNumerKonta() {
        return numerKonta;
    }

    public String getImie() {
        return imie;
    }

    public double getSaldoKonta() {
        return saldoKonta;
    }

    public boolean isCzyPuste() {
        return czyPuste;
    }

    public void setSaldoKonta(double saldoKonta) {
        this.saldoKonta = saldoKonta;
    }

    public void setCzyPuste(boolean czyPuste) {
        this.czyPuste = czyPuste;
    }


    public void wyswietlInformacjeUzytkowniaka(){
        System.out.println("Imie: " + imie);
        System.out.println("Saldo: " + saldoKonta);
        System.out.println("Numer Konta: " + numerKonta);
        System.out.println("Twoje Hasło: " + haslo);
        String czyPusteString = czyPuste ? "Tak" : "Nie";
        System.out.println("Czy konto jest puste? " + czyPusteString);
    }








}
