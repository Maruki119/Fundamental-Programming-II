/*
 * Written by Nititorn Kijprasopchok
 * ID: 6530300295
 */
public class Square extends Quadrilateral{

    //attribute of area
    private double area;

    //constructor for square
    public Square(Point topLeft, Point buttomLeft,  Point topRight, Point buttomRight){
        super(topLeft, buttomLeft, topRight, buttomRight);
    }

    //override method getArea
    @Override
    public double getArea(){
        double side = getEndpoint(0).getY() - getEndpoint(1).getY();
        //square area = ด้าน^2
        area = Math.pow(side, 2);
        return area;
    }
}
