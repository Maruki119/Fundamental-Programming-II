/*
 * Written by Nititorn Kijprasopchok
 * ID: 6530300295
 */
public class TestQuadrilateral {
    public static void main(String[] args) {
        //Find area of trapezoid
        Trapezoid trapezoid = new Trapezoid(new Point(1, 2), new Point(0, 0), new Point(3, 2), new Point(4, 0));
        System.out.println("Area of Trapezoid = " + trapezoid.getArea());

        //Find area of parallelogram
        Parallelogram parallelogram = new Parallelogram(new Point(1, 1), new Point(0, 0), new Point(4, 2), new Point(3, 0));
        System.out.println("Area of Parallelogram = " + parallelogram.getArea());

        //Find area of rectangle
        Rectangle rectangle = new Rectangle(new Point(0, 2), new Point(0, 0), new Point(3, 2), new Point(3, 0));
        System.out.println("Area of Rectangle = " + rectangle.getArea());

        //Find area of square
        Square square = new Square(new Point(0, 2), new Point(0, 0), new Point(2, 2), new Point(2, 0));
        System.out.println("Area of Square = " + square.getArea());
    }
}
