import javax.swing.*;

public class WindBinary extends JFrame{

    public WindBinary()
    {
        setTitle("Binary");                   // название созданного окна

        setBounds(190, 300, 308, 380);                          // положение и размер окна
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // обработка события закрытия окна
        setResizable(false);                             // запрет изменений размеров окна
        Binary pan = new Binary();
        add(pan);
        setVisible(true);                                // отобрадение окна
    }

}
