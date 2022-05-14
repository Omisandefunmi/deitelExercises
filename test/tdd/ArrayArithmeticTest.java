package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayArithmeticTest {

    @Test
    public void testThatArrayClassExists(){
        ArrayArithmetic array = new ArrayArithmetic();
        assertNotNull(array);
    }

//    @Test
//    public void testThatArraySizeCanBeCreated(){
//        ArrayArithmetic array = new ArrayArithmetic();
////        int [] myArray = {1,2,3,4,5,6,7,8,9,10};
//        array.getArraySize(10);
////        int [] myArray = {1,2,3,4,5,6,7,8,10};
//        assertEquals(10, array.getArraySize(10));
//    }
    @Test
    public void testThatArrayCanBeInitialized(){
        ArrayArithmetic array = new ArrayArithmetic();
        int [] myArray ;

    }

    @Test
    public void testMaximumNumberInArray(){
        int[] scores = {34,23,14,45,23};
//        assertEquals(45,);
    }

}
