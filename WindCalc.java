import javax.swing.*;

public class WindCalc extends JFrame{

    public WindCalc()
    {
        setTitle("Calculator");                   // название созданного окна

        setBounds(500, 380, 300, 300);                          // положение и размер окна
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // обработка события закрытия окна
        setResizable(false);                             // запрет изменений размеров окна
        Calc pan = new Calc();
        add(pan);
        setVisible(true);                                // отобрадение окна
    }
}
