package tdd;

import java.util.Scanner;

public class Kata {
//    private static final Scanner scanner = new Scanner(System.in);
    public static int findMaximumFrom(int [] score) {
        int scoreMax = 0;
        for (int j : score) {
            if (scoreMax < j)
                scoreMax = j;
        }
        return scoreMax;
    }

    public static double findAverageOf(int[] scores) {
        int total = 0;
        for (int score : scores) {
            total = total + score;

        }

        return (double) total /(double) scores.length;
    }

    public static int findMinimumNumber(int[] score) {
        int minimumNumber = score[0];
        for (int j : score) {
            if (j < minimumNumber)
                minimumNumber = j;
        }
        return minimumNumber;
    }

    public static int findTotalOf(int[] array) {
        int total = 0;
        for (int j : array) {
            total = total + j;

        }
        return total;
    }
    public static int[] findDescendingOrderOf(int[] array){
        int[] result = new int[array.length];

        for(int i = 0; i < array.length; i++){
            int highestIndex = getHighestIndexFrom(array);
            result[i] = array[highestIndex];
            array[highestIndex] = Integer.MIN_VALUE;
        }
        return result;
        //get highest index
        // replace highest with -1;
        //highest number into new array
        //return new array
    }

    public static int getHighestIndexFrom(int[] array) {
       int maximum = findMaximumFrom(array);
       int maximumIndex = 0;
       for(int i= 0 ; i < array.length; i++){
           if(array[i] == maximum) {
               maximumIndex = i;
               break;
           }
       }
        return maximumIndex;
    }

    public static int sumMultiDimensionalArray(int[][] array) {
        int sum = 0;
        int totalSum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum += array[i][j];

            }
            totalSum += sum;
        }
            return totalSum;
    }

    public int getSum(int value1, int value2) {
        return value1 + value2;
    }

    public int getSubtraction(int value1, int value2) {
        return value1 - value2;
    }

    public double getArea(double value1) {
        return Math.PI * value1 * value1;
    }

    public int getFlipper(int value) {
        if (value == 1) return 0;
        else
            return 1;
    }

    public boolean isPalindrome(int digit) {
        int firstDigit = digit / 10000;
        int secondDigit = (digit % 10000) / 1000;
        int thirdDigit = (digit % 1000) / 100;
        int fourthDigit = (digit % 100) / 10;
        int fifthDigit = digit % 10;

        return firstDigit == fifthDigit && secondDigit == fourthDigit;
    }

    public int getDiscountPrice(int quantity) {
        if (quantity <= 4)
            return (quantity * 2000);
        else if (quantity <= 9)
             return quantity * 1800;

        else if(quantity <= 29)
            return quantity * 1600;
        else if(quantity <= 49)
            return quantity * 1500;

        else if(quantity <= 99)
            return quantity * 1300;
        else if(quantity <= 199)
            return quantity * 1200;

        else if(quantity <= 499)
            return quantity * 1100;
        else
            return quantity * 1000;

    }

    public int getDivision(int number1, int number2) {
        if(number1 > number2)
        return number1 / number2;
        else if(number2 == 0 && number1 == 0)
            return 0;
        else
            return number2/number1;

    }

    public int getFlipSubtract(int value1, int value2) {
        if(value1 > value2)
            return value1 - value2;
            else
                return value2 - value1;


    }

    public String getOxygen(String chibuzo) {
        if(chibuzo == "wan faint")
            return "pump am Oxygen make e no die";
       else
           return "buy am food";
    }
}
