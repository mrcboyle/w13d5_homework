import items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic(4,10, "Nirvana","In Utero");
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(4, sheetMusic.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(10, sheetMusic.getSellPrice());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(6, sheetMusic.calculateMarkup());
    }

}
