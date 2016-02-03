import javax.swing.*;

public class WindCurrency extends JFrame{

    public WindCurrency()
    {
        setTitle("Currency");

        setBounds(810, 300, 308, 380);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        Currency pan = new Currency();
        add(pan);
        setVisible(true);
    }
}
