package grouplayout;

import javax.swing.*;

public class zkursu extends JFrame
{  
    public zkursu()
    {
        this.setBounds(300, 300, 300, 200);
        
        initComponents();
        
        this.setDefaultCloseOperation(3);
    }
    
    public void initComponents()
    {
        GroupLayout layout = new GroupLayout(getContentPane());
        
        this.getContentPane().setLayout(layout);
        
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                .addComponent(button1)
                .addGroup(
                layout.createParallelGroup().addComponent(button2).addComponent(button4)
                )
                .addComponent(button3)
                
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(bAnuluj)
                );
        
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                .addGroup(
                layout.createParallelGroup().addComponent(button1).addComponent(button2).addComponent(button3)
                )
                .addComponent(button4)
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(bAnuluj)
                );
        
    
        pack();
    }
    
    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    JButton button3 = new JButton("Button 3");
    JButton button4 = new JButton("Button 4");
    JButton bAnuluj = new JButton("Anuluj");
   
    
    public static void main(String[] args) 
    {
        new zkursu().setVisible(true);
    }
    
}
