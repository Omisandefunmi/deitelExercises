package chapterFive;

public class WhileLoopPractice {
    public static void main(String[] args) {

        int grade = 1;
        while (grade <= 10){
            System.out.printf("%d %n", grade);

            ++grade;

        }

        double weight = 2.3;
        while (weight <=5.0){
            System.out.printf("%.1f ", weight);

            weight++;
        }

        String chibuzor = "alive"; //infinite loop intended
        while (chibuzor == "alive"){
            System.out.println("show up in class");
        }
    }
}
