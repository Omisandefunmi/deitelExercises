package chapterTwo;

import java.util.Scanner;

public class Question2_30 {
    /* Separating the Digits in an Integer) Write an application that inputs one number
    consisting of five digits from the user, separates the number into its individual
    digits and prints the digits separated from one another by three spaces each. For example,
    if the user types in the number 42339, the program should print
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kindly input first digit");
        int a = input.nextInt();

        System.out.println("Kindly input second digit");
        int b = input.nextInt();

        System.out.println("Kindly input third digit");
        int c = input.nextInt();

        System.out.println("Kindly input fourth digit");
        int d = input.nextInt();

        System.out.println("Kindly input fifth digit");
        int e = input.nextInt();

        System.out.print(a +"   ");
        System.out.print(b +"   ");
        System.out.print(c +"   ");
        System.out.print(d +"   ");
        System.out.print(e);




    }
}
