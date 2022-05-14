package chapter2;

import java.util.Scanner;

public class CharIntegerPrinting {
    //Using statements similar to the one shown earlier in this exercise, write an application that
    //displays the integer equivalents of some uppercase letters, lowercase letters, digits and special sym-
    //bols. Display the integer equivalents of the following: A B C a b c 0 1 2 $ * + / and the blank
    //character.

    public static void main(String[] args) {

        char letterA = 'A';
        char letterB = 'B';
        char letterC = 'C';
        char letter_c = 'c';
        char num0 = '0';
        char myChar = '$';

        System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));
        System.out.printf("The character %c has the value %d%n", 'B', ((int) 'B'));
        System.out.printf("The character %c has the value %d%n", 'C', ((int) 'C'));
        System.out.printf("The character %c has the value %d%n", 'c', ((int) 'c'));
        System.out.printf("The character %c has the value %d%n", '0', ((int) '0'));
        System.out.printf("The character %c has the value %d%n", '$', ((int) '$'));

        Scanner scanner = new Scanner(System.in);




    }

}
