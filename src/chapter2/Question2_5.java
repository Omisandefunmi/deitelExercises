package chapter2;

import java.util.Scanner;

public class Question2_5 {
    /*Write declarations, statements or comments that accomplish each of the following tasks:
     a) State that a program will calculate the product of three integers.
     b) Create a Scanner called input that reads values from the standard input.
     c) Prompt the user to enter the first integer.
      d) Read the first integer from the user and store it in the int variable x.
      e) Prompt the user to enter the second integer.
      f) Read the second integer from the user and store it in the int variable y.
      g) Prompt the user to enter the third integer.
      h) Read the third integer from the user and store it in the int variable z.
      i) Compute the product of the three integers contained in variables x, y and z,
      and store the result in the int variable result.
      j) Use System.out.printf to display the message
    "chapter7.Product is" followed by the value of the variable result.
     */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Kindly enter first number ");
        int firstNumber = input.nextInt();

        System.out.println("Kindly enter second number");
        int secondNumber = input.nextInt();

        System.out.println("Kindly enter third number");
        int thirdNumber = input.nextInt();

        int totalProduct = (firstNumber * secondNumber * thirdNumber);
        System.out.println("The product of the 3 variables is " +totalProduct);

    }



}



