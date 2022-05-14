package chapter6;

public class Native {
    private final int EXPECTED_DATE_AGE = 2_000;
    private Day dayOfBirth;


    public Day getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(Day dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    @Override
    public String toString(){
        return dayOfBirth.toString() + " " + EXPECTED_DATE_AGE;

    }
}
