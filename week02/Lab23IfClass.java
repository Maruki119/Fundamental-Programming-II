import java.util.Scanner;

public class Lab23IfClass {
    public static void main(String[] args){
        int age, height;
        System.out.print("Please input your age :");
        Scanner sc_age = new Scanner(System.in);
        age = sc_age.nextInt();
        System.out.print("Please input your height :");
        Scanner sc_height = new Scanner(System.in);
        height = sc_height.nextInt();

        if(age <= 10){
            if(height <= 100){
                System.out.println("Your ticket is 0 baht.");
            }
            else{
            System.out.println("Your ticket price is 890 baht.");
            }
        }else{
            System.out.println("Your ticket price is 1190 baht.");
        }
    }
}
