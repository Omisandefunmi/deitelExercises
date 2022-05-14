package chapter2;

import java.util.Scanner;

public class Question216 {
    //This program compares integers
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        int number2;

        System.out.println("Enter first number");
        number = scanner.nextInt();
        System.out.println("Enter second number");
        number2 = scanner.nextInt();

        if(number < number2){
            System.out.println(number2 + " is larger");
        }

        else if(number2<number){
            System.out.println(number + " is larger");
        }

        else {
            System.out.println(number + " and "+ number2 + " are equals");
        }


    }
}
