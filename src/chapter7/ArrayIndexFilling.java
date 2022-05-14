package chapter7;

public class ArrayIndexFilling {
    public static void main(String[] args) {
        int [] yemisiLove = new int[10];

        for (int i = 0; i < yemisiLove.length; i++) {
            yemisiLove[i] = i+1;

            System.out.println("The element of index "+i+ " is "+yemisiLove[i]);

        }
    }
}
