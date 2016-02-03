import javax.swing.*;

public class WindMenu extends JFrame{

    public WindMenu()
    {
        setTitle("Helper @ Sadretdinov Y.S.");                   // название созданного окна

        setBounds(500, 300, 300, 70);                          // положение и размер окна
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // обработка события закрытия окна
        setResizable(false);                             // запрет изменений размеров окна
        Menu pan = new Menu();
        add(pan);
        setVisible(true);                                // отобрадение окна
    }
}
