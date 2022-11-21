package Ramka;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DMenadzerUkladow2 extends JFrame {
    public DMenadzerUkladow2(){
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;

        System.out.println(width);

        this.setSize(width/2,height/2);

        int widthRamki = getBounds().width;
        int heightRamki = getBounds().height;

        this.setLocation((width-widthRamki)/2, (height-heightRamki)/2);
        this.setTitle("Menadżer Układów 2");

        initComponents();

        this.setDefaultCloseOperation(3);
    }
    public void initComponents(){
        /*
        button1.setSize(getPreferredSize());
        button2.setSize(getPreferredSize());
        button3.setSize(getPreferredSize());
        button4.setSize(getPreferredSize());

        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);

        this.getContentPane().add(panel1, BorderLayout.CENTER);
         */
        button1 = new JButton("green");
        button2 = new JButton("blue");
        button3 = new JButton("black");
        button4 = new JButton("red");

        button1.addActionListener(new sluchaczKolorow(Color.GREEN));
        button2.addActionListener(new sluchaczKolorow(Color.blue));
        button3.addActionListener(new sluchaczKolorow(Color.black));
        button4.addActionListener(new sluchaczKolorow(Color.red));

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        this.getContentPane().add(panel);


        GroupLayout layout = new GroupLayout(getContentPane());

        this.getContentPane().setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                .addComponent(button1)
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(button2)
                                        .addComponent(button4)
                )
                .addComponent(button3)

                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(buttonAnuluj)
        );
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(button1)
                                        .addComponent(button2)
                                        .addComponent(button3)
                )
                .addComponent(button4)

                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(buttonAnuluj)
        );

//        pack();



    }
    JPanel panel = new JPanel();


    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;

    JButton buttonAnuluj = new JButton("Anuluj");

    private class sluchaczKolorow implements ActionListener {

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
        new DMenadzerUkladow2().setVisible(true);
    }
}
