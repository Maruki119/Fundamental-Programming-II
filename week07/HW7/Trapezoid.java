public class Trapezoid extends Quadrilateral{

    //attribute of area
    private double area;

    //constructor for Trapezoid
    public Trapezoid(Point topLeft, Point buttomLeft,  Point topRight, Point buttomRight){
        super(topLeft, buttomLeft, topRight, buttomRight);
    }

    //override method getArea
    @Override
    public double getArea(){
        //Trapezoid area = 1/2 * ผลบวกด้านคู่ขนาน * ความสูง
        double height = getEndpoint(2).getY() - getEndpoint(3).getY();
        double topLenght = getEndpoint(2).getX() - getEndpoint(0).getX();
        double buttomLenght = getEndpoint(3).getX() - getEndpoint(1).getX();
        area = 0.5 * (topLenght + buttomLenght) * height;
        return area;
    }
}
