package chapterFour;

import java.util.Scanner;

public class GradeScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly input score");

        double score= input.nextDouble();
        if(score >= 90){
            if (score == 97.44){
                System.out.println("A++");
            }else
            System.out.println("A--");
        }
        else if(score >= 80){
            System.out.println("B");
        }
        else if (score >= 70){
            System.out.println("C");
        }
        else if (score >= 60){
            System.out.println("D");
        }
        else
            System.out.println("F");
    }
}
