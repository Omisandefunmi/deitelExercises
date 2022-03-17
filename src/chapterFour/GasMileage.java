package chapterFour;

import java.util.Scanner;

public class GasMileage {
    /* Drivers are concerned with the mileage their automobiles get. One driver has
kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
a Java application that will input the miles driven and gallons used (both as integers) for each trip.
The program should calculate and display the miles per gallon obtained for each trip and print the
combined miles per gallon obtained for all trips up to this point. All averaging calculations should
produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data
from the user.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gallonCounter = 1;
        int totalMilesDriven = 0;
        int totalGallonUsed = 0;

        System.out.println("To calculate more press 1 or press -1 to stop");
        gallonCounter = input.nextInt();

        while (gallonCounter !=-1) {
            System.out.println("Enter miles driven: ");
            int milesDriven = input.nextInt();

            System.out.println("Enter gallons used: ");
            int numberOfGallons = input.nextInt();

            totalMilesDriven = totalMilesDriven + milesDriven;
            totalGallonUsed = totalGallonUsed + numberOfGallons;

            System.out.println("To calculate more press 1 or press -1 to stop");
            gallonCounter = input.nextInt();

        }
        double averageMileage = (totalMilesDriven / totalGallonUsed);
        System.out.println("The average Mileage after 10 trips is " +averageMileage);




    }
}

