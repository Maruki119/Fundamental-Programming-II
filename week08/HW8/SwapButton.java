/*
 * Written by Nititorn Kijprasopchok
 * ID: 6530300295
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwapButton extends JFrame{
    private JTextField textField1, textField2, textFieldTemp;
    private JCheckBox check1, check2;
    private JLabel label;
    private JButton btn1, btn2;
    private int checkBoxHander1 = 0, checkBoxHander2 = 0;

    public SwapButton(){
        super("Swap Button");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        //2 text field
        textField1 = new JTextField(25);
        textField2 = new JTextField(25);
        c.add(textField1); c.add(textField2);

        //1 label
        label = new JLabel("[LABEL HERE]", SwingConstants.CENTER);
        label.setPreferredSize(new Dimension(200, 50));
        c.add(label);

        //2 check box
        check1 = new JCheckBox("Swap");
        check2 = new JCheckBox("Modify on Swap");
        c.add(check1); c.add(check2);

        //2 button
        btn1 = new JButton("Submit");
        btn2 = new JButton("Clear");
        c.add(btn1); c.add(btn2);

        //event handler for check box 1
        check1.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent event){
                if(event.getStateChange() == event.SELECTED){
                    checkBoxHander1 = 1;
                }else{
                    checkBoxHander1 = 0;
                }
            }
        });

        //event handler for check box 2
        check2.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent event){
                if(event.getStateChange() == event.SELECTED){
                    checkBoxHander2 = 1;
                }else{
                    checkBoxHander2 = 0;
                }
            }
        });

        //event handler for submit button
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                if(checkBoxHander1 == 1 && checkBoxHander2 == 0){
                    textFieldTemp = textField1;
                    textField1 = textField2;
                    textField2 = textFieldTemp;
                    label.setText(textField1.getText() + textField2.getText());
                }else{
                    label.setText(textField1.getText() + textField2.getText());
                }
            }
        });

        //event handler for clear button
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                textField1.setText("");
                textField2.setText("");
                label.setText("");
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 250);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args){
        new SwapButton();
    }
}