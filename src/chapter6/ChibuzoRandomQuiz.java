package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ChibuzoRandomQuiz {
    public static int correctAnswer;
    public static int correctAnswerNumber;
    public static int wrongAnswerNumber;




    public static void main(String[] args) {

        String question = generateQuestion();
        int userInput = collectUserInputFor(question);
    }

    private static int collectUserInputFor(String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        int userInput = scanner.nextInt();
        return userInput;
    }

    public static int generateNumber(){
        SecureRandom secureRandom = new SecureRandom();
        return 1 + secureRandom.nextInt(9);
    }

    public static String generateQuestion() {
        String question = " ";
        int firstNumber = 34;
        int secondNumber = 23;
        char operator = '+';
        String space = " ";

        question = firstNumber+space+ operator+space+secondNumber+space+ "= ";
        return question;
    }

//    public static  char generateOperator(){
//        SecureRandom secureRandom = new SecureRandom();
//        int randomQuiz = 1 + secureRandom.nextInt(4);
//         return (switch (randomQuiz){
//
//             case 1:
//                 return '+';
//             case 2 :
//                 return '-';
//        }
//
//    }
}
