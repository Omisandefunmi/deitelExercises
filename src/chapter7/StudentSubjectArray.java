package chapter7;

import tdd.Kata;

import java.util.Scanner;

public class StudentSubjectArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of students in class: ");
        int students = scanner.nextInt();

        System.out.println();


        System.out.println("Number of subjects offered: ");
        int numberOfSubjects = scanner.nextInt();


        int[][] scores = new int[students][numberOfSubjects];


        int i = 0;
        for (; i < students; i++) {
            int studentIndex = i + 1;
            int j = 0;
            for (; j < numberOfSubjects; j++) {
                int subjectIndex = j + 1;
                System.out.print("Enter scores for student " + studentIndex + " in subject " +subjectIndex+" : ");
                scores[i][j] = scanner.nextInt();
            }
        }
        printArray(students, numberOfSubjects, scores);
        printScoreReport(students, scores);



        int minimumScoreInSubject;
        for (int column = 0; column < numberOfSubjects; column++) {

                minimumScoreInSubject = Kata.findMinimumNumber(scores[column]);
            int columnIndex = column + 1;
            System.out.println("The lowest score in Subject" + columnIndex + " is " + minimumScoreInSubject);
        }

        int minimumScore;
        int overallMinimumScore = 0;
        int index = 0;
        for (int row = 0; row < students; row++) {
            minimumScore = Kata.findMinimumNumber(scores[row]);

            if(minimumScore > overallMinimumScore)
                overallMinimumScore = minimumScore;
            index = row +1;


        }
        System.out.println();
        System.out.println("Lowest scoring student is: Student "+index+ " scoring "+overallMinimumScore);

//        getOverallTotalOfEachSubject(numberOfSubjects, students, scores);





    }






















    

    public static void printScoreReport(int students, int[][] scores) {
        getMaximumScoreOfEach(students, scores);
        getMinimumScoreOfEachStudent(students, scores);
        getOverallHighestScore(students, scores);

    }



    private static void getOverallHighestScore(int students, int[][] scores) {
        int maximumScore;
        int overallMaximumScore = 0;
        int index = 0;
        for (int row = 0; row < students; row++) {
            maximumScore = Kata.findMaximumFrom(scores[row]);

            if(maximumScore > overallMaximumScore)
                overallMaximumScore = maximumScore;
            index = row +1;


        }
        System.out.println();
        System.out.println("Highest scoring student is: Student "+index+ " scoring "+overallMaximumScore);
    }



//    private static void getOverallTotalOfEachSubject(int numberOfSubject,int students, int [][] scores){

//        int overallTotalOfSubject = 0;
//        for (int i = 0; i < numberOfSubject; i++) {
//            int total = 0;
//
//            for (int j = 0; j < students; j++) {
//                total = Kata.findTotalOf(scores[j]);
//            }
//            overallTotalOfSubject += total;
//            System.out.println("The overall Total Of Subject"+(i+1)+ " is "+overallTotalOfSubject);
//        }
//
//    }


    private static void getMinimumScoreOfEachStudent(int students, int[][] scores) {
        int minimumScore;
        for (int j = 0; j < students; j++) {
            int rowIndex = j + 1;
            minimumScore = Kata.findMinimumNumber(scores[j]);
            System.out.println("Student" + rowIndex + "'s lowest score is " + minimumScore);

        }
    }

    private static void getMaximumScoreOfEach(int students, int[][] scores) {
        int maximumScore;
        for (int j = 0; j < students; j++) {
            int rowIndex = j + 1;
            maximumScore = Kata.findMaximumFrom(scores[j]);
            System.out.println("Student"+rowIndex+"'s highest score is "+maximumScore );

        }
    }

    private static void printArray(int students, int numberOfSubjects, int[][] scores) {
        double average;
        int total;
        System.out.println("\n".repeat(30));
        System.out.print("\t\t\t");
        for (int j = 0; j < numberOfSubjects; j++) {
            int columnIndex = j + 1;
            System.out.print("Subject"+columnIndex+"\t");

        }
        System.out.print("Total\t Avr");


        System.out.println();


        for (int row = 0; row < students; row++) {
            int index = row +1;
            total = Kata.findTotalOf(scores[row]);
            average = Kata.findAverageOf(scores[row]);
            System.out.print("Student "+ index+ "\t\t");
            for (int column = 0; column < numberOfSubjects; column++) {
                System.out.print(scores[row][column]+" \t\t\t");

            }
            System.out.print(total+ "\t\t");

            System.out.println(average);

            System.out.println();

        }
    }


}

