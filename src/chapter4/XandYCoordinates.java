package chapter4;

import java.util.Scanner;

public class XandYCoordinates {
    public static void main(String[] args) {
//        (Distance between two points) Write an application that reads the x and y coordinates of
//        two points on a plane and prints whether the points are located on a line perpendicular to an axis.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of x1 coordinate: ");
        int x1 = scanner.nextInt();

        System.out.print("Enter value of y1 coordinate: ");
        int y1 = scanner.nextInt();

        String point1 = "Point1 = ("+x1+ ", "+y1+")";
        System.out.println(point1);

        System.out.print("Enter value of x2 coordinate: ");
        int x2 = scanner.nextInt();

        System.out.print("Enter value of y2 coordinate: ");
        int y2 = scanner.nextInt();

        String point2 = "Point2 = ("+x2+ ", " +y2+")";
        System.out.println(point2);

        if(x1 == x2 || y1 == y2)
            System.out.println("Points 1 and 2 are located on a line perpendicular to either x or y axis.");
        else
            System.out.println("Points 1 and 2 are not perpendicular to any axis.");

    }
}
