package chapterTwo;

import java.util.Scanner;

public class CompareIntegers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        int number2;
        int number3;
        
	System.out.println("Enter first integer");
        number = input.nextInt();
        System.out.println("Enter second integer");
        number2 = input.nextInt();
        System.out.println("Enter third integer");
        number3 = input.nextInt();
        

        if (number < number2 && number < number3)
        System.out.println(number+ " is the smallest integer");


        else if (number2 < number && number2 < number3)
            System.out.println(number2+ " is the smallest integer");

        else {
            System.out.println(number3+ " is the smallest integer");

          }

        //large number function

        if (number > number2 && number > number3)
            System.out.println(number+ " is the largest integer");
        else if (number2 > number && number2 > number3)
            System.out.println(number2+ " is the largest integer");

        else {
            System.out.println(number3+ " is the largest integer");
        
        }


    }
}
