/*
 * Written by Nititorn Kijprasopchok
 * ID: 6530300295
 */
package HW6;

public class CreditPayment extends Payment{
    private String cardNumber;

    public CreditPayment(double amount, String cardNumber){
        super(amount);
        this.cardNumber = cardNumber;
    }

    public String getCardNumber(){
        return cardNumber;
    }

    public String toString(){
        return String.format("Amount: %.2f Card Number: %s", super.getAmount(), getCardNumber());
    }
}
