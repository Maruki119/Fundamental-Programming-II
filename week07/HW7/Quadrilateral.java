/*
 * Written by Nititorn Kijprasopchok
 * ID: 6530300295
 */

/*
 * Parallelogram area = ฐาน * ความสูง
 * Trapezoid area = 1/2 * ผลบวกด้านคู่ขนาน * ความสูง
 * Rectangle area = กว้าง * ยาว
 * Square area = กว้าง * ยาว หรือ ด้าน^2
 */

public class Quadrilateral {
    //private attribute array of endpoints
    private Point[] endpoints;

    //constructor for Quadrilateral
    public Quadrilateral(Point p0, Point p1, Point p2, Point p3){
        this.endpoints = new Point[] {p0, p1, p2, p3};
    }

    //double method for get an area
    public double getArea(){
        return 0.0;
    }

    //Point method for get endpoints
    public Point getEndpoint(int index){
        return endpoints[index];
    }
}