/*
 * Written by Nititorn Kijprasopchok
 * ID: 6530300295
 */
package HW6;

public class PlanPayment extends Payment{
    private Payment[] payments;

    public PlanPayment(double amount, int numberOfInstallments){
        super(amount);
        this.payments = new Payment[numberOfInstallments];
    }

    public void setInstallment(int installment, Payment payment){
        try{
            if(payment.getClass().isAssignableFrom(PlanPayment.class)){
                new Exception("");
            }else{
                this.payments[installment] = payment;
            }
        }catch(Exception e){
            System.err.println(e.toString());
        }
    }

    public Payment getInstallment(int installment){
        return payments[installment];
    }

    public String toString(){
        String text = String.format("Amount: %.2f Installment: %d \n", super.getAmount(), payments.length);
        try{
            for(int i = 0; i < payments.length; i++){
                text += "Installment " + i + ": " + payments[i].toString() + "\n";
            }
        }catch(Exception e){
            return text;
        }

        return text;
    }
}
