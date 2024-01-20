import java.util.Scanner;

public class Lab21ScannerClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //input
        System.out.print("Enter NAME : ");
        String name = sc.nextLine();
        System.out.print("Enter ID : ");
        String id = sc.nextLine();
        System.out.print("Enter Birthday (dd/mm/yyyy) : ");
        String birth = sc.nextLine();
        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        System.out.print("Enter GPA : ");
        double gpa = sc.nextDouble();
        sc.close();

        //output
        System.out.println("My Name is " + name);
        System.out.println("Birthday : " + birth + "\tAge : " + age);
        System.out.println("ID : " + id + "\t\tGPA : " + gpa);
    }
}
