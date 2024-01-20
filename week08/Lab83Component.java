import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.Icon;

public class Lab83Component {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");
        frame.setSize(858, 858);

        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);

        Icon icon1 = new ImageIcon("pic/button.png");
        Icon icon2 = new ImageIcon("pic/icon.gif");

        JButton btn1 = new JButton("Button", icon1);

        JLabel label1 = new JLabel("Click here", SwingConstants.RIGHT);
        JLabel label2 = new JLabel("Animation", icon1, SwingConstants.LEFT);

        label1.setForeground(Color.WHITE);
        label2.setForeground(Color.WHITE);

        //panel.add(btn1);
        panel.add(label1);
        panel.add(label2);

        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}
