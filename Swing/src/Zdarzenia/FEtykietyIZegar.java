package Zdarzenia;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FEtykietyIZegar extends JFrame {
    public FEtykietyIZegar(){
        this.setTitle("Zdarzenia");
        this.setBounds(50,50,1000,700);

        initCoponents();

        this.setDefaultCloseOperation(3);

    }
    public void initCoponents(){

        panel.add(label);
        panel.add(czas);

        Zegar stoper = new Zegar();

        Timer timer = new Timer(1000, stoper);

        timer.start();

        this.getContentPane().add(panel);

    }


    JPanel panel = new JPanel();
    JLabel label = new JLabel("czas: ");
    JLabel czas = new JLabel();

    private class Zegar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            GregorianCalendar calendar = new GregorianCalendar();

            String h = ""+calendar.get(Calendar.HOUR_OF_DAY);
            String min = ""+calendar.get(Calendar.MINUTE);
            String s = ""+calendar.get(Calendar.SECOND);

            if(Integer.valueOf(h) < 10){
                h = "0" + h;
            }
            if(Integer.valueOf(min) < 10){
                min = "0" + min;
            }
            if(Integer.valueOf(s) < 10){
                s = "0" + s;
            }

            czas.setText(h +" : " + min + " : " + s);

        }
    }
    static int i = 1;
    public static void main(String[] args) {
        new FEtykietyIZegar().setVisible(true);
    }
}
