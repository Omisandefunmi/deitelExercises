package chapter5;

import java.util.Scanner;

public class StudentsHighestScore {
//    (Find the highest score) Write a program that prompts the user to enter the num-
//ber of students and each student’s name and score, and finally displays the name
//of the student with the highest score.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many students do you have? ");
    int numberOfStudents = scanner.nextInt();



    int count = 0;
    int highestScore = 0;
    String studentName = "";
    while (count < numberOfStudents){
        scanner.nextLine();
        System.out.println("Enter student's name: ");
         studentName = scanner.nextLine();
         scanner.nextLine();


        System.out.println("Enter student" +(count + 1)+ "'s score: ");
        int score = scanner.nextInt();
        scanner.next();
        scanner.nextLine();

        if(score > highestScore){
            highestScore = score;
        }
        count++;
    }
    System.out.println("The  student with the highest score is "+studentName);
}

}
