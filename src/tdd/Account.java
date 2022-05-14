package tdd;

public class Account {
    private final String ACCOUNT_NUMBER;
    private String accountName;
    private int balance;
    private String pin;
    private String firstName;

    public Account(String accountNumber, String firstName, String lastName, String pin) {
        ACCOUNT_NUMBER = accountNumber;
        this.accountName = firstName+" "+lastName;
        this.pin = pin;

    }

    public String getACCOUNT_NUMBER() {
        return ACCOUNT_NUMBER;
    }

    public String getAccountName() {
        return accountName;
    }

    public void deposit(int amount) {
        balance += amount;
    }


    public int getBalance(String pin) {
        return balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
