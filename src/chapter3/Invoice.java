package chapter3;

public class Invoice
{

    /* (Invoice Class) Create a class called Invoice that a hardware store might
    use to represent an invoice for an item sold at the store. An Invoice should
    include four pieces of information as instance variables—a part number (type
    String), a part description (type String), a quantity of the item being
    purchased (type int) and a price per item (double). Your class should have a
    constructor that initializes the four instance variables. Provide a set and
    a get method for each instance variable.
    In addition, provide a method named getInvoiceAmount that calculates the invoice
     amount (i.e., multiplies the quantity by the price per item), then returns the
     amount as a double value. If the quantity is not positive, it should be set to 0.
     If the price per item is not positive, it should be set to 0.0. Write a test app
     named InvoiceTest that demonstrates class Invoice’s capabilities.
     */

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;


    public Invoice(String partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;
    }

    public void setPartNumber (String partNumber){
        this.partNumber = partNumber;
    }
    public String getPartNumber() {
        return partNumber;
    }


    public void setPartDescription(String partDescription){
        this.partDescription = partDescription;
    }
    public String getPartDescription(){
        return partDescription;
    }


    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }


    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }


    public double getInvoiceAmount(){
        return price * quantity;
    }

}
