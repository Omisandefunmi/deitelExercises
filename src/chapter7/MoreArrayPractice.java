package chapter7;

import java.util.Random;

public class MoreArrayPractice {
    public static void main(String[] args) {
//        int[] tenArrayNumbers = new int[10];
        Random random = new Random();

        int [] tenArrayNumbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(tenArrayNumbers[9]);
        int counter = 0;
        while (counter < tenArrayNumbers.length){
            System.out.println(counter+ " contains element "+tenArrayNumbers[counter]);
            counter++;
        }
        System.out.println();
        int [] randomNumberArray = new int[10];
        counter = 0;
        while (counter < randomNumberArray.length){
            randomNumberArray[counter] = 1 + random.nextInt(20);
            System.out.println(counter+ " contains element "+randomNumberArray[counter]);
            counter++;
        }
    }
}
