package chapter4;

import java.util.Scanner;

public class WhilePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many students? ");
        int numberOfStudent = input.nextInt();

        System.out.println("Enter grades: ");
        int grades = input.nextInt();

        System.out.println();
        int count = 1;
        while( count == -1 ){
            if(count==-1) {
                System.out.println(grades);
                System.out.println("Enter -1 to end loop");
            }
            break;


        }
    }
}
