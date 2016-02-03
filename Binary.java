import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class Binary extends JPanel {
    JLabel l1 = new JLabel("Kilobyte");
    JLabel l2 = new JLabel("Megabyte");
    JLabel l3 = new JLabel("Gigabyte");
    JLabel l4 = new JLabel("Terabyte");
    JLabel l5 = new JLabel("Petabyte");
    JLabel l6 = new JLabel("Eksabyte");
    JLabel l7 = new JLabel("Zetabyte");
    JLabel l8 = new JLabel("Iotabyte");
    JLabel l9 = new JLabel("byte");
    JLabel l10 = new JLabel("byte");
    JLabel l11 = new JLabel("byte");
    JLabel l12 = new JLabel("byte");
    JLabel l13 = new JLabel("byte");
    JLabel l14 = new JLabel("byte");
    JLabel l15 = new JLabel("byte");
    JLabel l16 = new JLabel("byte");

    JLabel l17 = new JLabel("Enter the number and click =>");

    JButton b1 = new JButton("=>");
    JButton b2 = new JButton("=>");
    JButton b3 = new JButton("=>");
    JButton b4 = new JButton("=>");
    JButton b5 = new JButton("=>");
    JButton b6 = new JButton("=>");
    JButton b7 = new JButton("=>");
    JButton b8 = new JButton("=>");

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
    JTextField t13 = new JTextField();
    JTextField t14 = new JTextField();
    JTextField t15 = new JTextField();
    JTextField t16 = new JTextField();
    double firstValue = 0;
    int secondValue = 1024;

    public Binary() {
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstValue = Double.parseDouble(t1.getText());
                t9.setText((firstValue * secondValue) + "^1");
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstValue = Double.parseDouble(t2.getText());
                t10.setText((firstValue * secondValue) + "^2");
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstValue = Double.parseDouble(t3.getText());
                t11.setText((firstValue * secondValue) + "^3");
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstValue = Double.parseDouble(t4.getText());
                t12.setText((firstValue * secondValue) + "^4");
            }
        });
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstValue = Double.parseDouble(t5.getText());
                t13.setText((firstValue * secondValue) + "^5");
            }
        });
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstValue = Double.parseDouble(t6.getText());
                t14.setText((firstValue * secondValue) + "^6");
            }
        });
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstValue = Double.parseDouble(t7.getText());
                t15.setText((firstValue * secondValue) + "^7");
            }
        });
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstValue = Double.parseDouble(t8.getText());
                t16.setText((firstValue * secondValue) + "^8");
            }
        });


        setLayout(null);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);

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
        add(l14);
        add(l15);
        add(l16);
        add(l17);

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
        add(t13);
        add(t14);
        add(t15);
        add(t16);

        b1.setBounds(145, 27, 50, 20);
        b2.setBounds(145, 67, 50, 20);
        b3.setBounds(145, 107, 50, 20);
        b4.setBounds(145, 147, 50, 20);
        b5.setBounds(145, 187, 50, 20);
        b6.setBounds(145, 227, 50, 20);
        b7.setBounds(145, 267, 50, 20);
        b8.setBounds(145, 307, 50, 20);

        l17.setBounds(5, 5, 300, 20); // первая строка

        l1.setBounds(75, 27, 50, 20);
        l2.setBounds(75, 67, 50, 20);
        l3.setBounds(75, 107, 50, 20);
        l4.setBounds(75, 147, 50, 20);
        l5.setBounds(75, 187, 50, 20);
        l6.setBounds(75, 227, 50, 20);
        l7.setBounds(75, 267, 50, 20);
        l8.setBounds(75, 307, 50, 20);

        l9.setBounds(266, 27, 50, 20);
        l10.setBounds(266, 67, 50, 20);
        l11.setBounds(266, 107, 50, 20);
        l12.setBounds(266, 147, 50, 20);
        l13.setBounds(266, 187, 50, 20);
        l14.setBounds(266, 227, 50, 20);
        l15.setBounds(266, 267, 50, 20);
        l16.setBounds(266, 307, 50, 20);

        t1.setBounds(5, 27, 70, 20);
        t2.setBounds(5, 67, 70, 20);
        t3.setBounds(5, 107, 70, 20);
        t4.setBounds(5, 147, 70, 20);
        t5.setBounds(5, 187, 70, 20);
        t6.setBounds(5, 227, 70, 20);
        t7.setBounds(5, 267, 70, 20);
        t8.setBounds(5, 307, 70, 20);

        t9.setBounds(204, 27, 60, 20);
        t10.setBounds(204, 67, 60, 20);
        t11.setBounds(204, 107, 60, 20);
        t12.setBounds(204, 147, 60, 20);
        t13.setBounds(204, 187, 60, 20);
        t14.setBounds(204, 227, 60, 20);
        t15.setBounds(204, 267, 60, 20);
        t16.setBounds(204, 307, 60, 20);





        }
    }



