/*
 * Written by Nititorn Kijprasopchok
 * ID: 6530300295
 */

public class InvoiceTest {
    public static void main(String[] args){
        //creating customer object
        Customer customer1 = new Customer("1", "John", "Kater");
        Customer customer2 = new Customer("2", "Tom", "Lolan");
        Customer customer3 = new Customer("3", "Jacky", "Chan");

        //creating invoice object
        Invoice invoice1 = new Invoice("01", customer1);
        Invoice invoice2 = new Invoice("02", customer2);
        Invoice invoice3 = new Invoice("03", customer3);

        //creating product object
        Product product1 = new Product("001", "Table", 1000.0);
        Product product2 = new Product("002", "Chair", 250.0);
        Product product3 = new Product("003", "Sofa", 2500.0);
        Product product4 = new Product("004", "Bed", 3000.0);
        Product product5 = new Product("005", "TV", 5000.0);

        //adding items for first invoice
        invoice1.addItem(product1, 1);
        invoice1.addItem(product2, 4);
        invoice1.addItem(product5, 1);

        //adding items for second invoice
        invoice2.addItem(product3, 1);
        invoice2.addItem(product4, 1);
        invoice2.addItem(product5, 1);

        //adding items for thrid invoice
        invoice3.addItem(product1, 2);
        invoice3.addItem(product2, 8);
        invoice3.addItem(product3, 2);
        invoice3.addItem(product4, 1);
        invoice3.addItem(product5, 1);

        //print invoice from print method
        invoice1.print();
        invoice2.print();
        invoice3.print();
    }
}
