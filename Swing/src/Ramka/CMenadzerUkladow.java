package Ramka;

import javax.swing.*;
import java.awt.*;

public class CMenadzerUkladow extends JFrame {
    public CMenadzerUkladow(){
        this.setTitle("Układ graficzny (Layout)");
        this.setBounds(20,10,1000,700);

        initComponents();

        this.setDefaultCloseOperation(3);
    }

    public void initComponents(){
        centerButton = new JButton("centralny przycisk");
        topButton = new JButton("górny przycisk");
        downButton = new JButton("dolny przycisk");
        leftButton = new JButton("lewy przycisk");
        rightButton = new JButton("prawy przycisk");

        Container container = this.getContentPane();
//        container.add(centerButton, BorderLayout.CENTER);
        container.add(topButton, BorderLayout.NORTH);
        container.add(downButton, BorderLayout.SOUTH);
        container.add(leftButton, BorderLayout.WEST);
        container.add(rightButton, BorderLayout.EAST);

        int widthRamki = this.getSize().width;
        int heightRamki = this.getSize().height;
        centerButton.setLocation(widthRamki-100, heightRamki-100);
        centerButton.setSize(centerButton.getPreferredSize());
        container.setLayout(null);
        container.add(centerButton);

    }
    JButton centerButton;
    JButton topButton;
    JButton downButton;
    JButton leftButton;
    JButton rightButton;

    public static void main(String[] args) {
        new CMenadzerUkladow().setVisible(true);
    }
}
