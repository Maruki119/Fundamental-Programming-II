package gui;
import java.awt.*;
import javax.swing.*;

public class GUI3TEST {
    public static void main(String[] args) {
        GUI3 panel = new GUI3();
        JFrame app = new JFrame("Paint Applications");
        //JLabel label = new JLabel("Clicked the mouse to draw line", SwingConstants.CENTER);
        Font font = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 20);

        //label.setFont(font);
        //app.add(label, BorderLayout.SOUTH);
        app.add(panel);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(350, 350);
        app.setVisible(true);
        app.setLocationRelativeTo(null);
    }
}