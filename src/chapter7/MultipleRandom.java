package chapter7;

public class MultipleRandom {
    public static void main(String[] args) {
        int[] myArrayVariable = new int[300];

        int loop = 0;
        while(loop < myArrayVariable.length){
            myArrayVariable[loop] = loop + 1;
            loop++;
        }
        for (int i = 0; i < loop; i++) {
            System.out.print(myArrayVariable[i]+" ");

        }
    }
}
