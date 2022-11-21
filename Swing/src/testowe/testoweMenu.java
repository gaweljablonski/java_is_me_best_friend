package testowe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class testoweMenu extends JFrame{
    public testoweMenu(){
        this.setBounds(1000,200,500,400);
        this.setTitle("Własne MENU");
        this.setDefaultCloseOperation(3);

        initComponents();

    }
    public void initComponents(){
        this.getContentPane().add(panelMenu, BorderLayout.NORTH);
        this.getContentPane().add(panelText, BorderLayout.SOUTH);



        container.add(panelMenu);

        panelMenu.add(menu1);
        panelMenu.add(menu2);
        panelMenu.add(menu3);
        panelMenu.add(menu4);
        panelMenu.add(menu5);
        panelMenu.add(menu6);

        panelMenu.setLayout(new GridLayout(3,2));

//        textContainer.add(panelText);

        panelText.add(textField);

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


    }
    private class MenuButton extends JButton implements FocusListener, ActionListener {
        public MenuButton(String name){
            super(name);

            this.setBackground(colorDefault);
            this.addFocusListener(this);
            this.addActionListener(this);

            this.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    keyPressedHandler(e);
                }
            });


        }

        @Override
        public void focusGained(FocusEvent e) {
            this.setBackground(colorFocus);
        }

        @Override
        public void focusLost(FocusEvent e) {
            this.setBackground(colorDefault);
        }
        private Color colorFocus = Color.red;
        private Color colorDefault = Color.cyan;

        private void keyPressedHandler(KeyEvent e){

            int dlMenu = panelMenu.getComponentCount();


            if(i == 0) i = 10*dlMenu;
            if (e.getKeyCode() == KeyEvent.VK_DOWN){
                System.out.println(++i);
                panelMenu.getComponent(i % dlMenu).requestFocus();

            }
            else if (e.getKeyCode() == KeyEvent.VK_UP){

                System.out.println(--i);
                panelMenu.getComponent(i % dlMenu).requestFocus();
            }
            else if (e.getKeyCode() == KeyEvent.VK_ENTER){
                testoweMenu.MenuButton tmp = (testoweMenu.MenuButton)e.getSource();
                tmp.doClick();

            }
        }



        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(this, ((testoweMenu.MenuButton)e.getSource()).getText());
        }
    }

    private int i = 0;
    private Container container = this.getContentPane();
    private Container textContainer = this.getContentPane();

    private JPanel panelMenu = new JPanel();

    private JPanel panelText = new JPanel();

    private JPanel panel = new JPanel();
    private JLabel label = new JLabel("jaja");

    private testoweMenu.MenuButton menu1 = new testoweMenu.MenuButton("1. Dodaj");
    private testoweMenu.MenuButton menu2 = new testoweMenu.MenuButton("2. Usuń");
    private testoweMenu.MenuButton menu3 = new testoweMenu.MenuButton("3. Zmień");
    private testoweMenu.MenuButton menu4 = new testoweMenu.MenuButton("4. Coś");
    private testoweMenu.MenuButton menu5 = new testoweMenu.MenuButton("5. SUS/SOS");
    private testoweMenu.MenuButton menu6 = new testoweMenu.MenuButton("6. BEczKA");

    private JTextField textField = new JTextField(20);


    public static void main(String[] args) {
        new testoweMenu().setVisible(true);
//        new testoweMnu().setVisible(true);
    }
}
