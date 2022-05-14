package chapter3;

public class BankAccount {

    private String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        if (balance > 0.00){
            this.balance = balance;
        }

    }

    public void deposit(double depositedCash) {
        if (depositedCash > 0.00){
            balance = balance + depositedCash;
        }
    }



    public double getBalance(){
        return balance;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void transfer(double amount, BankAccount account){
        account.deposit(amount);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("kel",5000);
        BankAccount account2 = new BankAccount("funmi",2000);

        account1.transfer(2000,account2);
        System.out.println(account2.getBalance());
    }

}


