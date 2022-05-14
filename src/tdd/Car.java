package tdd;

public class Car {
    private String carModel;
    private String carYear;
    private double carPrice;


    public Car(String model, String year, double price) {
        this.carModel = model;
        this.carYear = year;
        this.carPrice = price;
    }

    public void setCarModel(String model) {
        carModel = model;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarYear(String year) {
        carYear = year;
    }

    public String getCarYear() {
        return carYear;
    }

    public void setCarPrice(double price) {
        if(price >= 0){
        carPrice = price;
        }
    }

    public double getCarPrice() {
        return carPrice;
    }


    public double getDiscountedPrice(double discount) {
        return carPrice - ((discount * carPrice) / 100);
    }
}
