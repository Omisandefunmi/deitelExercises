package tdd;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

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
        int result = quotient.getDivision(3,1);

        assertEquals(3, result);

    }

    @Test
    public void testThatChibuzoWillNotDie(){
        Kata keepAlive = new Kata();

        String alive = keepAlive.getOxygen("wan faint");
        assertEquals("pump am Oxygen make e no die", alive);
    }

    @Test
    public void maximumNumberInArrayTest(){
        int [] scores = {34,23,14,45,23,57,200};
        assertEquals(200, Kata.findMaximumFrom(scores));
    }

    @Test
    public void averageOfArrayTest(){
        int [] score = {10,10,10,10,10};
        assertEquals(10,Kata.findAverageOf(score));
    }

    @Test
    public void minimumNumberInArrayTest(){
        int [] score = {10,80,4,6,3};
        assertEquals(3, Kata.findMinimumNumber(score));
    }

    @Test
    public void totalOfArray(){
        int [] array = {0,3,4,2,1};
        assertEquals(10, Kata.findTotalOf(array));
    }

    @Test
    public void descendingOrderOf(){
        int [] array = {6,98,3,5,2};
        int[] expected = {98,6,5,3,2};
        assertArrayEquals(expected, Kata.findDescendingOrderOf(array));
    }

    @Test
    public void highestIndexTest(){
        int [] array = {6,98,3,5,2};
        assertEquals(1, Kata.getHighestIndexFrom(array));
    }


    @Test
    public void dateTimeTest(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, dd/MM/yyyy, HH:mm:ss a");
        String myDate = formatter.format(LocalDateTime.of(1994,5,4,22,0,0));
        System.out.println(myDate);
    }

    @Test
    public void sumMultiDimensionalArrayTest(){
        int [][] scores = {{2,3,4},{1,5,8}};
        int arraySum = Kata.sumMultiDimensionalArray(scores);
        assertEquals(16, arraySum);
    }
    @Test
    public void sumOfDistinctElementsInTwoArraysCanBeCalculatedTest(){
        int[] array1 = {3,1,7,9};
        int[] array2 = {2,4,1,9,3};
        assertEquals(13,Kata.findSumOfDistinctElements(array1,array2));
    }

    @Test
    public void sumOfSameElementsInTwoArraysCanBeCalculatedTest(){
        int[] array1 = {12,13,6,10};
        int[] array2 = {13,10,16,15};
        assertEquals(46,Kata.findSumOfSameElements(array1,array2));
    }




}
