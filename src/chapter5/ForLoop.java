package chapter5;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Enter a number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter a number: ");
        int thirdNumber = scanner.nextInt();
        int largestNumber = 0;


                 largestNumber = number;
            if (largestNumber < secondNumber)
                 largestNumber = secondNumber;
            if (largestNumber < thirdNumber)
                largestNumber = thirdNumber;

        System.out.println(largestNumber+ " is the largest number");





    }

}
