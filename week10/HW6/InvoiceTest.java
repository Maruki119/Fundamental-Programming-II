/*
 * Written by Nititorn Kijprasopchok
 * ID: 6530300295
 */
package HW6;

public class InvoiceTest {
    public static void main(String[] args){
        //creating customer object
        Customer customer1 = new Customer("1", "Nititorn", "Kijprasopchok");
        Customer customer2 = new Customer("2", "John", "Kater");
        Customer customer3 = new Customer("3", "Tom", "Lolan");
        Customer customer4 = new Customer("4", "Jacky", "Chan");

        //creating invoice object
        Invoice invoice1 = new Invoice("01", customer1);
        Invoice invoice2 = new Invoice("02", customer2);
        Invoice invoice3 = new Invoice("03", customer3);
        Invoice invoice4 = new Invoice("04", customer4);

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

        //adding items for fourth invoice
        invoice4.addItem(product1, 4);
        invoice4.addItem(product2, 16);
        invoice4.addItem(product3, 4);
        invoice4.addItem(product4, 3);
        invoice4.addItem(product5, 3);

        //set invoice payment
        invoice1.setPayment(null);
        invoice2.setPayment(new CashPayment(invoice2.getTotalPrice(), 1000));
        invoice3.setPayment(new CreditPayment(invoice3.getTotalPrice(), "6530300295"));
        invoice4.setPayment(new PlanPayment(invoice4.getTotalPrice(), 10));
        ((PlanPayment) invoice4.getPayment()).setInstallment(0, new CreditPayment(invoice4.getTotalPrice()/10, "6530300295"));
        ((PlanPayment) invoice4.getPayment()).setInstallment(1, new CashPayment(invoice4.getTotalPrice()/10, invoice4.getTotalPrice()/10));
        ((PlanPayment) invoice4.getPayment()).setInstallment(2, new CreditPayment(invoice4.getTotalPrice()/10, "6530300295"));


        //print invoice from print method
        invoice1.print();
        invoice2.print();
        invoice3.print();
        invoice4.print();
    }
}
