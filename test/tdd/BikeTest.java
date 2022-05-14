package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    @Test
    public void testThatBikeCanTurnOn(){
        Bike myBike = new Bike();
        myBike.setPower();
        myBike.setPower();
        assertFalse(myBike.getPower());
    }

    @Test
    public void testThatBikeCanAccelerate(){
        Bike myBike = new Bike();
        myBike.setSpeed(15);
        myBike.accelerate();
        assertEquals(16, myBike.getSpeed());
    }

    @Test
    public void testThatBikeCanDecelerate() {
        Bike myBike = new Bike();
        myBike.setSpeed(20);
        myBike.decelerate();

        assertEquals(19, myBike.getSpeed());
    }

    @Test
    public void testThatBikeWontDecelerateBelowZero(){
        Bike myBike = new Bike();
        myBike.setSpeed(20);
        myBike.decelerate();
        myBike.decelerate();
        myBike.decelerate();
        myBike.decelerate();
        myBike.decelerate();
        myBike.decelerate();
        myBike.decelerate();
        myBike.decelerate();
        myBike.decelerate();
        myBike.decelerate();
        myBike.decelerate();
        myBike.decelerate();
        myBike.decelerate();
        myBike.decelerate();
        myBike.decelerate();
        myBike.decelerate();
        myBike.decelerate();
        myBike.decelerate();
        myBike.decelerate();
        myBike.decelerate();
        myBike.decelerate();
        myBike.decelerate();

        assertEquals(0, myBike.getSpeed());
    }

    @Test
    public void testThatGearChangesAutomatically() {
        Bike myBike = new Bike();
        myBike.setSpeed(20);
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();


        assertEquals(34, myBike.getSpeed());
    }

    @Test
    public void testGearState(){
        Bike myBike = new Bike();
        myBike.getGear();

        assertEquals("Gear One", myBike.getGear());
    }


}
