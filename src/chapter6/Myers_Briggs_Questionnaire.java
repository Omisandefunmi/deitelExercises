package chapter6;

import java.util.Scanner;

public class Myers_Briggs_Questionnaire {


    public static void main(String[] args) {


        generateWelcomeNote();
        generateQuestions();
        collateResponse();
        generatePersonalityType();


    }



    private static final Scanner scanner = new Scanner(System.in);
    static int loopCounter = 1;
    static String chosenOption;
    static int a1Counter = 0;
    static int a2Counter = 0;
    static int a3Counter = 0;
    static int a4Counter = 0;
    static int b1Counter = 0;
    static int b2Counter = 0;
    static int b3Counter = 0;
    static int b4Counter = 0;

    private static void generatePersonalityType() {
        if (a1Counter > b1Counter)
              System.out.print("Extrovert,");
          else
              System.out.print("Introvert, ");

        if(a2Counter > b2Counter)
            System.out.print(" Sensor,");
        else
            System.out.print(" Intuitive,");
        if(a3Counter > b3Counter)
            System.out.print(" Thinker &");
        else
            System.out.print(" Feeler &");
        if(a4Counter > b4Counter)
            System.out.print(" Judger.");
        else
            System.out.print(" Perceiver.");
    }

    private static void collateResponse() {
        System.out.println(a1Counter);
        System.out.println(a2Counter);
        System.out.println(b1Counter);
        System.out.println(b2Counter);
        System.out.println(a3Counter);
        System.out.println(b3Counter);
        System.out.println(a4Counter);
        System.out.println(b4Counter);
    }

    private static void generateQuestions() {
        while (loopCounter <= 20){


            supplyQuiz();

            loopCounter++;

        }
    }

    private static void generateWelcomeNote() {
        System.out.println("Welcome To Myers-Briggs Personality Questionnaire");

        System.out.println("There are 20 questions in all. Kindly input numbers ranging from 1 to 20 to answers the questions");
    }

    private static void supplyQuiz() {
        switch (loopCounter) {
            case 1 -> serveQuestionOne();
            case 2 -> serveQuestionTwo();
            case 3 -> serveQuestionThree();
            case 4 -> serveQuestionFour();
            case 5 -> serveQuestionFive();
            case 6 -> serveQuestionSix();
            case 7 -> serveQuestionSeven();
            case 8 -> serveQuestionEight();
            case 9 -> serveQuestionNine();
            case 10 -> serveQuestionTen();
            case 11 -> serveQuestionEleven();
            case 12 -> serveQuestionTwelve();
            case 13 -> serveQuestionThirteen();
            case 14 -> serveQuestionFourteen();
            case 15 -> serveQuestionFifteen();
            case 16 -> serveQuestionSixteen();
            case 17 -> serveQuestionSeventeen();
            case 18 -> serveQuestionEighteen();
            case 19 -> serveQuestionNineteen();
            case 20 -> serveQuestionTwenty();
            default -> throw new IllegalStateException("Unexpected value: " + loopCounter);
        }
    }

    private static void serveQuestionTwenty() {
        System.out.println("""
                Number 20
                A: control, govern
                B: latitude, freedom""");
        chosenOption = scanner.nextLine().toUpperCase();
        if (chosenOption.equals("A"))
            a4Counter++;
        else {
            if (chosenOption.equals("B"))

                b4Counter++;
            else
            {System.out.println("Invalid option!!!\n" +
                        "Re-take Question");
                serveQuestionTwenty();
            }


        }
    }

    private static void serveQuestionNineteen() {
        System.out.println("""
                Number 19
                A: matter of fact, issue-oriented
                B: sensitive, people-oriented, compassionate""");
        chosenOption = scanner.nextLine().toUpperCase();
        if (chosenOption.equals("A"))
            a3Counter++;
        else {
            if (chosenOption.equals("B"))

                b3Counter++;
            else
            {System.out.println("Invalid option!!!\n" +
                    "Re-take Question");
                serveQuestionNineteen();
            }
        }
    }

    private static void serveQuestionEighteen() {
        System.out.println("""
                Number 18
                facts, things,"what is"
                B: ideas, dreams, "what could be", philosophical""");
        chosenOption = scanner.nextLine().toUpperCase();
        if (chosenOption.equals("A"))
            a2Counter++;
        else {
            if (chosenOption.equals("B"))

                b2Counter++;
            else
            {System.out.println("Invalid option!!!\n" +
                    "Re-take Question");
                serveQuestionEighteen();
            }
        }
    }

    private static void serveQuestionSeventeen() {
        System.out.println("""
                Number 17
                A: active, initiate
                B:reflective, deliberate""");
        chosenOption = scanner.nextLine().toUpperCase();
        if (chosenOption.equals("A"))
            a1Counter++;
        else {
            if (chosenOption.equals("B"))

                b1Counter++;
            else
            {System.out.println("Invalid option!!!\n" +
                    "Re-take Question");
                serveQuestionSeventeen();
            }
        }
    }

    private static void serveQuestionSixteen() {
        System.out.println("""
                Number 16
                A: preparation, plan ahead
                B: go with the flow, adapt as you go""");
        chosenOption = scanner.nextLine().toUpperCase();
        if (chosenOption.equals("A"))
            a4Counter++;
        else {
            if (chosenOption.equals("B"))

                b4Counter++;
            else
            {System.out.println("Invalid option!!!\n" +
                    "Re-take Question");
                serveQuestionSixteen();
            }
        }
    }

    private static void serveQuestionFifteen() {
        System.out.println("""
                Number 15
                A: tough-minded, just
                B: tender-hearted, merciful""");
        chosenOption = scanner.nextLine().toUpperCase();
        if (chosenOption.equals("A"))
            a3Counter++;
        else {
            if (chosenOption.equals("B"))

                b3Counter++;
            else
            {System.out.println("Invalid option!!!\n" +
                    "Re-take Question");
                serveQuestionFifteen();
            }
        }
    }

    private static void serveQuestionFourteen() {
        System.out.println("""
                Number 14
                A: focus on here-and-now,\s
                B: look to the future, global perspective, "big picture"\s""");
        chosenOption = scanner.nextLine().toUpperCase();
        if (chosenOption.equals("A"))
            a2Counter++;
        else {
            if (chosenOption.equals("B"))

                b2Counter++;
            else
            {System.out.println("Invalid option!!!\n" +
                    "Re-take Question");
                serveQuestionFourteen();
            }
        }
    }

    private static void serveQuestionThirteen() {
        System.out.println("""
                Number 13
                A: external, communicative, express yourself
                B: internal, reticent, keep to yourself""");
        chosenOption = scanner.nextLine().toUpperCase();
        if (chosenOption.equals("A"))
            a1Counter++;
        else {
            if (chosenOption.equals("B"))

                b1Counter++;
            else
            {System.out.println("Invalid option!!!\n" +
                    "Re-take Question");
                serveQuestionThirteen();
            }
        }
    }

    private static void serveQuestionTwelve() {
        System.out.println("""
                Number 12
                A: regulated, structured\s
                B: easygoing, "live", and "letlive"\s""");
        chosenOption = scanner.nextLine().toUpperCase();
        if (chosenOption.equals("A"))
            a4Counter++;
        else {
            if (chosenOption.equals("B"))

                b4Counter++;
            else
            {System.out.println("Invalid option!!!\n" +
                    "Re-take Question");
                serveQuestionTwelve();
            }
        }
    }

    private static void serveQuestionEleven() {
        System.out.println("""
                Number 11
                A: firm, tend to criticize, hold the line
                B: gentle, tend to appreciate, conciliate""");
        chosenOption = scanner.nextLine().toUpperCase();
        if (chosenOption.equals("A"))
            a3Counter++;
        else {
            if (chosenOption.equals("B"))

                b3Counter++;
            else
            {System.out.println("Invalid option!!!\n" +
                    "Re-take Question");
                serveQuestionEleven();
            }
        }
    }

    private static void serveQuestionTen() {
        System.out.println("""
                Number 10
                A: logical, thinking, questioning
                B: empathetic, feeling, accommodating""");
        chosenOption = scanner.nextLine().toUpperCase();
        if (chosenOption.equals("A"))
            a2Counter++;
        else {
            if (chosenOption.equals("B"))

                b2Counter++;
            else
            {System.out.println("Invalid option!!!\n" +
                    "Re-take Question");
                serveQuestionTen();
            }
        }
    }

    private static void serveQuestionNine() {
        System.out.println("""
                Number 9
                A: seek many tasks, public activities, interaction with other
                B: seek private, solitary activities with quiet to concentrate""");
        chosenOption = scanner.nextLine().toUpperCase();
        if (chosenOption.equals("A"))
            a1Counter++;
        else {
            if (chosenOption.equals("B"))

                b1Counter++;
            else
            {System.out.println("Invalid option!!!\n" +
                    "Re-take Question");
                serveQuestionNine();
            }
        }
    }

    private static void serveQuestionEight() {
        System.out.println("""
                Number 8
                A: plan, schedule
                B: unplanned, spontaneous""");
        chosenOption = scanner.nextLine().toUpperCase();
        if (chosenOption.equals("A"))
            a4Counter++;
        else {
            if (chosenOption.equals("B"))

                b4Counter++;
            else
            {System.out.println("Invalid option!!!\n" +
                    "Re-take Question");
                serveQuestionEight();
            }
        }
    }

    private static void serveQuestionSeven() {
        System.out.println("""
                Number 7
                A: candid, straight forward, frank
                B: tactful, kind, encouraging""");
        chosenOption = scanner.nextLine().toUpperCase();
        if (chosenOption.equals("A"))
            a3Counter++;
        else {
            if (chosenOption.equals("B"))

                b3Counter++;
            else
            {System.out.println("Invalid option!!!\n" +
                    "Re-take Question");
                serveQuestionSeven();
            }
        }
    }

    private static void serveQuestionSix() {
        System.out.println("""
                Number 6
                A: practical, realistic, experiential
                B: imaginative, innovative, theoretical""");
        chosenOption = scanner.nextLine().toUpperCase();
        if (chosenOption.equals("A"))
            a2Counter++;
        else {
            if (chosenOption.equals("B"))

                b2Counter++;
            else
            {System.out.println("Invalid option!!!\n" +
                    "Re-take Question");
                serveQuestionSix();
            }
        }
    }

    private static void serveQuestionFive() {
        System.out.println("""
                Number 5
                A: more outgoing, think out loud
                B: more reserved, think to yourself""");
        chosenOption = scanner.nextLine().toUpperCase();
        if (chosenOption.equals("A"))
            a1Counter++;
        else {
            if (chosenOption.equals("B"))

                b1Counter++;
            else
            {System.out.println("Invalid option!!!\n" +
                    "Re-take Question");
                serveQuestionFive();
            }
        }
    }


    private static void serveQuestionFour() {
        System.out.println("""
                Number 4
                A: organised, orderly
                B: flexible, adaptable""");
        chosenOption = scanner.nextLine().toUpperCase();
        if (chosenOption.equals("A"))
            a4Counter++;
        else {
            if (chosenOption.equals("B"))

                b4Counter++;
            else
            {System.out.println("Invalid option!!!\n" +
                    "Re-take Question");
                serveQuestionFour();
            }
        }
    }

    private static void serveQuestionThree() {
        System.out.println("""
                Number 3
                A: logical, thinking, questioning
                B: empathetic, feeling, accommodating""");
        chosenOption = scanner.nextLine().toUpperCase();
        if (chosenOption.equals("A"))
            a3Counter++;
        else {
            if (chosenOption.equals("B"))

                b3Counter++;
            else
            {System.out.println("Invalid option!!!\n" +
                    "Re-take Question");
                serveQuestionThree();
            }
        }
    }

    private static void serveQuestionTwo() {
        System.out.println("""
                Number 2
                A: Interpret literally
                B: Look for meaning and possibilities""");
        chosenOption = scanner.nextLine().toUpperCase();
        if (chosenOption.equals("A"))
            a2Counter++;
        else {
            if (chosenOption.equals("B"))

                b2Counter++;
            else
            {System.out.println("Invalid option!!!\n" +
                    "Re-take Question");
                serveQuestionTwo();
            }
        }
    }

    private static void serveQuestionOne() {
        System.out.println("""
                Number 1
                A: Expend energy, enjoy groups
                B: Conserve energy, enjoy one-on-one""");
        chosenOption = scanner.nextLine().toUpperCase();
        if (chosenOption.equals("A"))
            a1Counter++;
        else if (chosenOption.equals("B"))
            b1Counter++;
        else
        {System.out.println("Invalid option!!!\n" +
                "Re-take Question");
            serveQuestionOne();
        }
    }




}
