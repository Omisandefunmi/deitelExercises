package chapter2;

import java.util.Scanner;

public class Exercise2_17 {
     /*(Arithmetic, Smallest and Largest) Write an application that
     inputs three integers from the user and displays the sum,
     average, product, smallest and largest of the numbers.
      Use the techniques shown in Fig. 2.15. [Note:
      The calculation of the average in this exercise should
      result in an integer representation of the average.
      So, if the sum of the values is 7, the average should be 2, not 2.3333….]
      */

     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.println("Kindly input first number");
          double firstNumber = input.nextDouble();
          System.out.println("Kindly input second number");
          double secondNumber = input.nextDouble();
          System.out.println("Kindly input third number");
          double thirdNumber = input.nextDouble();

          double sum = firstNumber + secondNumber + thirdNumber;

          double average = sum / 3 ;

          System.out.println("Average is " + average);


          if (firstNumber < secondNumber && firstNumber < thirdNumber) {
               System.out.println(firstNumber + " is the lowest");
          }else if (secondNumber < firstNumber && secondNumber < thirdNumber) {
               System.out.println(secondNumber + " is the lowest");
          }else {
               System.out.println(thirdNumber + " is the lowest");
          }
     }

}


