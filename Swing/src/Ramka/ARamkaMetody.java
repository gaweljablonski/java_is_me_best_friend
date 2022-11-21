package Ramka;
import javax.swing.*;
import java.awt.*;


public class ARamkaMetody extends JFrame {

    public ARamkaMetody(){

/*
        JFrame frame = new JFrame("Main");

//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); to to samo co linijka niżej / po kliknięciu X wyłącza program
        frame.setDefaultCloseOperation(3);

//        powoduje że ramka jest widoczna
        frame.setVisible(true);

//        frame.setTitle("Main");

        frame.setSize(1000,700);  //ustawia rozmiar
//        frame.setSize(new Dimension(1000,700));

        frame.setLocation(15,0);  // ustawia pozycje x rosną w prawp, y rosną w dół
//        frame.setLocation(new Point(20,10));

//        frame.setBounds(20,10,1000,700); łączy set.Location i set.Size

        frame.setResizable(true);  // czy można zmieniać rozmiar ramki  true - można ; false - nie można

        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("15unknown.png"));
        // zmienia ikone w okienku(obraz musi być w folderze)


*/
        this.setDefaultCloseOperation(3);

//        this.setVisible(true);

        this.setTitle("Ramka Metody");
        this.setBounds(20,10,1000,700);
        this.setResizable(false);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("15unknown.png"));

//        this.pack();



    }

    public static void main(String[] args) {
	// write your code here
        new ARamkaMetody().setVisible(true);;

    }
}
