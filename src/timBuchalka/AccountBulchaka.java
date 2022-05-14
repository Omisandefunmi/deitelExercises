package timBuchalka;

import java.util.Objects;

public class AccountBulchaka {
    private String accountNumber;
    private String accountName;
    private double accountBalance;
    private String accountEmail;


    public void setAccountNumber(String accountNumber) {
        if(!Objects.equals(accountNumber, ""))
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountName(String accountName) {
        if(!Objects.equals(accountName, ""))
            this.accountName = accountName;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;

    }

    public String getAccountEmail() {
        return accountEmail;
    }

    public void deposit(double depositAmount) {
        accountBalance += depositAmount;
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount >= 0 && accountBalance > 0 && accountBalance >= withdrawAmount )
            accountBalance -=  withdrawAmount;
    }
}
