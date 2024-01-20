/*
 * Written by Nititorn Kijprasopchok
 * ID: 6530300295
 */

import java.util.Scanner;

public class Lab6Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mass, height, total;

        System.out.print("Input1 Mass: ");
        mass = sc.nextDouble();
        System.out.print("Input2 Height: ");
        height = sc.nextDouble();
        total = mass * 10000 / (height * height);
        System.out.println("Output BMI: " + Math.round(total*1000000.0)/1000000.0);
        sc.close();
    }
}