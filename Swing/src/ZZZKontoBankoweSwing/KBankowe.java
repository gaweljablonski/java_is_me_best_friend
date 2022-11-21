package ZZZKontoBankoweSwing;

import javax.swing.*;

public class KBankowe extends JFrame{
    private String login;
    private String haslo;

    private double saldoKonta;
    private boolean czyPuste;
    private int numerKonta;

    static int nastepnyNumerKonta = 1;


    public KBankowe(String login, String haslo, double saldoKonta, boolean czyPuste, int numerKonta){
        this.login = login;
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
        return login;
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

    public void wyswietlInformacjeUzytkownika(){
        JLabel LLogin = new JLabel();
        LLogin.setText(login);
    }
}
