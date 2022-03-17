package tddClass;

public class Account {
    private String firstName;
    private double balance;

    public Account(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void deposit(double amount) {
        if (amount > 0.0)
            balance = balance + amount;
    }

    public double getBalance() {
        return balance;
    }

    public void withdrawal(double amount) {
        if (amount > 0.0 && amount <= balance)
            balance = balance - amount;

        else {
            balance = balance;
        }
    }



}