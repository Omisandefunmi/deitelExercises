package tdd;

import java.util.Scanner;

public class Receipt {
    private static final Scanner input = new Scanner(System.in);
    private static String customerName;

    public String getCustomerName(String Name) {
        customerName = Name;
        return customerName;
    }

    public String getCustomerWants(String items) {
        items = input.nextLine();
        return items;
    }
}
