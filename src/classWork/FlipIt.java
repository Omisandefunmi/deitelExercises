package classWork;

import java.util.Scanner;

public class FlipIt {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Kindly enter number 1 ");
        int firstDigit = input.nextInt();
        if (firstDigit == 1)
            System.out.println("0");

        System.out.println("kindly enter 0");
        int secondDigit = input.nextInt();
        if (secondDigit == 0)
            System.out.println("1");


    }
}
