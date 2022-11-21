package Zdarzenia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IMenu extends JFrame {
    public IMenu(){
        this.setBounds(1000,200,500,400);
        this.setTitle("Własne MENU");
        this.setDefaultCloseOperation(3);

        initComponents();


    }
    public void initComponents(){
        this.getContentPane().add(panelMenu, BorderLayout.NORTH);

//        this.getContentPane().add(panel, BorderLayout.WEST);
//        panel.add(label);

        container.add(panelMenu);

        panelMenu.add(menu1);
        panelMenu.add(menu2);
        panelMenu.add(menu3);
        panelMenu.add(menu4);
        panelMenu.add(menu5);

        panelMenu.setLayout(new GridLayout(2,3));


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
//            System.out.println("dl memu" + dlMenu);

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
                MenuButton tmp = (MenuButton)e.getSource();
                tmp.doClick();
//                ((MenuButton)e.getSource()).doClick();

            }
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(this, ((MenuButton)e.getSource()).getText());
        }
    }

    private int i = 0;
    private Container container = this.getContentPane();

    private JPanel panelMenu = new JPanel();

    private JPanel panel = new JPanel();
    private JLabel label = new JLabel("jaja");

    private MenuButton menu1 = new MenuButton("1. Dodaj");
    private MenuButton menu2 = new MenuButton("2. Usuń");
    private MenuButton menu3 = new MenuButton("3. Zmień");
    private MenuButton menu4 = new MenuButton("4. Coś");
    private MenuButton menu5 = new MenuButton("5. SUS/SOS");

    public static void main(String[] args) {
        new IMenu().setVisible(true);
    }
}
