/*
 * Written by Nititorn Kijprasopchok
 * ID: 6530300295
 */

package gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUIFIX extends JFrame{
    private JTextField textField;
    private Font font, fontBtn;
    private JPanel panel, panel2, panel3;
    private JButton[] btn = new JButton[20];

    public GUIFIX(){
        super("Calculator");

        Container c1 = getContentPane();
        c1.setLayout(new FlowLayout());

        panel = new JPanel();
        font = new Font("TimesRoman", Font.PLAIN, 16);
        fontBtn = new Font("TimesRoman", Font.PLAIN, 10);
        textField = new JTextField("", 20);
        textField.setFont(font);

        panel.add(textField);

        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(5, 5, 6, 20));
        panel3 = new JPanel();

        for(int i = 0; i < 20; i++){
            btn[i] = new JButton();
            btn[i].setPreferredSize(new Dimension(60, 35));
            btn[i].setBackground(Color.WHITE);
            btn[i].setFont(fontBtn);
            //btn[i].setText(i + "");
            if(i == 2){
                panel2.add(panel3);
            }else{
                panel2.add(btn[i]);
            }
        }

        btn[0].setText("Cls");
        btn[1].setText("Bck");
        btn[3].setText("Close");
        btn[4].setText("7");
        btn[5].setText("8");
        btn[6].setText("9");
        btn[7].setText("/");
        btn[8].setText("4");
        btn[9].setText("5");
        btn[10].setText("6");
        btn[11].setText("*");
        btn[12].setText("1");
        btn[13].setText("2");
        btn[14].setText("3");
        btn[15].setText("-");
        btn[16].setText("0");
        btn[17].setText(".");
        btn[18].setText("=");
        btn[19].setText("+");

        btn[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
                textField.setText("");
            }
        });

        btn[1].addActionListener(event -> textField.setText(textField.getText() + "Bck"));
        btn[3].addActionListener(event -> textField.setText(textField.getText() + "Close"));
        btn[4].addActionListener(event -> textField.setText(textField.getText() + "7"));
        btn[5].addActionListener(event -> textField.setText(textField.getText() + "8"));
        btn[6].addActionListener(event -> textField.setText(textField.getText() + "9"));
        btn[7].addActionListener(event -> textField.setText(textField.getText() + "/"));
        btn[8].addActionListener(event -> textField.setText(textField.getText() + "4"));
        btn[9].addActionListener(event -> textField.setText(textField.getText() + "5"));
        btn[10].addActionListener(event -> textField.setText(textField.getText() + "6"));
        btn[11].addActionListener(event -> textField.setText(textField.getText() + "*"));
        btn[12].addActionListener(event -> textField.setText(textField.getText() + "1"));
        btn[13].addActionListener(event -> textField.setText(textField.getText() + "2"));
        btn[14].addActionListener(event -> textField.setText(textField.getText() + "3"));
        btn[15].addActionListener(event -> textField.setText(textField.getText() + "-"));
        btn[16].addActionListener(event -> textField.setText(textField.getText() + "0"));
        btn[17].addActionListener(event -> textField.setText(textField.getText() + "."));
        btn[18].addActionListener(event -> textField.setText(textField.getText() + "="));
        btn[19].addActionListener(event -> textField.setText(textField.getText() + "+"));

        c1.add(panel);
        c1.add(panel2);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(300, 350);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args){
        new GUIFIX();
    }
}