package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarClassTest {
    private Car car;
    @BeforeEach
    public void setUp(){
        car = new Car("toyota", "2012", 235.50);
    }

    @Test
    public void testThatCarCanExist(){
    assertNotNull(car);

    }

    @Test
    public void testThatCarHasModel(){
        car.setCarModel("Toyota");
        assertEquals("Toyota", car.getCarModel());
    }

    @Test
    public void testThatCarHasYear(){
        car.setCarYear("2012");
        assertEquals("2012", car.getCarYear());
    }

    @Test
    public void testThatCarHasPrice(){
        car.setCarPrice(235.50);
        assertEquals(235.50,car.getCarPrice());
    }

    @Test
    public void testThatCarHasConstructor(){
        Car car = new Car("Toyota", "2012", 235.50);
        assertNotNull(car);
    }

    @Test
    public void testThatPriceCanNotBeNegative(){
        car.setCarPrice(-1000);
        assertEquals(235.50, car.getCarPrice());
    }

    @Test
    public void testThatPriceCanBeDiscounted(){

        car.getDiscountedPrice(7);
        assertEquals(219.015, car.getDiscountedPrice(7));
//        car.setCarPrice();
//        assertEquals();
    }


}
