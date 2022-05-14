package chapter5;

import java.util.Scanner;

public class PositiveNegativeNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int negatives = 0;
        int positives = 0;
        int total = 0;
        double average;

        System.out.println("Enter any number (either positive or negative) or enter 0 to end program: ");

        int number = input.nextInt();

        while (number != 0){

            if(number < 0)
                negatives++;
            else
                positives++;
            total += number;


            System.out.println("Enter any number (either positive or negative) or enter 0 to end program: ");
            number = input.nextInt();

        }
        average = (double) total/ (double) (negatives + positives);

        System.out.println((positives+negatives)+ " numbers were entered");
        System.out.println(positives+ " were positive numbers");
        System.out.println(negatives+ " were negatives numbers");
        System.out.println("The sum total of all numbers entered is "+total);
        System.out.printf("The average is %.2f", average);
    }

}
