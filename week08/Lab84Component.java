import java.awt.*;
import javax.swing.*;

public class Lab84Component {
    public static void main(String[] args) {
        Font font1 = new Font("Courier New", Font.BOLD, 20);
        JFrame frame = new JFrame("ACCOUNT");
        frame.setSize(480, 360);

        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);

        JLabel label1 = new JLabel("Account login", SwingConstants.CENTER);
        label1.setFont(font1);
        label1.setPreferredSize(new Dimension(480, 100));
        label1.setForeground(Color.WHITE);

        JTextField text1 = new JTextField("Username", 30);
        text1.setFont(font1);

        JPasswordField pass1 = new JPasswordField("12345", 30);
        pass1.setFont(font1);

        JCheckBox checkbox1 = new JCheckBox("Member");
        checkbox1.setFont(font1);
        checkbox1.setBackground(Color.DARK_GRAY);
        checkbox1.setForeground(Color.WHITE);

        JCheckBox checkbox2 = new JCheckBox("Non-Member");
        checkbox2.setFont(font1);
        checkbox2.setBackground(Color.DARK_GRAY);
        checkbox2.setForeground(Color.WHITE);

        JButton btn1 = new JButton("Login");
        btn1.setFont(font1);
        btn1.setPreferredSize(new Dimension(370, 30));

        panel.add(label1); 
        panel.add(text1);
        panel.add(pass1);
        panel.add(checkbox1);
        panel.add(checkbox2);
        panel.add(btn1);

        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}
