import java.util.Scanner;

public class SumAverageRunningInt {
    public static void main(String[] args){
        int lowerBound, upperBound, count = 0;
        float average, sum = 0f, i = 0f;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lower bound value: ");
        lowerBound = sc.nextInt();

        System.out.print("Enter the upper bound value: ");
        upperBound = sc.nextInt();
        sc.close();

        i = lowerBound;
        while(i <= upperBound){
            sum += i;
            i++;
            count++;
        }
        average = sum / count;
        System.out.println("\nThe sum of " + lowerBound + " to " + upperBound + " is " + Math.round(sum) + ".");
        System.out.println("The average is " + average);
    }
}
