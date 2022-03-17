package tddClass;

import org.junit.jupiter.api.Test;
import org.junit.platform.engine.discovery.PackageNameFilter;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    @Test
    public void testThatACIsOn(){
        AirConditioner panasonic = new AirConditioner();
        boolean result = panasonic.isOn();
        assertTrue(result);
    }

   @Test
    public void testThatTemperatureIs16(){
        AirConditioner panasonic = new AirConditioner();

        panasonic.getTemperature();
        assertEquals(16, panasonic.getTemperature());
   }

   @Test
   public void testThatTemperatureCanIncrease(){
       AirConditioner panasonic = new AirConditioner();
       //panasonic.setTemperature(17);
       panasonic.increaseTemperature();
       panasonic.increaseTemperature();
       panasonic.increaseTemperature();
       panasonic.increaseTemperature();
       panasonic.getTemperature();
       assertEquals(20, panasonic.getTemperature());
   }


   @Test
   public void testThatTemperatureCanDecrease(){
       AirConditioner panasonic = new AirConditioner();
       //panasonic.setTemperature(16);
       panasonic.increaseTemperature();
       panasonic.increaseTemperature();
       panasonic.increaseTemperature();
       panasonic.decreaseTemperature();
       panasonic.getTemperature();
       assertEquals(18, panasonic.getTemperature());
   }

   @Test
    public void testThatTemperatureCannotBeBeyond30(){
        AirConditioner panasonic = new AirConditioner();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();
        panasonic.increaseTemperature();

        assertEquals(30, panasonic.getTemperature());
   }

   @Test
    public void testThatTemperatureCannotDecreaseBeyond16(){
        AirConditioner panasonic = new AirConditioner();
        panasonic.decreaseTemperature();
        panasonic.decreaseTemperature();

        assertEquals(16, panasonic.getTemperature());
   }



}

