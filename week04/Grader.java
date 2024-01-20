/*
 * Written by Nititorn Kijprasopchok
 * ID: 6530300295
 */

import java.util.ArrayList;

public class Grader {
    //public instance variable
    public String courseName;
    public ArrayList<Double> scores = new ArrayList<Double>();
    public int count;

    //constructor grader with argument
    public Grader(String name){
        this.courseName = name;
    }

    //A public method for add a score
    public void addScores(double score){
        scores.add(score);
    }

    //A public method for count students
    public int countStudents(){
        return this.count;
    }

    //A public method for cal mean value
    public double mean(){
        double sum = 0;
        for(int i = 0; i < this.count; i++){
            sum += scores.get(i);
        }
        sum /= this.count;
        return sum;
    }

    //A public method for check below mean
    public int belowMean(){
        int count = 0;
        for(int i = 0; i < this.count; i++){
            if(scores.get(i) < mean()){
                count++;
            }
        }
        return count;
    }

    //A public methof for check above mean
    public int aboveMean(){
        int count = 0;
        for(int i = 0; i < this.count; i++){
            if(scores.get(i) > mean()){
                count++;
            }
        }
        return count;
    }

    //A public method for output the grade
    public void showGrade(){
        int count_A = 0, count_Bp = 0, count_B = 0, count_Cp = 0, count_C = 0, count_Dp = 0, count_D = 0, count_F = 0; 
        for(int i = 0; i < this.count; i++){
            if(scores.get(i) >= 80)
                count_A++;
            else if(scores.get(i) >= 75)
                count_Bp++;
            else if(scores.get(i) >= 70)
                count_B++;
            else if(scores.get(i) >= 65)
                count_Cp++;
            else if(scores.get(i) >= 60)
                count_C++;
            else if(scores.get(i) >= 55)
                count_Dp++;
            else if(scores.get(i) >= 50)
                count_D++;
            else
                count_F++;
        }
        System.out.print("Grade: A " + count_A + ", B+ " + count_Bp + ", B " + count_B + ", C+ " + count_Cp + ", C " + count_C);
        System.out.print(", D+ " + count_Dp + ", D " + count_D + ", F " + count_F);
        System.out.println("\n####################\n");
    }

    //A public method for recive the name
    public String getCourseName(){
        return this.courseName;
    }
}
