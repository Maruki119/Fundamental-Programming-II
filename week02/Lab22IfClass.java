import java.util.Scanner;

public class Lab22IfClass {
    public static void main(String[] args){
        Scanner scan_double = new Scanner(System.in);
        Scanner scan_str = new Scanner(System.in);
        String str;
        char member;
        double price;

        System.out.print("Please input your item's price : ");
        price = scan_double.nextDouble();

        System.out.print("Are you my member? : ");
        str = scan_str.nextLine();
        member = str.charAt(0);

        if(member == 'N'){
            System.out.println("Your price is " + Math.round(price) + " baht. Thank you.");
        }
        else{
            System.out.println("Your discount is " + Math.round(price/10) + " baht.");
            price -= price/10;
            System.out.println("Your price is " + Math.round(price) + ". Thank you.");
        }

    }
}
