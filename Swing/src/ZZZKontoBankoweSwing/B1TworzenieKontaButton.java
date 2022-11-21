package ZZZKontoBankoweSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Collection;

public class B1TworzenieKontaButton extends JFrame {
    static int x = 20;
    static int y = 10;
    public B1TworzenieKontaButton(){
        this.setBounds(x,y,600,400);
        x += 7;
        y += 7;

        this.setTitle("Button 1");

        initComponents();

    }
    public void initComponents(){
        Funkcje funkcje = new Funkcje();
        this.getContentPane().add(panelLogin, BorderLayout.NORTH);
        this.getContentPane().add(panelHaslo, BorderLayout.BEFORE_LINE_BEGINS);
        this.getContentPane().add(panelSaldo, BorderLayout.CENTER);
        this.getContentPane().add(panelOK, BorderLayout.SOUTH);

        panelLogin.add(labelLogin);
        panelLogin.add(textFieldLogin);

        panelSaldo.add(labelSaldo);
        panelSaldo.add(textFieldSaldo);

        panelHaslo.add(labelHaslo);
        panelHaslo.add(textFieldHaslo);

        panelOK.add(buttonOK);

        /*
        GroupLayout layout = new GroupLayout(getContentPane());
        this.getContentPane().setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(labelLogin)
                                        .addComponent(labelHaslo)
                                        .addComponent(labelSaldo)
                        )
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(textFieldLogin)
                                        .addComponent(textFieldHaslo)
                                        .addComponent(textFieldSaldo)
                        )

        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addComponent(labelLogin)
                        .addComponent(labelHaslo)
                        .addComponent(labelSaldo)

                layout.createSequentialGroup()
                        .addComponent(textFieldLogin)
                        .addComponent(textFieldHaslo)
                        .addComponent(textFieldSaldo)
        );
*/
        textFieldLogin.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        textFieldHaslo.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        textFieldSaldo.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent evt) {
                jTextField1KeyPressedCyfra(evt);
            }
            public void keyTyped(KeyEvent evt) {
                jTextField1KeyTypedCyfra(evt);
            }
        });

        JFrame tmpFrame = this;


        buttonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login = (String)textFieldLogin.getText();
                haslo = (String)textFieldHaslo.getText();
                saldo = Integer.parseInt(textFieldSaldo.getText());

                boolean czyUzytkownikPoprawny = false;
                boolean czyHasloPoprawne = false;
                Collection<String> nazwyUzytkownikow = funkcje.numerKontaToUzytkownik.values();


                while (!czyUzytkownikPoprawny) {
                    if (nazwyUzytkownikow.contains(login)) {
                        JOptionPane.showMessageDialog(rootPane, "Błąd! Ta nazwa już istnieje!");
                        continue;
                    } else {
                        czyUzytkownikPoprawny = true;
                    }
                }
/*
                while (!czyHasloPoprawne){
                    if (haslo.length() <= 4){
                        JOptionPane.showMessageDialog(rootPane, "Błąd! Za mało znaków(min 4.)");
                        czyHasloPoprawne = true;


                    }
                    else{
                        tmpFrame.dispose();
                    }
                }

 */
                boolean czyPuste;

                if(saldo <= 0){
                    czyPuste = true;
                }
                else {
                    czyPuste = false;
                }
                int numerKonta = KBankowe.nastepnyNumerKonta;

                KBankowe kBankowe = new KBankowe(login, haslo, saldo, czyPuste, numerKonta);


                Funkcje.logigToHaslo.put(login, haslo);
                Funkcje.kontaUzytkownikow.add(kBankowe);
                Funkcje.numerKontaToKonto.put(numerKonta, kBankowe);
                Funkcje.loginToNumerKonta.put(login, numerKonta);
                Funkcje.kontoToHaslo.put(kBankowe, haslo);
                Funkcje.loginToKonto.put(login, kBankowe);
                Funkcje.loginToSaldo.put(login, saldo);
                Funkcje.numerKontaToUzytkownik.put(numerKonta, login);

                tmpFrame.dispose();

            }
        });
    }
    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        if (!jestCyfryILitery(evt.getKeyChar()))
            evt.consume();
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_V)
        {
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            DataFlavor flavor = DataFlavor.stringFlavor;
            String schowek = "";

            try
            {
                schowek = (String) clipboard.getData(flavor);
            }
            catch (UnsupportedFlavorException ex)
            {
                System.out.println("To nie jest String");
            }
            catch (IOException ex)
            {
                System.out.println("Wystąpił błąd na wejściu/wyjściu");
            }

            for (int i = 0; i < schowek.length(); i++)
                if (!jestCyfryILitery(schowek.charAt(i)))
                {
                    evt.consume();
                    break;
                }
        }

    }
    private void jTextField1KeyTypedCyfra(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        if (!jestCyfra(evt.getKeyChar()))
            evt.consume();
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1KeyPressedCyfra(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_V)
        {
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            DataFlavor flavor = DataFlavor.stringFlavor;
            String schowek = "";

            try
            {
                schowek = (String) clipboard.getData(flavor);
            }
            catch (UnsupportedFlavorException ex)
            {
                System.out.println("To nie jest String");
            }
            catch (IOException ex)
            {
                System.out.println("Wystąpił błąd na wejściu/wyjściu");
            }

            for (int i = 0; i < schowek.length(); i++)
                if (!jestCyfra(schowek.charAt(i)))
                {
                    evt.consume();
                    break;
                }
        }

    }
    private boolean jestCyfryILitery(char zn)
    {
        if ((zn >= '0' && zn <= '9') || ((int)zn >= 97 && (int)zn <= 122) || ((int)zn >= 65 && (int)zn <= 90)){
        return true;
        }
        return false;
    }
    private boolean jestCyfra(char zn){
        if (zn >= '0' && zn <= '9'){
            return true;
        }
        return false;
    }


    private String login;
    private String haslo;
    private int saldo;

    private JPanel panelLogin = new JPanel();
    private JPanel panelHaslo = new JPanel();
    private JPanel panelSaldo = new JPanel();
    private JPanel panelOK = new JPanel();

    private JButton buttonOK = new JButton("OK");

    private JLabel labelLogin = new JLabel("login: ");
    private JLabel labelHaslo = new JLabel("haslo: ");
    private JLabel labelSaldo = new JLabel("saldo: ");

    private JTextField textFieldLogin = new JTextField(15);
    private JTextField textFieldHaslo = new JTextField(15);
    private JTextField textFieldSaldo = new JTextField(15);



}
