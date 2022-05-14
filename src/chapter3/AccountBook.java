package chapter3;

public class AccountBook {

    private String name;
    private int accountNUmber;
    private double balance;
    private int bvn;
    private String address;

    public AccountBook(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAccountNUmber(int numbers){
        this.accountNUmber=numbers;
    }
    public int getAccountNUmber(){
        return accountNUmber;
    }

    public void setBalance(double balance){
        this.balance= balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setBvn(int bvn){
        this.bvn=bvn;
    }

    public int getBvn(){
        return bvn;
    }

    public void setAddress(String address){
        this.address= address;
    }

    public String getAddress() {
        return address;
    }

    public void depositMoney(double money){
        this.balance=this.balance+money;
    }
}
