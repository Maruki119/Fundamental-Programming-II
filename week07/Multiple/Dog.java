public class Dog{
    private String name;

    public Dog(){
        name = null;
    }

    public Dog(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String color){
        this.name = color;
    }

    public void bark(){
        System.out.println("Woof Woof");
    }
}
