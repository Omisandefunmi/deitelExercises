package chapter3;


import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AccountBook account1 = new AccountBook("bassey");

        System.out.println(account1.getName());

        System.out.println("Kindly input account name");
        String accountName =input.nextLine();

        account1.setName(accountName);
        System.out.println("Kindly input account number");

        int accountNumber =input.nextInt();

        account1.setAccountNUmber(accountNumber);
        account1.setBalance(7567.97);

        account1.setBvn(5975940);
        account1.setAddress("8,so easy road");
        account1.depositMoney(200);
        System.out.println(account1.getBalance());

    }


}
