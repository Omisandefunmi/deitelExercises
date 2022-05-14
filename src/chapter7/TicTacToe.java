package chapter7;

import java.util.Arrays;

public class TicTacToe {
    public static void main(String[] args) {

        char[][] ticTac = new char[3][3];

        generateMotherArray(ticTac);
        printArray(ticTac);
//        Arrays.stream(ticTac).peek()
    }

    private static void generateMotherArray(char[][] ticTac) {
        generateArray0(ticTac);
        generateArray1(ticTac);
        generateArray2(ticTac);
    }

    private static void printArray(char[][] ticTac) {
        System.out.println(ticTac[0][0]+ " "+ ticTac[0][1]+ " "+ ticTac[0][2]);
        System.out.println(ticTac[1][0]+ " "+ ticTac[1][1]+ " "+ ticTac[1][2]);
        System.out.println(ticTac[2][0]+ " "+ ticTac[2][1]+ " "+ ticTac[2][2]);
    }

    private static void generateArray2(char[][] ticTac) {
        ticTac[2][0] = 'O';
        ticTac[2][1] = 'X';
        ticTac[2][2] = 'O';
    }

    private static void generateArray1(char[][] ticTac) {
        ticTac[1][0] = 'X';
        ticTac[1][1] = 'X';
        ticTac[1][2] = 'X';
    }

    private static void generateArray0(char[][] ticTac) {
        ticTac[0][0] = 'X';
        ticTac[0][1] = 'O';
        ticTac[0][2] = 'X';
    }
}
