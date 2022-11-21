package Ramka;

import javax.swing.*;
import java.awt.*;

public class BCentrowanieRanmki extends JFrame {
    public BCentrowanieRanmki(){
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;

        System.out.println(width);

        this.setSize(width/2,height/2);

        int widthRamki = getBounds().width;
        int heightRamki = getBounds().height;

        this.setLocation((width-widthRamki)/2, (height-heightRamki)/2);
        this.setTitle("Centrowanie Ramki");
        this.setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {

        new BCentrowanieRanmki().setVisible(true);
    }
}
