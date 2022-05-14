package chapter7;

import java.security.SecureRandom;
import java.util.Scanner;

public class AverageUsingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of data you intend to input");
        int arrayLength = input.nextInt();
        int total = 0;
        int valueMax =0;

        int[] value = new int[arrayLength];

        SecureRandom secureRandom = new SecureRandom();
        System.out.println();
        for (int i = 0; i < arrayLength; i++) {
            value[i] = secureRandom.nextInt(10);
            System.out.println(value[i]);
           total = total + value[i];
        }

        for (int i = 0; i < arrayLength; i++) {
            if (valueMax < value[i]){
                valueMax = value[i];
            }

        }
        System.out.println();
        System.out.println("The maximum value is "+valueMax);
        double average = (double)total/ value.length;
        System.out.println("The sum of Values is "+total);
        System.out.println("The average of Value is "+average);
          }
    }

