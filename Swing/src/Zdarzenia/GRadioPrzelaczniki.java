package Zdarzenia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GRadioPrzelaczniki extends JFrame {
    public GRadioPrzelaczniki(){
        this.setBounds(1000,200,500,400);
        this.setTitle("Przełączniki Radio");
        this.setDefaultCloseOperation(3);

        initComponents();
    }


    public void initComponents(){
        panel.add(label);
        label.setFont(new Font("Monospaced", Font.BOLD, 25));
        this.getContentPane().add(panelSize, BorderLayout.NORTH);
        this.getContentPane().add(panelColor, BorderLayout.WEST);
        this.getContentPane().add(panelText, BorderLayout.EAST);
        this.getContentPane().add(panel, BorderLayout.SOUTH);


        JRadioButton smallRadioButton = new JRadioButton("Mały",false);
        groupSize.add(smallRadioButton);
        panelSize.add(smallRadioButton);
        smallRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setFont(new Font("Monospaced", Font.BOLD, 25));
            }
        });


        bildButtonSize("średni", 35);
        bildButtonSize("duży", 50);

        bildButtonColor("czerwony", Color.RED);
        bildButtonColor("Zielony", Color.green);
        bildButtonColor("niebieski", Color.blue);

        bildButtonText("jacek");
        bildButtonText("marek");
        bildButtonText("krzusiu");



    }
    public void bildButtonSize(String nazwa, int size){
        JRadioButton button = new JRadioButton(nazwa);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setFont(new Font("Monospaced", Font.PLAIN, size));
            }
        });
        groupSize.add(button);
        panelSize.add(button);
    }
    public void bildButtonColor(String nazwa, Color color){
        JRadioButton button = new JRadioButton(nazwa);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setForeground(color);
            }
        });


        groupColor.add(button);
        panelColor.add(button);
    }
    public void bildButtonText(String nazwa){
        JRadioButton button = new JRadioButton(nazwa);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(nazwa);
            }
        });


        groupText.add(button);
        panelText.add(button);
    }
    JPanel panelSize = new JPanel();
    JPanel panelColor = new JPanel();
    JPanel panelText = new JPanel();
    JPanel panel = new JPanel();
    JLabel label = new JLabel("coś");


    ButtonGroup groupSize = new ButtonGroup();
    ButtonGroup groupColor = new ButtonGroup();
    ButtonGroup groupText = new ButtonGroup();

    public static void main(String[] args) {
        new GRadioPrzelaczniki().setVisible(true);
    }
}
