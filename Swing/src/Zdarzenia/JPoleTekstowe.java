package Zdarzenia;

import javax.swing.*;

public class JPoleTekstowe extends JFrame {
    public JPoleTekstowe(){
        this.setBounds(1000,200,500,400);
        this.setTitle("Pola Tekstowe");
        this.setDefaultCloseOperation(3);

        initComponents();

    }
    public void initComponents(){

    }


    public static void main(String[] args) {
        new JPoleTekstowe().setVisible(true);
    }
}
