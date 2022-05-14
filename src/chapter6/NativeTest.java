package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NativeTest {
    public static void main(String[] args) {
        Native aNative = new Native();
        aNative.setDayOfBirth(Day.WEDNESDAY);
        System.out.println(aNative);
    }

//    @Test
//    public void testDayOfBirth(){
//        Native aNative = new Native();
//        aNative.setDayOfBirth(Day.FRIDAY);
//        assertEquals(Day.FRIDAY, aNative.getDayOfBirth());
//    }

}