package chapter6;

import java.util.Random;

public class RandomNumberQuiz {
    public static void main(String[] args) {
        Random random = new Random();
        int loopcounter = 1;
        while (loopcounter <= 10) {

            int firstRandomNumber = 1 + random.nextInt();
            int secondRandomNumber =1 + random.nextInt();
            char randomOperator =

            System.out.println(firstRandomNumber+ " and " +secondRandomNumber );

            loopcounter++;
        }
    }
}
