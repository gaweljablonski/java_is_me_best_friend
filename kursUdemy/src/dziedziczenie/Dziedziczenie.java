package dziedziczenie;


import d.potwory.Potwor;
import d.potwory.Szkielet;
import d.potwory.Zombie;

//import KBankowe.Funkcje;

public class Dziedziczenie {
    public static void main(String[] args) {

        Potwor p = new Potwor(5.5,25);

        Szkielet s = new Szkielet(5,60,"łuk");

        Zombie z = new Zombie();
        s.setHP(555);

        System.out.println(s.getHP());
        System.out.println(s.getTypBroni());

        /*
         Funkcje konto = new Funkcje();
         konto.tworzeniaKonta();

         konto.wyswietlInformacje();
         */


    }
}
