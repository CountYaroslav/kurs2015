import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class Currency extends JPanel
{  JLabel  l1 = new JLabel("Enter the number and click =>");
    JLabel  lk = new JLabel("Enter the currency  USD, EUR, RUR");
    JTextField tq = new JTextField();
    JTextField tw = new JTextField();
    JTextField te = new JTextField();

    JLabel  l2 = new JLabel("UAH");
    JLabel  l3 = new JLabel("USD");
    JLabel  l4 = new JLabel("UAH");
    JLabel  l5 = new JLabel("EUR");
    JLabel  l6 = new JLabel("UAH");
    JLabel  l7 = new JLabel("RUR");
    JLabel  l8 = new JLabel("USD");
    JLabel  l9 = new JLabel("UAH");
    JLabel  l10 = new JLabel("EUR");
    JLabel  l11 = new JLabel("UAH");
    JLabel  l12 = new JLabel("RUR");
    JLabel  l13 = new JLabel("UAH");

    JButton b1 = new JButton("=>");
    JButton b2 = new JButton("=>");
    JButton b3 = new JButton("=>");
    JButton b4 = new JButton("=>");
    JButton b5 = new JButton("=>");
    JButton b6 = new JButton("=>");

    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JTextField t4 = new JTextField();
    JTextField t5 = new JTextField();
    JTextField t6 = new JTextField();

    JTextField t7 = new JTextField();
    JTextField t8 = new JTextField();
    JTextField t9 = new JTextField();
    JTextField t10 = new JTextField();
    JTextField t11 = new JTextField();
    JTextField t12 = new JTextField();
    double firstValue = 0;
    double B = 0;
    double E = 0;
    double R = 0;

    public Currency()
    {
        b1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            B = Double.parseDouble(tq.getText());
            firstValue = Integer.parseInt(t1.getText());
            t7.setText((firstValue /B) + "");
        }
    });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                B = Double.parseDouble(tq.getText());
                firstValue = Double.parseDouble(t2.getText());
                t8.setText((firstValue *B) + "");
            }
        });

        b3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            E = Double.parseDouble(tw.getText());
            firstValue =Double.parseDouble(t3.getText());
            t9.setText((firstValue / E) + "");
        }
    });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                E = Double.parseDouble(tw.getText());
                firstValue = Double.parseDouble(t4.getText());
                t10.setText((firstValue *E) + "");
            }
        });


        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                R = Double.parseDouble(te.getText());
                firstValue = Double.parseDouble(t5.getText());
                t11.setText((firstValue * R) + "");
            }
        });
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                R = Double.parseDouble(tw.getText());
                firstValue = Double.parseDouble(t6.getText());
                t12.setText((firstValue /R) + "");
            }
        });

        setLayout(null);

        add(lk);
        add(tq);
        add(tw);
        add(te);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(l9);
        add(l10);
        add(l11);
        add(l12);
        add(l13);

        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(t6);
        add(t7);
        add(t8);
        add(t9);
        add(t10);
        add(t11);
        add(t12);

        add(lk).setBounds(5, 1, 300, 20);
        add(tq).setBounds(202, 1, 30, 20);
        add(tw).setBounds(234, 1, 30, 20);
        add(te).setBounds(267, 1, 30, 20);

        b1.setBounds(120, 50, 50, 20);
        b2.setBounds(120, 100, 50, 20);
        b3.setBounds(120, 150, 50, 20);
        b4.setBounds(120, 200, 50, 20);
        b5.setBounds(120, 250, 50, 20);
        b6.setBounds(120, 300, 50, 20);

        l1.setBounds(10, 25, 300, 20); // первая строка

        l2.setBounds(80, 50, 50, 20);
        l3.setBounds(80, 100, 50, 20);
        l4.setBounds(80, 150, 50, 20);
        l5.setBounds(80, 200, 50, 20);
        l6.setBounds(80, 250, 50, 20);
        l7.setBounds(80, 300, 50, 20);

        l8.setBounds(235, 50, 50, 20);
        l9.setBounds(235, 100, 50, 20);
        l10.setBounds(235, 150, 50, 20);
        l11.setBounds(235, 200, 50, 20);
        l12.setBounds(235, 250, 50, 20);
        l13.setBounds(235, 300, 50, 20);

        t1.setBounds(30, 50, 50, 20);
        t2.setBounds(30, 100, 50, 20);
        t3.setBounds(30, 150, 50, 20);
        t4.setBounds(30, 200, 50, 20);
        t5.setBounds(30, 250, 50, 20);
        t6.setBounds(30, 300, 50, 20);

        t7.setBounds(185, 50, 50, 20);
        t8.setBounds(185, 100, 50, 20);
        t9.setBounds(185, 150, 50, 20);
        t10.setBounds(185, 200, 50, 20);
        t11.setBounds(185, 250, 50, 20);
        t12.setBounds(185, 300, 50, 20);


    }

}



