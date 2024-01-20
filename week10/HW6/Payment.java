/*
 * Written by Nititorn Kijprasopchok
 * ID: 6530300295
 */
package HW6;

public abstract class Payment {
    private double amount;

    public Payment(double amount){
        if(amount < 0){
            this.amount = 0;
        }
        else{
            this.amount = amount;
        }
    }

    public double getAmount(){
        return amount;
    }
}
