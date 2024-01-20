public class Circle extends GeometricObject{
    private double radius;

    public Circle(){
        this(0.0);
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public String toString(){
        return "Color: " + getColor() + ",isFilled: " + isFilled() + ",radius: " + radius;
    }

    public double getDiameter(){
        return 2 * Math.PI * radius;
    }
}
