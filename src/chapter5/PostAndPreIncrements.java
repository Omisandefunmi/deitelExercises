package chapter5;

public class PostAndPreIncrements {
    public static void main(String[] args) {

        int count = 20;
        int full = 10;
        int sum = ++count;
        System.out.println(sum);
        int preIncrement = full++ + ++count;

        int postIncrement = ++full + count++;
        System.out.println(preIncrement);
        System.out.println(postIncrement);
        System.out.println(++count);

    }
}
