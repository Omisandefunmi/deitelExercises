package chapter7;

import java.util.Scanner;

public class Questionnaire {
/* create questionnaire
* load questions
* serve question
* collect answers
* mark answers
* display personality type
* */


    private String[] questions;
    private String [] answer;

    public Questionnaire() {};


    private void getNumberOfQuestions(int numberOfQuestions){
        questions = new String[numberOfQuestions];
    }



    public String[] getResponseFrom(){
        answer = new String[this.questions.length];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < answer.length; i++) {
            System.out.println("Choose either option A or B for number "+(i+1));
            String option = scanner.nextLine();
            if(option.equalsIgnoreCase("a") || option.equalsIgnoreCase("b")){
                answer[i] = option;
            }
        }
        return answer;
    }



    public void serveQuestions(){
        getNumberOfQuestions(20);
        questions = loadQuestionnaire();
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println();

        }
        System.out.println();
    }

    private String[] loadQuestionnaire(){
        String[] questions = new String[this.questions.length];
         questions [0] = """
                Number 1
                A: Expend energy, enjoy groups
                B: Conserve energy, enjoy one-on-one""";

         questions [1] = """
                Number 2
                A: Interpret literally
                B: Look for meaning and possibilities""";

         questions [2] = """
                Number 3
                A: logical, thinking, questioning
                B: empathetic, feeling, accommodating""";

         questions[3] = """
                Number 4
                A: organised, orderly
                B: flexible, adaptable""";

         questions [4] = """
                Number 5
                A: more outgoing, think out loud
                B: more reserved, think to yourself""";

         questions[5] = """
                Number 6
                A: practical, realistic, experiential
                B: imaginative, innovative, theoretical""";

         questions[6] = """
                Number 7
                A: candid, straight forward, frank
                B: tactful, kind, encouraging""";

         questions[7] = """
                Number 8
                A: plan, schedule
                B: unplanned, spontaneous""";

         questions[8] = """
                Number 9
                A: seek many tasks, public activities, interaction with other
                B: seek private, solitary activities with quiet to concentrate""";

         questions[9] = """
                Number 10
                A: logical, thinking, questioning
                B: empathetic, feeling, accommodating""";

         questions[10] = """
                Number 11
                A: firm, tend to criticize, hold the line
                B: gentle, tend to appreciate, conciliate""";

         questions[11] = """
                Number 12
                A: regulated, structured\s
                B: easygoing, "live", and "letlive"\s""";

         questions[12] = """
                Number 13
                A: external, communicative, express yourself
                B: internal, reticent, keep to yourself""";

         questions[13] = """
                Number 14
                A: focus on here-and-now,\s
                B: look to the future, global perspective, "big picture"\s""";

         questions[14] = """
                Number 15
                A: tough-minded, just
                B: tender-hearted, merciful""";

         questions[15] = """
                Number 16
                A: preparation, plan ahead
                B: go with the flow, adapt as you go""";

         questions[16] = """
                Number 17
                A: active, initiate
                B:reflective, deliberate""";

         questions[17] = """
                Number 18
                A: facts, things,"what is"
                B: ideas, dreams, "what could be", philosophical""";

         questions[18] = """
                Number 19
                A: matter of fact, issue-oriented
                B: sensitive, people-oriented, compassionate""";

         questions[19] = """
                Number 20
                A: control, govern
                B: latitude, freedom""";



        return questions;

    }

}




