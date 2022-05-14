package chapter4;

public class TabularOutputLoop {
    public static void main(String[] args) {
        System.out.println("N \t\t N^2\t\t N^3\t\t N^4");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i+" \t\t "+i*i+"\t\t\t"+i*i*i+ "\t\t\t"+i*i*i*i);

        }
    }
}
