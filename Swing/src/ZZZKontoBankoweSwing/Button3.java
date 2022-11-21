package ZZZKontoBankoweSwing;

import javax.swing.*;
import java.awt.*;

public class Button3 extends JFrame {
    static int x = 20;
    static int y = 10;
    public Button3 (){
        this.setBounds(x,y,500,300);
        x += 7;
        y += 7;

        this.setTitle("Button 1");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    public void initComponents(){

    }
}
