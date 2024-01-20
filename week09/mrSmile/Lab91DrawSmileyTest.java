package mrSmile;

import javax.swing.*;

public class Lab91DrawSmileyTest {
    public static void main(String[] args){
        Lab91DrawSmiley panel = new Lab91DrawSmiley();
        JFrame app = new JFrame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(250, 250);
        app.setVisible(true);
    }
}