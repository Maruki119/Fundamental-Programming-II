/*
 * Written by Nititorn Kijprasopchok
 * ID: 6530300295
 */

 package gui;
 import java.awt.*;
 import java.awt.event.*;
 import java.util.*;
 import javax.swing.*;
 
 public class GUI3 extends JPanel{
    private final ArrayList<Point> points = new ArrayList<>();
    private final ArrayList<Point> points2 = new ArrayList<>();
    private int checkRadio = 1;
    private int count = 0;
 
    public GUI3(){
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent event){
                if(checkRadio == 1){
                    points2.add(event.getPoint());
                    repaint();
                }
            }
        });
        
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent event){
                if(checkRadio == 0){
                    points.add(event.getPoint());
                    count++;
                    if(count % 2 == 0){
                        repaint();
                    }
                }
            }
        });
 
        addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent event){
            }
        });
     }

    public void setCheckRadio(int checkRadio){
        this.checkRadio = checkRadio;
    }
 
     public void paintComponent(Graphics g){
        super.paintComponent(g);

        for(Point point : points2){
            g.fillOval(point.x, point.y, 5, 5);
        }
    
        for(int i = 0; i < points.size(); i++){
            if(i % 2 == 0){
                g.drawLine((int)(points.get(i).getX()), (int)(points.get(i).getY()), (int)(points.get(i+1).getX()), (int)(points.get(i+1).getY()));
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Master Paint Applications");
        Font font = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 20);
        GUI3 panel = new GUI3();
        JPanel panel2 = new JPanel();
        JRadioButton draw = new JRadioButton("Draw", true);
        JRadioButton line = new JRadioButton("Line", false);

        draw.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent event){
                if(event.getStateChange() == ItemEvent.SELECTED){
                    panel.setCheckRadio(1);
                }
            }
        });
        draw.setFont(font);

        line.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent event){
                if(event.getStateChange() == ItemEvent.SELECTED){
                    panel.setCheckRadio(0);
                }
            }
        });
        line.setFont(font);

        panel2.add(draw);
        panel2.add(line);

        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(draw);
        radioButtonGroup.add(line);

        frame.add(panel, BorderLayout.CENTER);
        frame.add(panel2, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //frame.setLocationRelativeTo(null);
        frame.setSize(550, 550);
    }
 }
 