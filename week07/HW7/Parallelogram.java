/*
 * Written by Nititorn Kijprasopchok
 * ID: 6530300295
 */
public class Parallelogram extends Quadrilateral{

    //attribute of area
    private double area;

    //constructor for parallelogram
    public Parallelogram(Point topLeft, Point buttomLeft,  Point topRight, Point buttomRight){
        super(topLeft, buttomLeft, topRight, buttomRight);
    }

    //override method getArea
    @Override
    public double getArea(){
        //Parallelogram area = ฐาน * ความสูง
        double height = getEndpoint(2).getY() - getEndpoint(3).getY();
        double base = getEndpoint(3).getX() - getEndpoint(1).getX();
        area = base * height;
        return area;
    }
}
