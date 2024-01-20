public class Lab64MaxTest {
    public static void main(String[] args){
        //Rectangle
        ComparableRectangle rectangle1 = new ComparableRectangle(4, 5);
        ComparableRectangle rectangle2 = new ComparableRectangle(3, 6);
        Rectangle r = (Rectangle)Max.max(rectangle1, rectangle2);
        System.out.println(r.getArea());

        //Circle
        ComparableCircle circle1 = new ComparableCircle(5);
        ComparableCircle circle2 = new ComparableCircle(3);
        Circle c = (Circle)Max.max(circle1, circle2);
        System.out.println(c.getArea());
    }
}
