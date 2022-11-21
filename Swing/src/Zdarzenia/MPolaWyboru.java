package Zdarzenia;

import grouplayout.Main;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MPolaWyboru extends JFrame implements WindowListener {
    public MPolaWyboru(){
        this.setTitle("Tutuł");
        this.setBounds(50,50,1000,700);

        initComponents();

        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

    }
    public void initComponents(){
        this.addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        JOptionPane.showMessageDialog(rootPane, "Witaj ;-)");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        int opcja = JOptionPane.showConfirmDialog(rootPane, "czy napewno chcesz zamknąć");
        if(opcja == 0){
            this.dispose();
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }


    public static void main(String[] args) {
        new MPolaWyboru().setVisible(true);

        System.out.println(892389);
    }
}
