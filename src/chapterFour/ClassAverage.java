package chapterFour;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {

        int total = 0;
        int counter = 1;

        while (counter <= 10){
            System.out.println("Enter grade: ");
            Scanner input = new Scanner(System.in);
            int grade = input.nextInt();
            total = total + grade;

            counter++;
        }

        double average = (double) total / 100;

        System.out.printf("The total grade is %d%n", total );
        System.out.printf("The average grade %.2f%n", average);
    }
}
