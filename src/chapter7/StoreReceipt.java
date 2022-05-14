package chapter7;

import java.util.Scanner;

public class StoreReceipt {
    public static double getPurchasePrice() {
        double total = itemQuantity * pricePerUnit;
        return total;
    }

    public static double getPurchasePrice(Product product) {
        double total = product.getUnitPrice() * product.getQuantity();
        return total;
    }


    private static String customerName;
    private static String purchaseItem;
    private static int itemQuantity;
    private static double pricePerUnit;
    private static String cashierName;
    private static Product[] shoppingCart = new Product[10];
    private static double total;
    private static final double vat = 17.98;
    private static final Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

    }
    public static void displayQuestions() {
        System.out.println("I am prompting");
    }


    public static void deletedCode(){

        System.out.println("What is the customer's name?");
        customerName = input.nextLine();

        String sentinel;
        boolean ifMoreSales = true;
        while (ifMoreSales) {

            System.out.println("What did the Customer buy?");
            purchaseItem = input.nextLine();

            System.out.println("How many pieces?");

            itemQuantity = input.nextInt();
            if (itemQuantity < 0) {
                System.out.println(customerName + " has bought nothing");
                break;
            }


            System.out.println("How much per unit?");
            pricePerUnit = input.nextDouble();
            input.nextLine();

            Product product = new Product(purchaseItem, itemQuantity, pricePerUnit);
            shoppingCart[0] = product;

//            if (sentinel.equals("no")) {
//                ifMoreSales = false;
//            } else if (sentinel.equals("yes"))
//                getCustomerOrder(input);
//            else {
//                System.out.println("You have entered an invalid response!" +
//                        "\nKindly enter either \"yes\" or \"no\"");
////                queryIfMoreSales(input);
//
//            }


//            switch (sentinel.toLowerCase()) {
//                case "yes":
//                    getCustomerOrder(input);
//                    break;
//                case "no":
//                    ifMoreSales = false;
//                    break;
//                default:
//                    System.out.println("You have entered an invalid response!" +
//                            "\nKindly enter either \"yes\" or \"no\"");
//                    System.out.println("Add more items?");
//                    sentinel = input.nextLine().toLowerCase();
//
//            }
        }
        System.out.println("How much discount will "+ customerName + " get?");
        int discount = input.nextInt();
        input.nextLine();



        System.out.println("Sold by whom?");
        cashierName = input.nextLine();
        String invoice = String.format("""
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS
                TEL: 08021212121
                CASHIER: %s
                CUSTOMER NAME: %s
                """, cashierName, customerName
        );
        System.out.println(invoice);
        System.out.printf("""
                 SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS
                TEL: 08021212121
                CASHIER: %s
                CUSTOMER NAME: %s
                """, cashierName, customerName);

        System.out.println("SEMICOLON STORES\n" +
                "MAIN BRANCH\n" +
                "LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS\n" +
                "TEL: 081002207299182\n" +
                "CASHIER: "+cashierName+"\n" +
                "CUSTOMER NAME: "+customerName);

        System.out.println("===========================================================");
        System.out.println();
        System.out.println("\t\t\t ITEM\t\tQTY\t\tPRICE\t\tTOTAL(NGN)");
        System.out.println("-----------------------------------------------------------");
        System.out.println();

        System.out.println("\t\t\t"+purchaseItem+"\t\t"+itemQuantity+"\t\t"+pricePerUnit+"\t\t"+total);


    }

//        getCustomerOrder(input);
//        getDiscountFor(input, customerName);
//        queryIfMoreSales(input);
//        getCashierName(input);





}









