public class Circle{
    //private instance variable
    private double radius;
    private String color;

    //constructor no argu
    public Circle(){
        this(1.0, "red");
    }

    //2nd constructor with argu
    public Circle(double radius){
        this(radius, "red");
    }

    //3rd constructor given radius and color
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    //A public method for retrieving the radius
    public double getRadius(){
        return this.radius;
    }

    //A public method for set the radius
    public void setRadius(double radius){
        this.radius = radius;
    }

    //A public method for retrieving the color
    public String getColor(){
        return this.color;
    }

    //A public method for set the color
    public void setColor(String color){
        this.color = color;
    }

    public String toString(){
        return "Circle[radius=" + this.radius + " color=" + this.color + "]";
    }

    //A public method for computing the area
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
}