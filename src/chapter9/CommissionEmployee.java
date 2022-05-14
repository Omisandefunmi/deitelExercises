package chapter9;

public class CommissionEmployee {

    private String firstName;
    private String secondName;
    private String socialNumber;
    private double grossPay;
    private double commissionRate;



    public void setFirstName(String firstName) {
            this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getSocialNumber() {
        return socialNumber;
    }

    public void setSocialNumber(String socialNumber) {
        this.socialNumber = socialNumber;
    }

    public void setGrossPay(double grossPay) {
        if(grossPay >= 0) {
            this.grossPay = grossPay;
        }
        else
            throw new IllegalArgumentException("Gross pay can't be a negative value");
    }

    public double getGrossPay() {
        return grossPay;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
}
