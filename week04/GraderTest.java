/*
 * Written by Nititorn Kijprasopchok
 * ID: 6530300295
 */

import java.util.Scanner;

public class GraderTest {
    public static void main(String[] args) {
        //create obj from grader class
        Grader grader1 = new Grader(null);
        Grader grader2 = new Grader(null);
        Scanner sc = new Scanner(System.in);

        //1st input
        //input name
        System.out.print("Enter course name: ");
        grader1.courseName = sc.nextLine();

        //input students count
        System.out.print("Enter number of students: ");
        grader1.count = sc.nextInt();

        //input student score
        System.out.println("\nInput scores");
        for(int i = 0; i < grader1.countStudents(); i++){
            double score = sc.nextDouble();
            grader1.addScores(score);
        }

        //output mean value and below mean and above mean value
        System.out.print("\nMean for " + grader1.courseName + " = ");
        System.out.printf("%.2f\n", grader1.mean());
        System.out.println("Below mean = " + grader1.belowMean());
        System.out.println("Above mean = " + grader1.aboveMean());
        //output show grade
        grader1.showGrade();

        //2nd input
        //input name
        System.out.print("Enter course name: ");
        sc.nextLine();
        grader2.courseName = sc.nextLine();

        //input students count
        System.out.print("Enter number of students: ");
        grader2.count = sc.nextInt();

        //input student score
        System.out.println("\nInput scores");
        for(int i = 0; i < grader2.countStudents(); i++){
            double score = sc.nextDouble();
            grader2.addScores(score);
        }

        //output mean value and below mean and above mean value
        System.out.print("\nMean for " + grader2.courseName + " = ");
        System.out.printf("%.2f\n", grader2.mean());
        System.out.println("Below mean = " + grader2.belowMean());
        System.out.println("Above mean = " + grader2.aboveMean());
        //output show grade
        grader2.showGrade();

    }
}
