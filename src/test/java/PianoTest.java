import Enums.InstrumentType;
import Enums.PianoVariant;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Wood", "Black", 1000, 1700, InstrumentType.PERCUSSION, 88, PianoVariant.UPRIGHT);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(1700, piano.getSellPrice());
    }

    @Test
    public void hasPianoVariant(){
        assertEquals(PianoVariant.UPRIGHT, piano.getVariant());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(700, piano.calculateMarkup());
    }

    @Test
    public void canPlaySound(){
        assertEquals("plinkety plonk", piano.playSound());
    }
}
