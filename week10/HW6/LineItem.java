/*
 * Written by Nititorn Kijprasopchok
 * ID: 6530300295
 */
package HW6;

public class LineItem {
    //instance variables
    private Product item;
    private int quantity;

    //LineItem constructor
    public LineItem(Product product, int quantity){
        this.item = product;
        this.quantity = quantity;
        if(this.quantity < 0){
            this.quantity = 0;
        }
    }

    //method for get product
    public Product getProduct(){
        return this.item;
    }

    //method for get quantity
    public int getQuantity(){
        return this.quantity;
    }

    //method for get total price
    public double getTotalPrice(){
        return this.quantity * getProduct().getPrice();
    }
}
