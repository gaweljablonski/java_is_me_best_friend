package ZnWieleRamek;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NowaRamka extends JFrame {
    static int x = 20;
    static int y = 10;
    public NowaRamka(){

        this.setTitle("Tutuł");
        this.setBounds(x,y,500,300);
        x += 7;
        y += 7;

        initComponents();

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    public void initComponents(){
        this.getContentPane().add(button);
        JFrame tmpFrame = this;
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tmpFrame.dispose();
            }


        });
    }

    JButton button = new JButton("zamkij mnie");

}
