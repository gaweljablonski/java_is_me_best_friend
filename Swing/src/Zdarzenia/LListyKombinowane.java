package Zdarzenia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LListyKombinowane extends JFrame {
    public LListyKombinowane(){
        this.setTitle("Tutuł");
        this.setBounds(50,50,1000,700);

        initComponents();

        this.setDefaultCloseOperation(3);

    }
    public void initComponents(){
        this.getContentPane().add(panel);

        panel.add(kombinacja);
        kombinacja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                (JComboBox)e.getSource()).getSelectedItem();
                ColorHandler handler =  (ColorHandler)kombinacja.getSelectedItem();
//                ((JComboBox)e.getSource()).setBackground(handler.getKolor());
                panel.setBackground(handler.getKolor());
            }

        });

        kombinacja.addItem(new ColorHandler("Czarny", Color.BLACK));
        kombinacja.addItem(new ColorHandler("Niebieski", Color.blue));
        kombinacja.addItem(new ColorHandler("Zielony", Color.green));
        kombinacja.addItem(new ColorHandler("Żółty", Color.yellow));


    }
    private class ColorHandler{
        public ColorHandler(String colorName, Color kolor){
            this.kolor = kolor;
            this.colorName = colorName;
        }
        @Override
        public String toString(){
            return this.colorName;
        }

        public Color getKolor() {
            return this.kolor;
        }

        private Color kolor;
        private String colorName;
    }

    private JPanel panel = new JPanel();

    private JComboBox kombinacja = new JComboBox();

    public static void main(String[] args) {
        new LListyKombinowane().setVisible(true);
    }
}
