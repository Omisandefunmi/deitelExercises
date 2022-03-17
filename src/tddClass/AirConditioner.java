package tddClass;

public class AirConditioner {

    private int temperature = 16;


    public boolean isOn() {
        return true;
    }

    public void setTemperature(int degree) {
        temperature = degree;
    }

    public int getTemperature() {
        return temperature;
    }


    public void increaseTemperature() {
        if(temperature >= 16 && temperature <= 30){
            temperature += 1;
        }
        if (temperature > 30){
            temperature = 30;
        }
    }

    public void decreaseTemperature() {
        if(temperature <= 30 && temperature > 16){
            temperature -= 1;
        }
    }
}