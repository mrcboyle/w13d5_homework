import items.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings(3,7, "Nylon",2);
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(3, guitarStrings.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(7, guitarStrings.getSellPrice());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(4, guitarStrings.calculateMarkup());
    }
}
