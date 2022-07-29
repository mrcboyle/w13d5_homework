import Enums.InstrumentType;
import Enums.SaxophoneVariant;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone("Brass", "Gold", 400, 750, InstrumentType.BRASS, 20, SaxophoneVariant.SMALL);
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(400, saxophone.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(750, saxophone.getSellPrice());
    }

    @Test
    public void hasSaxophoneVariant(){
        assertEquals(SaxophoneVariant.SMALL, saxophone.getVariant());
    }

    @Test
    public void canGetNoOfValves(){
        assertEquals(20, saxophone.getNoOfValves());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(350, saxophone.calculateMarkup());
    }

    @Test
    public void canPlaySound(){
        assertEquals("waaaarp", saxophone.playSound());
    }
}


