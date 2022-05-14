package tdd;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    private Television tv;

    @BeforeEach
    public void alwaysStartWith(){
        tv = new Television();
    }

    @Test

    public void testThatTVCanBePowered(){
        tv.power();
        tv.power();

        assertFalse(tv.isOn());
    }

    @Test
    public void testThatVolumeWorks(){
        tv.power();

        assertEquals(1, tv.increaseVolume());

    }
   @Test
    public void testThatVolumeCanIncrease(){
        tv.power();

        tv.increaseVolume();
        tv.increaseVolume();
        assertEquals(2, tv.increaseVolume());
    }


  @Test
  public void testThatVolumeCanDecrease() {
      tv.power();
      tv.increaseVolume();
      tv.increaseVolume();
      tv.decreaseVolume();
      assertEquals(1, tv.decreaseVolume());

    }

    @Test
    public void testThatVolumeCanIncreaseBeyond10(){
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();

        assertEquals(10, tv.increaseVolume());
    }

    @Test
    public void testThatVolumeCannotDecreaseBeyondZero(){
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();

        tv.decreaseVolume();
        tv.decreaseVolume();
        tv.decreaseVolume();
        tv.decreaseVolume();
        assertEquals(0, tv.decreaseVolume());
    }

    @Test
    public void teatThatTvCanBeMuted(){
        tv.toggleMute();
        tv.toggleMute();

        assertTrue(tv.isMute());
    }

    @Test
    public void testThatVolumeIsZeroWhenMuted(){
        tv.toggleMute();
        tv.toggleMute();

        tv.increaseVolume();

        assertEquals(0,tv.getVolume());
    }
}
