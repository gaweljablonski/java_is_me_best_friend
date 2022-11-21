package Zdarzenia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HCheckBox extends JFrame {
    public HCheckBox(){
        this.setBounds(1000,200,500,400);
        this.setTitle("Przełączniki CheckBox");
        this.setDefaultCloseOperation(3);

        initComponents();

    }

    public void initComponents(){
        panel1.add(pogrubiony);
        panel1.add(pochylony);
        panel2.add(label);

        this.getContentPane().add(panel1, BorderLayout.NORTH);
        this.getContentPane().add(panel2, BorderLayout.CENTER);

        label.setFont(new Font("Monospaced", Font.PLAIN, 18));

        ActionListener sluchacz = new CheckBoxHandler();

        pochylony.addActionListener(sluchacz);
        pogrubiony.addActionListener(sluchacz);

    }

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();

    JCheckBox pogrubiony = new JCheckBox("pogrubiony");
    JCheckBox pochylony = new JCheckBox("pochylony");

    JLabel label = new JLabel("jestem piękna");

    public class CheckBoxHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int style = Font.PLAIN;

            if(pogrubiony.isSelected()) style += Font.BOLD;
            if(pochylony.isSelected()) style += Font.ITALIC;

            label.setFont(new Font(label.getFont().getFamily(), style, label.getFont().getSize()));
        }
    }

    public static void main(String[] args)  {
        new HCheckBox().setVisible(true);
    }
}
