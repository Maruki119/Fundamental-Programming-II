import java.util.Scanner;

public class Lab24While {
    public static void main(String[] args){
        int i, N;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N : ");
        N = scan.nextInt();

        i = N;
        while(i > 0){
            if(i%2 == 0){
                System.out.println(i);
            }
            i--;
        }
    }
}
