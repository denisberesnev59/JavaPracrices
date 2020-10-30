package Practice10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class Calculator{
    static JFrame f;

    public static void main(String[] args) {
        f = new JFrame("Calculator");
        JPanel p = Panels();

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Calculator");
        f.add(p);
        f.setSize(300, 350);
        p.setBackground(Color.gray);

        f.setVisible(true);
    }

    private static JPanel Panels(){
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4, 1));

        JTextField first_value = new JTextField();
        JTextField second_value = new JTextField();
        JLabel res = new JLabel("Ответ");

        ActionListener command = new Commands(first_value, second_value, res);
        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(1, 4));

        JButton  ba, bs, bd, bm;

        ba = new JButton("+");
        ba.addActionListener(command);
        gridPanel.add(ba);
        //
        bs = new JButton("-");
        bs.addActionListener(command);
        gridPanel.add(bs);
        //
        bd = new JButton("/");
        bd.addActionListener(command);
        gridPanel.add(bd);
        //
        bm = new JButton("*");
        bm.addActionListener(command);
        gridPanel.add(bm);

        p.add(first_value);
        p.add(gridPanel);
        p.add(second_value);
        p.add(res);

        return p;
    }
}

class Commands implements ActionListener {
    private JTextField first_field;
    private JTextField second_field;
    private JLabel result_field;

    public Commands(JTextField a, JTextField b, JLabel c) {
        first_field = a;
        second_field = b;
        result_field = c;
    }

    public void actionPerformed(ActionEvent event) {
        double first_text, second_text, res = 0;
        try {

            first_text = Double.parseDouble(first_field.getText());
            second_text = Double.parseDouble(second_field.getText());

            switch (((JButton) (event.getSource())).getText()) {
                case "+":
                    res = first_text + second_text;
                    break;
                case "-":
                    res = first_text - second_text;
                    break;
                case "/":
                    if (second_text != 0) {
                        res = first_text / second_text;
                        break;
                    }
                default:
                    result_field.setText("На ноль делить нельзя! ):<");
                    return;
                case "*":
                    res = first_text * second_text;
                    break;
            }
            result_field.setText(String.format(Locale.UK, "%.2f", res));

        } catch (Exception e) {
            result_field.setText("Что-то не то ввели! ):<");
        }
    }
}