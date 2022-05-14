package chapter7;

public class PrintArray {
    public static void main(String[] args) {

        int[] myArray = new int[40];
        myArray[0] = 1;


        //create an array
        //fill it up with 1 - 40
        int loopCounter = 0;
        while(loopCounter < myArray.length){
            myArray[loopCounter] = loopCounter + 1;

            loopCounter++;
        }
        System.out.println("\tindex\tElement");
        for (int i = 0; i < loopCounter; i+=2) {

            System.out.println("\t"+i+ "\t"+"\t"+myArray[i]);



        }



    }

}
