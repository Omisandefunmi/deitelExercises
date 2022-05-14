package chapter4;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {

//        (Creating a Comparator) Write an application that works as a comparator. Your program
//        should read two numbers from the user and print 0 if they are equal to each other, 1 if the first
//        number is greater, and –1 if the second number is greater.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter a second number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber)
            System.out.println("0");
        else if(firstNumber > secondNumber)
            System.out.println("1");
        else
            System.out.println("-1");
    }
}
