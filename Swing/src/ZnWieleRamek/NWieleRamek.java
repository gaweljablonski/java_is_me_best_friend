package ZnWieleRamek;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NWieleRamek extends JFrame {
    public NWieleRamek(){
        this.setTitle("Aplikacje z wieloma ramkami");
        this.setBounds(50,50,1000,700);

        initComponents();

        this.setDefaultCloseOperation(3);

    }
    public void initComponents(){
        this.getContentPane().add(nowaRamka);

        nowaRamka.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new NowaRamka().setVisible(true);
            }
        });

    }
    JButton nowaRamka = new JButton("Stwórz ramke");

    public static void main(String[] args) {
        new NWieleRamek().setVisible(true);
    }
}
