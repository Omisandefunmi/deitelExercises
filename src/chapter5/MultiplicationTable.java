package chapter5;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 12; i++) {
            for (int j = 2; j < 12; j++) {
                System.out.print(j+ " * "+i+ " = "+j*i+"\t\t");

            }
            System.out.println();
        }
    }
}
