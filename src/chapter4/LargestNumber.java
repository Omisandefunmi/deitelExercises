package chapter4;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largestNumber = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number "+i+ " : ");
            int number = input.nextInt();
            if(largestNumber <= number)
            largestNumber = number;
        }
        System.out.println("The largest number is: "+largestNumber);
    }
}
