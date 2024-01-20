/*
 * Written by Nititorn Kijprasopchok
 * ID: 6530300295
 */
package HW6;

public class Product {
    //instance variables
    private String id;
    private String name;
    private double price;

    //Product constructor
    public Product(String id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
        if(this.price < 0.0){
            this.price = 0.0;
        }
    }

    //method for get id
    public String getId(){
        return this.id;
    }

    //method for get name
    public String getName(){
        return this.name;
    }

    //method for set the price
    public void setPrice(double price){
        this.price = price;
        if(this.price < 0.0){
            this.price = 0.0;
        }
    }

    //method for get price
    public double getPrice(){
        return this.price;
    }
}
