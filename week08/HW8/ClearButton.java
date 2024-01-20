/*
 * Written by Nititorn Kijprasopchok
 * ID: 6530300295
 */

import java.awt.*;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearButton extends JFrame{
    private JTextField textField;
    private JButton clearBtn;
    public ClearButton(){
        super("Clear Button");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        //create textfield
        textField = new JTextField(20);
        c.add(textField);

        //create button
        clearBtn = new JButton("Clear");
        c.add(clearBtn);

        //event handler for textfield
        textField.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                System.out.println(textField.getText());
            }
        });

        //event handler for button
        clearBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                textField.setText("");
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args){
        new ClearButton();
    }
}
