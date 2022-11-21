package ZZZKontoBankoweSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WRamce extends JFrame {
    public WRamce(){
        this.setBounds(400,200,750,500);
        this.setDefaultCloseOperation(3);
        this.setTitle("Bank");

        initComponents();
    }


    public void initComponents(){
        this.getContentPane().add(panel, BorderLayout.NORTH);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);

        container.add(panel);

        panel.setLayout(new GridLayout(4,2));


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                B1TworzenieKontaButton tworzenieKonta = new B1TworzenieKontaButton();
                tworzenieKonta.setVisible(true);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                B2WyswietlUzytkownikow wyswietlUzytkownikow = new B2WyswietlUzytkownikow();
                wyswietlUzytkownikow.setVisible(true);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Button3 button3 = new Button3();
                button3.setVisible(true);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private JButton button1 = new JButton("1. Stwórz konto Zwykłe");
    private JButton button2 = new JButton("2. Wyświetl użytkowników");
    private JButton button3 = new JButton("3. Wyświetl numer konta po IMIENIU");
    private JButton button4 = new JButton("4. Wyświetl informacje o koncie po numerze konta - (ID)");
    private JButton button5 = new JButton("5. Wpłać");
    private JButton button6 = new JButton("6. Wypłać");
    private JButton button7 = new JButton("7. Przelew");
    private JButton button8 = new JButton("8. Zaloguj");

    private JPanel panel = new JPanel();

    private Container container = this.getContentPane();


}
