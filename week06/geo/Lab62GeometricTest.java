public class Lab62GeometricTest {
    public static void main(String[] args){
        double area = 0.0;
        GeometricObject[] objs = {new Circle(5), new Rectangle(2,4)};
        for(GeometricObject obj : objs){
            if(obj.equals(objs[0])){
                Circle c = (Circle)obj;
                double diameter = c.getDiameter();
                System.out.println("Diameter of circle = " + diameter);
            }
        }
    }
}
