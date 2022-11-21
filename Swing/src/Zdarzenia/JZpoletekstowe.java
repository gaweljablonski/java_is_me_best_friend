
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/*
 * poletekstowe.java
 *
 * Created on 26 marzec 2009, 10:22
 */
import java.io.IOException;


/**
 *
 * @author  Armon
 */
public class JZpoletekstowe extends javax.swing.JFrame {

    /** Creates new form poletekstowe */
    public JZpoletekstowe() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.1
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );



        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
    if (!jestLiczba(evt.getKeyChar()))
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
                if (!jestLiczba(schowek.charAt(i)))
                {
                    evt.consume();
                    break;
                }
    }
        
}//GEN-LAST:event_jTextField1KeyPressed

private boolean jestLiczba(char zn)
{
    if (zn >= '0' && zn <= '9')
     return true;
    
    return false;
}
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JZpoletekstowe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
