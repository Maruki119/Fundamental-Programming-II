package Clock;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Lab94StillClock extends JPanel{
    private int hour;
    private int minute;
    private int second;
    private boolean hourHandVisible = true;
    private boolean minuteHandVisible = true;
    private boolean secondHandVisible = true;

    //Construct a default clock with the current time
    public Lab94StillClock(){
        setCurrentTime();
    }

    //construct a clock with specified hour, minute, and second
    public Lab94StillClock(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //return hour
    public int getHour(){
        return hour;
    }

    //set a new hour
    public void setHour(int hour){
        this.hour = hour;
        repaint();
    }

    //return minute
    public int getMinute(){
        return minute;
    }

    //set a new minute
    public void setMinute(int minute){
        this.minute = minute;
        repaint();
    }

    //return second
    public int getSecond(){
        return second;
    }

    //set a new second
    public void setSecond(int second){
        this.second = second;
        repaint();
    }

    //Draw the clock
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        //initialize clock parameters
        int clockRadius = (int)(Math.min(getWidth(), getHeight()) * 0.8 * 0.5);
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;

        //Draw Circle
        g.setColor(Color.BLACK);
        g.drawOval(xCenter - clockRadius, yCenter - clockRadius,
                    2 * clockRadius, 2 * clockRadius);
        g.drawString("12", xCenter - 5, yCenter - clockRadius + 12);
        g.drawString("9", xCenter - clockRadius + 3, yCenter + 5);
        g.drawString("3", xCenter + clockRadius - 10, yCenter + 3);
        g.drawString("6", xCenter - 3, yCenter + clockRadius - 3);

        //Draw second hand
        if(secondHandVisible){
            int sLength = (int)(clockRadius * 0.8);
            int xSecond = (int)(xCenter + sLength *
                                Math.sin(second * (2 * Math.PI / 60)));
            int ySecond = (int)(xCenter - sLength *
                                Math.cos(second * (2 * Math.PI / 60)));
            g.setColor(Color.RED);
            g.drawLine(xCenter, yCenter, xSecond, ySecond);
        }

        //Draw minute hand
        if(minuteHandVisible){
            int mLength = (int)(clockRadius * 0.65);
            int xMinute = (int)(xCenter + mLength *
                                Math.sin(minute * (2 * Math.PI / 60)));
            int yMinute = (int)(xCenter - mLength *
                                Math.cos(minute * (2 * Math.PI / 60)));
            g.setColor(Color.BLUE);
            g.drawLine(xCenter, yCenter, xMinute, yMinute);
        }

        //Draw hour hand
        if(hourHandVisible){
            int hLength = (int)(clockRadius * 0.5);
            int xHour = (int)(xCenter + hLength *
                                Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12)));
            int yHour = (int)(xCenter - hLength *
                                Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12)));
            g.setColor(Color.GREEN);
            g.drawLine(xCenter, yCenter, xHour, yHour);
        }
    }

    public void setCurrentTime(){
        //construct a calendar for the current data and time
        Calendar calendar = new GregorianCalendar();

        //set current hour, minute and second
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }

    public Dimension getPreferredSize(){
        return new Dimension(200, 200);
    }

    public boolean isHourHandVisible(){
        return hourHandVisible;
    }

    public boolean isMinuteHandVisible(){
        return minuteHandVisible;
    }

    public boolean isSecondHandVisible(){
        return secondHandVisible;
    }

    public void setHourHandVisible(boolean hourHandVisible){
        this.hourHandVisible = hourHandVisible;
        repaint();
    }

    public void setMinuteHandVisible(boolean minuteHandVisible){
        this.minuteHandVisible = minuteHandVisible;
        repaint();
    }

    public void setSecondHandVisible(boolean secondHandVisible){
        this.secondHandVisible = secondHandVisible;
        repaint();
    }
}
