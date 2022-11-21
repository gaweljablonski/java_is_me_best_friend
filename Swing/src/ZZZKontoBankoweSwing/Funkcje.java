package ZZZKontoBankoweSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class Funkcje extends JFrame {
    public static Map<String, String> logigToHaslo = new HashMap<>();

    public static List<KBankowe> kontaUzytkownikow = new ArrayList<>();                 //wszyskie konta
                                                                                        //"2. Wyświetl użytkowników"
    public static Map <String, Integer> loginToNumerKonta = new HashMap<>();            //"3. Wyświetl numer konta po IMIENIU"
    public static Map <Integer, KBankowe> numerKontaToKonto = new HashMap<>();           //"4. Wyświetl informacje o koncie po numerze konta - (ID)"
    public static Map <KBankowe, String> kontoToHaslo = new HashMap<>();                //do
    public static Map <String, KBankowe> loginToKonto = new HashMap<>();                //do logowania i wyświetlania jednego konta po loginie
    public static Map <Integer, String> numerKontaToUzytkownik = new TreeMap<>();       //do towrzenia konta(sprawdzanie czy nie ma już takiego loginu)
    public static Map <String, Integer> loginToSaldo = new HashMap<>();

}
