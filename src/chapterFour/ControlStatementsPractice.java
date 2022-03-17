package chapterFour;

import java.util.Scanner;

public class ControlStatementsPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly enter grade ");
        double studentGrade = input.nextDouble();

        if (studentGrade >= 60) {
            System.out.println("pass");


        }else {
            System.out.println("fail");
        }
        String result = studentGrade >= 60 ? "pass" : "fail";
        System.out.println(result);

    }
}
