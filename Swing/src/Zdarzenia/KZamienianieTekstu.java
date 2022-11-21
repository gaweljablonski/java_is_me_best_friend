package Zdarzenia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KZamienianieTekstu extends JFrame {
    public KZamienianieTekstu(){
        this.setTitle("Zamienianie tekstu i suwaki");
        this.setBounds(50,50,1000,700);

        initComponents();

        this.setDefaultCloseOperation(3);

    }
    public void initComponents(){

//        textArea.selectAll();                         //zaznacza wszystko
//        textArea.select(2,5);                         //zaznacza tylko część
//        textArea.replaceSelection("tralalalalala");   //zamienia zaznaczony obszar
//        textArea.replaceRange("tralabum", 2, 15);
//        textArea.insert("jakiś", 2);                  //dodaje tekst
//        textArea.append("dołącza na końcu");
//        textArea.select(textArea.getText().indexOf("obszar"), textArea.getText().indexOf("obszar") + "obszar".length());

        this.getContentPane().add(obszarPrzewijania, BorderLayout.NORTH);

        panelSzukania.add(znajdz);
        panelSzukania.add(szukany);
        panelSzukania.add(etykietaI);
        panelSzukania.add(zamien);
        panelSzukania.add(etykietaNA);
        panelSzukania.add(nowyTekt);


        znajdz.addActionListener(new znajdowanieHandler());
        zamien.addActionListener(new zamienianieHandler());

        this.getContentPane().add(panelSzukania, BorderLayout.CENTER);



    }

    private class znajdowanieHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            poczoatekSzukanego = obszarTekstowy.getText().indexOf(szukany.getText(), poczoatekSzukanego + szukany.getText().length());
            System.out.println(poczoatekSzukanego);

            if(poczoatekSzukanego == -1){
                poczoatekSzukanego = obszarTekstowy.getText().indexOf(szukany.getText());
            }

            if(poczoatekSzukanego >= 0 && szukany.getText().length() > 0){
                obszarTekstowy.requestFocus();
                obszarTekstowy.select(poczoatekSzukanego, poczoatekSzukanego + szukany.getText().length());
            }

        }
        private int poczoatekSzukanego = 0;
    }

    private class zamienianieHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(obszarTekstowy.getSelectionStart() != obszarTekstowy.getSelectionEnd()) {
                zamienianie();
            }
            else {
                znajdz.doClick();
            }
        }
        private void zamienianie(){
            obszarTekstowy.requestFocus();
            int opcja = JOptionPane.showConfirmDialog(rootPane, "czy chcesz zamienic\"" + szukany.getText()+"\"" + " na \"" + nowyTekt.getText()+"\"" , "Uwaga nastąpi zmiana", JOptionPane.YES_NO_OPTION);
            if(opcja ==0) {
                obszarTekstowy.replaceRange(nowyTekt.getText(), obszarTekstowy.getSelectionStart(), obszarTekstowy.getSelectionEnd());
            }
        }
    }

    private JTextArea obszarTekstowy = new JTextArea("przykładowy obszar tekstowy XDD :)", 10, 10);
    private JScrollPane obszarPrzewijania = new JScrollPane(obszarTekstowy);

    private JPanel panelSzukania = new JPanel();
    private JButton znajdz = new JButton("Znajdź");
    private JLabel etykietaI = new JLabel("i");
    private JButton zamien = new JButton("Zamień");
    private JLabel etykietaNA = new JLabel("na");

    private JTextField szukany = new JTextField(8);
    private JTextField nowyTekt = new JTextField(8);

    public static void main(String[] args) {
        new KZamienianieTekstu().setVisible(true);
    }
}
