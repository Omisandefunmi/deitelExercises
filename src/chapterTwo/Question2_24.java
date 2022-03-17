package chapterTwo;

import java.util.Scanner;

public class Question2_24 {
    /* (Largest and Smallest Integers)
    Write an application that reads five integers and determines and prints the
    largest and smallest integers in the group.
     Use only the programming techniques you learned in this chapter
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        int number2;
        int number3;
        int number4;
        int number5;
        System.out.println("Enter first integer");
        number = input.nextInt();
        System.out.println("Enter second integer");
        number2 = input.nextInt();
        System.out.println("Enter third integer");
        number3 = input.nextInt();
        System.out.println("Enter fourth integer");
        number4 = input.nextInt();
        System.out.println("Enter fifth integer");
        number5 = input.nextInt();

        if (number < number2 && number < number3 && number < number4 && number < number5)
        System.out.println(number+ " is the smallest integer");


        else if (number2 < number && number2 < number3 && number2 < number4 && number2 < number5)
            System.out.println(number2+ " is the smallest integer");

        else if (number3 < number && number3 < number2 && number3 < number4 && number3 < number5)
            System.out.println(number3+ " is the smallest integer");


        else if (number4 < number && number4 < number2 && number4 < number3 && number4 < number5)
            System.out.println(number4+ " is the smallest integer");

        else {
            System.out.println(number5 + " is the smallest integer");
        }

        //large number function

        if (number > number2 && number > number3 && number > number4 && number > number5)
            System.out.println(number+ " is the largest integer");
        else if (number2 > number && number2 > number3 && number2 > number4 && number2 > number5)
            System.out.println(number2+ " is the largest integer");

        else if (number3 > number && number3 > number2 && number3 > number4 && number3 > number5)
            System.out.println(number3+ " is the largest integer");
        else if (number4 > number && number4 > number2 && number4 > number3 && number4 > number5)
            System.out.println(number4+ " is the largest integer");

        else{
            System.out.println(number5+ " is the largest integer");

        }


    }
}
