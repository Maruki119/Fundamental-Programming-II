/*
 * Written by Nititorn Kijprasopchok
 * ID: 6530300295
 */

import java.util.Random;

public class AddRandom {
    public static void main(String[] args){
        Random rand = new Random();
        double randNum1 = rand.nextDouble(50);
        double randNum2 = rand.nextDouble(50);
        double result = randNum1 + randNum2;

        System.out.println("Sum of " + randNum1 + " + " + randNum2 + " = " + result);
        if(result > 50)
            System.out.println("\nValue = PASS");
        else
            System.out.println("\nValue = NOT PASS");
    }
}
