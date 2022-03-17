package tddClass;

public class Kata {

    public int getSum(int value1, int value2) {
        return value1 + value2;
    }

    public int getSubtraction(int value1, int value2) {
        return value1 - value2;
    }

    public double getArea(double value1) {
        return Math.PI * value1 * value1;
    }

    public int getFlipper(int value) {
        if (value == 1) return 0;
        else
            return 1;
    }

    public boolean isPalindrome(int digit) {
        int firstDigit = digit / 10000;
        int secondDigit = (digit % 10000) / 1000;
        int thirdDigit = (digit % 1000) / 100;
        int fourthDigit = (digit % 100) / 10;
        int fifthDigit = digit % 10;

        if (firstDigit == fifthDigit && secondDigit == fourthDigit)
            return true;
        else
            return false;
    }

    public int getDiscountPrice(int quantity) {
        if (quantity <= 4)
            return (quantity * 2000);
        else if (quantity >= 5 && quantity <= 9)
             return quantity * 1800;

        else if(quantity >= 10 && quantity <= 29)
            return quantity * 1600;
        else if(quantity >= 30 && quantity <= 49)
            return quantity * 1500;

        else if(quantity >= 50 && quantity <= 99)
            return quantity * 1300;
        else if(quantity >= 100 && quantity <= 199)
            return quantity * 1200;

        else if(quantity >= 200 && quantity <= 499)
            return quantity * 1100;
        else
            return quantity * 1000;

    }

    public int getDivision(int number1, int number2) {
        if(number1 > number2)
        return number1 / number2;
        else if(number2 == 0 && number1 == 0)
            return 0;
        else
            return number2/number1;

    }

    public int getFlipSubtract(int value1, int value2) {
        if(value1 > value2)
            return value1 - value2;
            else
                return value2 - value1;


    }

    public String getOxygen(String chibuzo) {
        if(chibuzo == "wan faint")
            return "pump am Oxygen make e no die";
       else
           return "buy am food";
    }
}
