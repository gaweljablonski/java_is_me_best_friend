package Zdarzenia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EZdarzenia extends JFrame {
    public EZdarzenia(){
        this.setTitle("Zdarzenia");
        this.setBounds(50,50,1000,700);

        initCoponents();

        this.setDefaultCloseOperation(3);

    }
    public void initCoponents(){

        gray = new JButton("Szary");

        gray.addActionListener(new sluchaczKolorow(Color.gray));

        budujButton("Zielony", Color.GREEN);
        budujButton("Niebieski", Color.BLUE);
        budujButton("Czerwony", Color.red);
        budujButton("Pomarańczony", Color.orange);
        budujButton("Magenta", Color.magenta);
        budujButton("Czarny", Color.black);
        budujButton("Biały/CZYŚĆ", Color.white);
        panel.add(gray);

        JD("jebać pis", "jebac PIS");
        JD("jebać disa", "JD");

        this.getContentPane().add(panel);

    }

    JPanel panel = new JPanel();

    JButton gray;


    public void budujButton(String nazwa, Color color){
        JButton button = new JButton(nazwa);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(color);
            }
        });

        panel.add(button);
    }
    public void JD(String nazwa, String coWypisac){
        JButton button = new JButton(nazwa);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(coWypisac);
            }
        });

        panel.add(button);
    }


    private class sluchaczKolorow implements ActionListener{

        public sluchaczKolorow(Color color){
            this.color = color;

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            panel.setBackground(color);
        }
        Color color;
    }

    public static void main(String[] args) {
        new EZdarzenia().setVisible(true);
    }
}
