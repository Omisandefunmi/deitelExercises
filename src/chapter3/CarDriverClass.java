package chapter3;

import tdd.Car;

public class CarDriverClass {
    public static void main(String[] args) {

        Car volvo = new Car("Volvo", "2021", 20_000);


        Car toyota = new Car("Toyota", "2006", 25_000);

        System.out.println("You have successfully purchased "+volvo.getCarModel()+
                " "+volvo.getCarYear() + " at a discounted price of "+volvo.getDiscountedPrice(5));

        System.out.println("You have successfully purchased "+toyota.getCarModel()+
                " "+toyota.getCarYear() + " at a discounted price of "+toyota.getDiscountedPrice(5));
    }
}
