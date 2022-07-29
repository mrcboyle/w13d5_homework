import Enums.*;
import items.DrumSticks;
import items.GuitarStrings;
import items.SheetMusic;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;
    Saxophone saxophone;
    Recorder recorder;
    DrumSticks drumSticks;
    GuitarStrings guitarStrings;
    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic(4,10, "Nirvana","In Utero");
        drumSticks = new DrumSticks(8,20, "Wood","Blue");
        guitarStrings = new GuitarStrings(3,7, "Nylon",2);
        guitar = new Guitar("Wood","Red", 100,150, InstrumentType.STRING, 6, GuitarVariant.ELECTRIC);
        piano = new Piano("Wood", "Black", 1000, 1700, InstrumentType.PERCUSSION, 88, PianoVariant.UPRIGHT);
        recorder = new Recorder("Plastic", "Brown", 5, 15, InstrumentType.WOODWIND, RecorderVariant.SMALL);
        saxophone = new Saxophone("Brass", "Gold", 400, 750, InstrumentType.BRASS, 20, SaxophoneVariant.SMALL);
    }

//    @Test
//    public void stockStartsAtZero(){
//        assertEquals(0, shop.getStock());
//    }

    @Test
    public void canAddStock(){
        shop.addStock(guitar);
        shop.addStock(piano);
        shop.addStock(recorder);
        shop.addStock(saxophone);
        shop.addStock(sheetMusic);
        shop.addStock(drumSticks);
        shop.addStock(guitarStrings);
        assertEquals(7, shop.getStock());
    }
//
//    @Test
//    public void canRemoveStock(){
//        shop.addStock(guitar);
//        shop.addStock(piano);
//        shop.addStock(recorder);
//        shop.addStock(saxophone);
//        shop.addStock(sheetMusic);
//        shop.addStock(drumSticks);
//        shop.addStock(guitarStrings);
//        shop.removeStock(guitar);
//        assertEquals(6, shop.getStock());
//    }

}
