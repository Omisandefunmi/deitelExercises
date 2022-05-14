package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class SevenSegmentDisplay {



//                System.out.println(Arrays.deepToString(ledLight));



   private static String [][] ledLight = new String[5][4];


    private static void setLedLight(){
        loadElementInA();
        loadElementInB();
        loadElementInC();
        loadElementInD();
        loadElementInE();
        loadElementInF();
        loadElementInG();
        loadElementInEmptyOne();
        loadElementInEmptyTwo();

    }

    private static void emptyElementInA(){
        for (int i = 0; i <= 0; i++) {
            for (int j = 0; j < 4; j++) {
                ledLight[i][j] = "  ";
            }
            System.out.println();

        }

    }

    private static void emptyElementInB() {
        for (int i = 0; i <= 2; i++) {
            for (int j = 3; j <= 3; j++) {
                ledLight[i][j] = "  ";
            }

        }
        System.out.println();
    }

    private static void emptyElementInC() {
        for (int i = 2; i <= 4; i++) {
            for (int j = 3; j <= 3; j++) {
                ledLight[i][j] = "  ";
            }

        }
        System.out.println();
    }

    private static void emptyElementInD() {
        for (int i = 4; i <= 4; i++) {
            for (int j = 0; j <= 3; j++) {
                ledLight[i][j] = "  ";
            }

        }
        System.out.println();
    }

    private static void emptyElementInE() {
        for (int i = 2; i <= 4; i++) {
            for (int j = 0; j <= 0; j++) {
                ledLight[i][j] = "  ";
            }

        }
        System.out.println();
    }

    private static void emptyElementInF() {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 0; j++) {
                ledLight[i][j] = "  ";
            }

        }
        System.out.println();
    }

    private static void emptyElementInG() {
        for (int i = 2; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                ledLight[i][j] = "  ";
            }
            System.out.println();
        }
    }

    private static void loadElementInEmptyOne() {
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 2; j++) {
                ledLight[i][j] = "  ";
            }

        }
        System.out.println();
    }


    private static void loadElementInA(){
        for (int i = 0; i <= 0; i++) {
            for (int j = 0; j < 4; j++) {
                ledLight[i][j] = "# ";
            }

        }
        System.out.println();

    }

    private static void loadElementInB() {
        for (int i = 0; i <= 2; i++) {
            for (int j = 3; j <= 3; j++) {
                ledLight[i][j] = "# ";
            }

        }
        System.out.println();
    }

    private static void loadElementInC() {
        for (int i = 2; i <= 4; i++) {
            for (int j = 3; j <= 3; j++) {
                ledLight[i][j] = "# ";
            }

        }
        System.out.println();
    }

    private static void loadElementInD() {
        for (int i = 4; i <= 4; i++) {
            for (int j = 0; j <= 3; j++) {
                ledLight[i][j] = "# ";
            }

        }
        System.out.println();
    }

    private static void loadElementInE() {
        for (int i = 2; i <= 4; i++) {
            for (int j = 0; j <= 0; j++) {
                ledLight[i][j] = "# ";
            }

        }
        System.out.println();
    }

    private static void loadElementInF() {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 0; j++) {
                ledLight[i][j] = "# ";
            }

        }
        System.out.println();
    }

    private static void loadElementInG() {
        for (int i = 2; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                ledLight[i][j] = "# ";
            }

        }
        System.out.println();
    }




    private static void loadElementInEmptyTwo() {
        for (int i = 3; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                ledLight[i][j] = "  ";
            }

        }
        System.out.println();
    }

    private static void displayLedLight(String switch_){
        loadElementInEmptyOne();
        loadElementInEmptyTwo();

        if (switch_.length() == 8){

            if(switch_.charAt(7) == '1') {

                if (switch_.charAt(0) == '1') {
                    loadElementInA();

                } else {
                    if (switch_.charAt(0) == '0') {
                        emptyElementInA();

                    } else
                        System.out.println("invalid entry");
                }

                if (switch_.charAt(1) == '1') {
                    loadElementInB();
                    System.out.println();
                } else {
                    if (switch_.charAt(1) == '0') {
                        emptyElementInB();
                        System.out.println();
                    } else
                        System.out.println("invalid entry");
                }

                if (switch_.charAt(2) == '1') {
                    loadElementInC();
                } else {
                    if (switch_.charAt(2) == '0') {
                        emptyElementInC();
                    } else
                        System.out.println("invalid entry");
                }

                if (switch_.charAt(3) == '1') {
                    loadElementInD();
                } else {
                    if (switch_.charAt(3) == '0') {
                        emptyElementInD();
                    } else
                        System.out.println("invalid entry");
                }

                if (switch_.charAt(4) == '1') {
                    loadElementInE();
                } else {
                    if (switch_.charAt(4) == '0') {
                        emptyElementInE();
                    } else
                        System.out.println("invalid entry");
                }

                if (switch_.charAt(5) == '1') {
                    loadElementInF();
                } else {
                    if (switch_.charAt(5) == '0') {
                        emptyElementInF();
                    } else
                        System.out.println("invalid entry");
                }

                if (switch_.charAt(6) == '1') {
                    loadElementInG();
                } else {
                    if (switch_.charAt(6) == '0') {
                        emptyElementInG();
                    } else
                        System.out.println("invalid entry");
                }



            }


            }

        System.out.println(Arrays.deepToString(ledLight));
        }

    }



