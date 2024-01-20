package gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI4 extends JFrame{
    private JTextField textField;
    private Font font;
    private JPanel panel, panel2, panel3;
    private JButton btnCls, btnBck, btnClose, btnZero, btnOne, btnTwo, btnThree, btnFour,
                    btnFive, btnSix, btnSeven, btnEight, btnNine, btnDot, btnEqu, btnPlus, 
                    btnMinus, btnDivide, btnMul;

    public GUI4(){
        super("Calculator");

        Container c1 = getContentPane();
        c1.setLayout(new FlowLayout());

        panel = new JPanel();
        font = new Font("TimesRoman", Font.BOLD, 16);
        textField = new JTextField("", 18);
        textField.setFont(font);

        panel.add(textField);

        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(5, 5, 6, 20));
        panel3 = new JPanel();

        //create button
        btnCls = new JButton("Cls");
        btnBck = new JButton("Bck");
        btnClose = new JButton("Close");
        btnZero = new JButton("0");
        btnOne = new JButton("1");
        btnTwo = new JButton("2");
        btnThree = new JButton("3");
        btnFour = new JButton("4");
        btnFive = new JButton("5");
        btnSix = new JButton("6");
        btnSeven = new JButton("7");
        btnEight = new JButton("8");
        btnNine = new JButton("9");
        btnDot = new JButton(".");
        btnEqu = new JButton("=");
        btnPlus = new JButton("+");
        btnMinus = new JButton("-");
        btnDivide = new JButton("/");
        btnMul = new JButton("*");

        //set size for button
        btnCls.setPreferredSize(new Dimension(60, 35));
        btnBck.setPreferredSize(new Dimension(60, 35));
        btnClose.setPreferredSize(new Dimension(60, 35));
        btnZero.setPreferredSize(new Dimension(60, 35));
        btnOne.setPreferredSize(new Dimension(60, 35));
        btnTwo.setPreferredSize(new Dimension(60, 35));
        btnThree.setPreferredSize(new Dimension(60, 35));
        btnFour.setPreferredSize(new Dimension(60, 35));
        btnFive.setPreferredSize(new Dimension(60, 35));
        btnSix.setPreferredSize(new Dimension(60, 35));
        btnSeven.setPreferredSize(new Dimension(60, 35));
        btnEight.setPreferredSize(new Dimension(60, 35));
        btnNine.setPreferredSize(new Dimension(60, 35));
        btnDot.setPreferredSize(new Dimension(60, 35));
        btnEqu.setPreferredSize(new Dimension(60, 35));
        btnPlus.setPreferredSize(new Dimension(60, 35));
        btnMinus.setPreferredSize(new Dimension(60, 35));
        btnDivide.setPreferredSize(new Dimension(60, 35));
        btnMul.setPreferredSize(new Dimension(60, 35));

        //add button
        panel2.add(btnCls); panel2.add(btnBck); panel2.add(panel3); panel2.add(btnClose);
        panel2.add(btnSeven); panel2.add(btnEight); panel2.add(btnNine); panel2.add(btnDivide);
        panel2.add(btnFour); panel2.add(btnFive); panel2.add(btnSix); panel2.add(btnMul);
        panel2.add(btnOne); panel2.add(btnTwo); panel2.add(btnThree); panel2.add(btnMinus);
        panel2.add(btnZero); panel2.add(btnDot); panel2.add(btnEqu); panel2.add(btnPlus);
        
        c1.add(panel);
        c1.add(panel2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(350, 350);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args){
        new GUI4();
    }
}