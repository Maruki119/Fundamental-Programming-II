import java.util.ArrayList;

public class Invoice{
    //instance variables
    private String id;
    private Customer customer;
    private ArrayList<LineItem> items = new ArrayList<LineItem>();

    //Invoice constructor
    public Invoice(String id, Customer customer){
        this.id = id;
        this.customer = customer;
    }

    //method for adding an Items
    public void addItem(Product product, int quantity){
        this.items.add(new LineItem(product, quantity));
    }

    //method for get id
    public String getId(){
        return this.id;
    }

    //method for get customer
    public Customer getCustomer(){
        return this.customer;
    }

    //method for get lineitem
    public LineItem getLineItem(int i){
        return this.items.get(i);
    }

    //method for get total price
    public double getTotalPrice(){
        double sum = 0;
        for(int i = 0; i < this.items.size(); i++){
            sum += this.items.get(i).getTotalPrice();
        }
        return sum;
    }

    //print method
    public void print(){
        System.out.println("INVOICE: #" + getId());
        System.out.println("CUSTOMER: " + getCustomer().getFirstName() + " " + getCustomer().getLastName());
        System.out.println("ITEMS:");
        for(int i = 0; i < this.items.size(); i++){
            System.out.println((i+1) + ". " + this.items.get(i).getProduct().getName() + " x " + this.items.get(i).getQuantity() + " = " + this.items.get(i).getTotalPrice());
        }
        System.out.println("TOTAL: " + getTotalPrice() + "\n");
    }
}
