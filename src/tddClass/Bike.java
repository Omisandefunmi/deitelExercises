package tddClass;

public class Bike {
    private boolean isOn;
    private int speed = 0;
    private String gear = "Gear One";

    public void setPower() {
        if (!isOn) {
            isOn = true;
        } else if (isOn) {
            isOn = false;
        }
    }

    public boolean getPower() {
        return isOn;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void accelerate() {

        if (speed >= 0 && speed <= 20) {
            speed += 1;
        } else if (speed >= 21 && speed <= 30) {
            speed += 2;
        } else if (speed >= 31 && speed <= 40) {
            speed += 3;
        } else {
            speed += 4;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void decelerate() {
        if (speed > 0 && speed <= 24) {
            speed -= 1;
        } else if (speed >= 21 && speed <= 30) {
            speed -= 2;
        } else if (speed >= 31 && speed <= 40) {
            speed -= 3;
        } else {
            speed -= 4;
        }
    }


    public String getGear() {
        return gear;
    }

    public void gearTransition() {
        if (speed >= 0 && speed <= 20)
            gear = "Gear One";
        if (speed >= 21 && speed <= 30)
            gear = "Gear Two";
        if (speed >= 31 && speed <= 40)
            gear = "Gear Three";
        if (speed >= 40)
            gear = "Gear four";
    }
}
