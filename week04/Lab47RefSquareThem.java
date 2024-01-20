import java.util.Scanner;
public class Lab47RefSquareThem{
    public static void squareThem(AddInt num1, AddInt num2){
        num1.value *= num1.value;
        num2.value *= num2.value;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        AddInt num1 = new AddInt();
        AddInt num2 = new AddInt();

        System.out.printf("Enter number#1 : ");
        num1.value = sc.nextInt();

        System.out.printf("Enter number#2 : ");
        num2.value = sc.nextInt();

        squareThem(num1, num2);

        System.out.printf("Results are {%d} and {%d}", num1.value, num2.value);
    }
}