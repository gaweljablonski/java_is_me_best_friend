package ZZZKontoBankoweSwing;

import javax.swing.*;

public class B2WyswietlUzytkownikow extends JFrame{
    static int x = 20;
    static int y = 10;
    public B2WyswietlUzytkownikow(){
        this.setBounds(x,y,500,300);
        x += 7;
        y += 7;

        this.setTitle("Button 1");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    public void initComponents(){
        panelLogin.add(labelL);
        panelLogin.add(labelLogin);
    }

    private JPanel panelLogin = new JPanel();
    private JLabel labelL = new JLabel("Login: ");
    private JLabel labelLogin = new JLabel();

    private JPanel panelHaslo = new JPanel();
    private JLabel labelH = new JLabel("Hasło: ");
    private JLabel labelHaslo = new JLabel();

    private JPanel panelSaldo = new JPanel();
    private JLabel labelS = new JLabel("Saldo: ");
    private JLabel labelSaldo = new JLabel();

    private JPanel panelCzyPuste = new JPanel();
    private JLabel labelP = new JLabel("czy Pusty: ");
    private JLabel labelCzyPuste = new JLabel();

    private JPanel panelNumerKonta = new JPanel();
    private JLabel labelNR = new JLabel("Numer Konta: ");
    private JLabel labelNumer = new JLabel();

}
