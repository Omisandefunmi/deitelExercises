package timBuchalka;

import java.util.Scanner;

public class ArrayInDescendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements do you intend to enter?");
        int arraySize = scanner.nextInt();
        int [] myArray = new int [arraySize];


        for (int i = 0; i < myArray.length; i++) {
            int arrayIndex = i+1;
            System.out.print("Input the element of array index "+arrayIndex+" in array ---> ");
            myArray[i] = scanner.nextInt();

        }
        System.out.println();
        for (int i = 0; i < myArray.length; i++) {
            int arrayIndex = i+1;
            System.out.println("Element of "+arrayIndex+ " is "+myArray[i]);

        }

        int total = 0;
        double average;
        for (int j : myArray) {
            total += j;
        }
        average = (double) total / (double) myArray.length;
        System.out.println();
        System.out.print("The average is: "+average);
        System.out.println();


    }

}
