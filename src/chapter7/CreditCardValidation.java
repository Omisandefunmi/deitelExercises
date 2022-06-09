package chapter7;

public class CreditCardValidation {

    public static int findSumOfDistinctElements(int[] array1, int[]  array2) {
        int sum = 0;
        int a = computeSumForDistinct(array1, array2,sum);
        int b = computeSumForDistinct(array2, array1,sum);
        return a + b;
    }
    private static int computeSumForDistinct(int[] array1, int[] array2, int sum){
        for (int i = 0; i < array1.length; i++){
            int counter = 0;
            for (int j = 0; j < array2.length; j++) {
                if(array1[i] != array2[j]){
                    counter++;
                }
            }
            if(counter == array2.length){
                sum += array1[i];
            }
        }
        return sum;
    }

    public static int findSumOfSameElements(int[] array1, int[] array2) {
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            int counter = 0;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    if(counter < 1){
                        sum = sum + (array1[i] * 2);
                        counter++;}
                }
            }
        }
        return sum;
    }
}
