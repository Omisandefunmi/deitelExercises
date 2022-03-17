package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KataTest {

    @Test
    public void additionTest(){
        Kata calculator = new Kata();
        int result = calculator.getSum(3,4);
        assertEquals(7,result);

    }
    @Test
    public void absoluteSubtractionTest(){
        Kata calculator = new Kata();
        int result = calculator.getFlipSubtract(2,7);
        assertEquals(5, result);
    }


    @Test
    public void subtractionTest(){
        Kata calculator = new Kata();
        int result = calculator.getSubtraction(8, 7);
        assertEquals(1, result);
    }

    @Test
    public void areaOfCircle(){
        Kata calculator = new Kata();
        double result = calculator.getArea(8);
        assertEquals(201.06192982974676, result);
    }

    @Test
    public void bitFlipperTest(){
        Kata flip = new Kata();
        int flipValue = flip.getFlipper(0);
        assertEquals(1, flipValue);
    }

    @Test
    public void palindromeTest(){
        Kata palindrome = new Kata();
        boolean result = palindrome.isPalindrome(11011);
        assertTrue(result);
    }

    @Test
    public void testDrillerUTMETest() {
        Kata testDriller = new Kata();
        int amount = testDriller.getDiscountPrice(3);
        assertEquals(6000, amount);
    }

    @Test
    public void quotientTest(){
        Kata quotient = new Kata();
        int result = quotient.getDivision(3,0);

        assertEquals(0, result);

    }

    @Test
    public void testThatChibuzoWillNotDie(){
        Kata keepAlive = new Kata();

        String alive = keepAlive.getOxygen("wan faint");
        assertEquals("pump am Oxygen make e no die", alive);
    }


}
