/*
 * Written by Nititorn Kijprasopchok
 * ID: 6530300295
 */

package mrSmile;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Lab92PaintPanel extends JPanel{
    private final ArrayList<Point> points = new ArrayList<>();
    private int count = 0;

    public Lab92PaintPanel(){
        addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent event){
                    points.add(event.getPoint());
                    count++;
                    if(count % 2 == 0){
                        repaint();
                    }
                }
        });

        addMouseListener(new MouseAdapter() {
                public void mouseReleased(MouseEvent event){
            }
        });
        
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for(int i = 0; i < points.size(); i++){
            if(i % 2 == 0){
                g.drawLine((int)(points.get(i).getX()), (int)(points.get(i).getY()), (int)(points.get(i+1).getX()), (int)(points.get(i+1).getY()));
            }
        }
    }
}
