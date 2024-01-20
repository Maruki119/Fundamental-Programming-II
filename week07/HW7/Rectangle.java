/*
 * Written by Nititorn Kijprasopchok
 * ID: 6530300295
 */
public class Rectangle extends Quadrilateral{

    //attribute of area
    private double area;

    //constructor for Rectangle
    public Rectangle(Point topLeft, Point buttomLeft,  Point topRight, Point buttomRight){
        super(topLeft, buttomLeft, topRight, buttomRight);
    }

    //override method getArea
    @Override
    public double getArea(){
        double height = getEndpoint(0).getY() - getEndpoint(1).getY();
        double weight = getEndpoint(3).getX() - getEndpoint(1).getX();
        //rectangle area = ความยาว * สูง
        area = height * weight;
        return area;
    }
}
