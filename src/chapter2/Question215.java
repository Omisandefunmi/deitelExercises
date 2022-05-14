package chapter2;

import java.util.Scanner;

public class Question215 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int digit = input.nextInt();

        System.out.print("Enter second integer: ");
        int digit2 = input.nextInt();

        int squareOfDigit = digit * digit;
        System.out.println("The square of " + digit +  " = " + squareOfDigit);

        int squareOfDigit2 = digit2 * digit2;
        System.out.println("The square of " + digit2 +  " = " + squareOfDigit2);

        int sumOfSquares = squareOfDigit + squareOfDigit2;
        System.out.println("The sum of " +squareOfDigit+ " and " +squareOfDigit2+ " = " +sumOfSquares);


        int productOfSquares = squareOfDigit * squareOfDigit2;
        System.out.println("The product of " +squareOfDigit+ " and " +squareOfDigit2+ " = " +productOfSquares);

        double quotientOfSquares = (double) squareOfDigit / squareOfDigit2;
        System.out.println(squareOfDigit+ " divides " +squareOfDigit2+ " to give " +quotientOfSquares);

        int differenceOfSquares = squareOfDigit - squareOfDigit2;
        System.out.println("The difference of " +squareOfDigit+ " and " + squareOfDigit2+ " is " +differenceOfSquares);



    }


}

