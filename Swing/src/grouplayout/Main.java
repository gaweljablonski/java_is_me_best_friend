package grouplayout;

import javax.swing.*;

public class Main extends JFrame {
    public Main(){
        this.setTitle("Tutuł");
        this.setBounds(50,50,1000,700);

        initComponents();

        this.setDefaultCloseOperation(3);

    }
    public void initComponents(){

    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
