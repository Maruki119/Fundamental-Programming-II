public class CircleTest {
    public static void main(String[] args){
        Circle c1 = new Circle();
        double area;
        String str;
        c1.setRadius(72.0);
        c1.setColor("Green");

        str = c1.toString();
        area = c1.getArea();

        System.out.println(str);
        System.out.println("The circle has Area of " + (double)Math.round(area*100)/100);

        c1.setRadius(2.0);
        c1.setColor("Blue");

        str = c1.toString();
        area = c1.getArea();

        System.out.println(str);
        System.out.println("The circle has Area of " + (double)Math.round(area*100)/100);
    }
}