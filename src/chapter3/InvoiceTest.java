package chapter3;

public class
InvoiceTest {
    public static void main(String[] args) {
      Invoice shopRite = new Invoice("ig47", "bottle water", 4, 80.0);

      System.out.printf("invoice amount is: %.2f%n", shopRite.getInvoiceAmount());



    }
}
