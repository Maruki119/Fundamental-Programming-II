/*
 * Written by Nititorn Kijprasopchok
 * ID: 6530300295
 */
package HW6;

public class CashPayment extends Payment{
    private double tendered;

    public CashPayment(double amount, double tendered){
        super(amount);
        this.tendered = tendered;
    }

    public double getTendered(){
        return tendered;
    }

    public double getChange(){
        return getTendered() - super.getAmount();
    }

    public String toString(){
        return String.format("Amount: %.2f Tendered: %.2f Change: %.2f", super.getAmount(), getTendered(), getChange());
    }
}
