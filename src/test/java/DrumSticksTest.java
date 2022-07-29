import items.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks(8,20, "Wood","Blue");
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(8, drumSticks.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(20, drumSticks.getSellPrice());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(12, drumSticks.calculateMarkup());
    }

}
