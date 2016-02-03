import javax.swing.*;
import java.awt.event.*;

public class Menu extends JPanel
{
    public Menu()
    {
        JButton  button = new JButton("Calculator");
        JButton  button1 = new JButton("Currency");
        JButton  button2 = new JButton("Binary");

        add(button2);
        add(button);
        add(button1);
        button.addActionListener(l);
        button1.addActionListener(l1);
        button2.addActionListener(l2);


    }
    ActionListener l1= new ActionListener()
    {
        public void actionPerformed(ActionEvent event)
        {
            WindCurrency frame = new WindCurrency();
        }
    };
    ActionListener l= new ActionListener()
    {
        public void actionPerformed(ActionEvent event)
        {
            WindCalc frame = new WindCalc();
        }
    };
    ActionListener l2= new ActionListener()
    {
        public void actionPerformed(ActionEvent event)
        {
            WindBinary frame = new WindBinary();
        }
    };
}



