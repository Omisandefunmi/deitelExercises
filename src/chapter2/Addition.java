package chapter2;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input first number");
        int number = scanner.nextInt();

        System.out.println("Please input second number");
        int number2 = scanner.nextInt();


        int sum = number + number2;

        System.out.println("The sum of "+number +" and "+number2+ " is = "+ sum);

        int age = 5;



    }




}
