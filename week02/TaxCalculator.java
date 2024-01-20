/*
 * Written by Nititorn Kijprasopchok
 * ID : 6530300295
 */

import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long netIncome, salary, othSalary = 0, cost, ded;
        float tax, taxTotal, sumTaxTotal = 0;
        int count1 = 0, count2;
        char choice2;

        System.out.print("Enter Salary : ");
        salary = sc.nextLong();
        System.out.print("Enter Year cost : ");
        cost = sc.nextLong();
        System.out.print("Enter deduction : ");
        ded = sc.nextLong();

        System.out.print("\nYou have other income? ");
        sc.nextLine();
        String choice1 = sc.nextLine();
        choice2 = choice1.charAt(0);

        if(choice2 == 'Y'){
            System.out.print("Input other income : ");
            othSalary = sc.nextLong();
        }

        sc.close();

        salary *= 12;
        netIncome = salary - cost - ded + othSalary;
        //tax value check
        if(netIncome <= 150000){
            tax = 0;
        }else if(netIncome <= 300000){
            tax = 5;
        }else if(netIncome <= 500000){
            tax = 10;
        }else if(netIncome <= 750000){
            tax = 15;
        }else if(netIncome <= 1000000){
            tax = 20;
        }else if(netIncome <= 2000000){
            tax = 25;
        }else if(netIncome <= 5000000){
            tax = 30;
        }else{
            tax = 35;
        }

        if(choice2 == 'Y'){ //Income output
            System.out.println("\nIncome : (" + (salary/12) + "x12) - " + cost + " - " + ded + " + " + othSalary + " = " + netIncome);
            System.out.println("Tax is " + Math.round(tax) + "%\n");
        }else{
            System.out.println("\nIncome : (" + (salary/12) + "x12) - " + cost + " - " + ded + " = " + netIncome);
            System.out.println("Tax is " + Math.round(tax) + "%\n");
        }

        if(tax == 0){ //Free tax output
            System.out.println("Your Tax = Free Tax");
        }else if(tax == 5){
            System.out.print("Cal Tax " + netIncome + " - 150000 = ");
            netIncome -= 150000;
            taxTotal = netIncome * (tax/100);
            System.out.println(netIncome + " * " + Math.round(tax) + "% = " + Math.round(taxTotal));
            System.out.println("Your Tax = " + Math.round(taxTotal) + " BTH");
        }

        int i = (int)tax;
        while(i != 0){ //check count loop
            count1++;
            i -= 5;
        }

        i = (int)tax;
        count2 = count1;
        while(i != 0){
            if(i >= 5 && choice2 == 'Y'){
                System.out.println("Step " + count1--);
                System.out.print("Cal Tax " + Math.round(netIncome));
                while(count2 != 0){
                    if(netIncome <= 500000){
                        netIncome -= 150000;
                        System.out.print(" - 150000 = " + Math.round(netIncome));
                    }else if(netIncome <= 750000){
                        netIncome -= 200000;
                        System.out.print(" - 200000 = " + Math.round(netIncome));
                    }else if(netIncome <= 2000000){
                        netIncome -= 250000;
                        System.out.print(" - 250000 = " + Math.round(netIncome));
                    }else if(netIncome <= 5000000){
                        netIncome -= 1000000;
                        System.out.print(" - 1000000 = " + Math.round(netIncome));
                    }else if(netIncome <= 10000000){
                        netIncome -= 2000000;
                        System.out.print(" - 2000000 = " + Math.round(netIncome));
                    }else{
                        netIncome -= 5000000;
                        System.out.println(" - 5000000 = " + Math.round(netIncome));
                    }
                    count2--;
                }
                System.out.print(" * " + Math.round(tax) + "% = ");
                taxTotal = (float)netIncome *(tax/100);
                sumTaxTotal += taxTotal;
                System.out.println(Math.round(taxTotal));
                if(i <= 10){
                    netIncome = 150000;
                }else if(i <= 15){
                    netIncome = 200000;
                }else if(i <= 25){
                    netIncome = 250000;
                }else if(i <= 30){
                    netIncome = 1000000;
                }else if(i <= 35){
                    netIncome = 3000000;
                }else{
                    netIncome = 5000000;
                }
            }
            i -=5;
            tax -= 5;
        }
            if(choice2 == 'Y'){
                System.out.println("Your Tax = " + Math.round(sumTaxTotal) + " BTH");
        }
    }
}