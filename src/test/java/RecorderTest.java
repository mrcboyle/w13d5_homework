import Enums.InstrumentType;
import Enums.RecorderVariant;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecorderTest {

        Recorder recorder;

        @Before
        public void before(){
            recorder = new Recorder("Plastic", "Brown", 5, 15, InstrumentType.WOODWIND, RecorderVariant.SMALL);
        }

        @Test
        public void hasBuyPrice(){
            assertEquals(5, recorder.getBuyPrice());
        }

        @Test
        public void hasSellPrice(){
            assertEquals(15, recorder.getSellPrice());
        }

        @Test
        public void hasSaxophoneVariant(){
            assertEquals(RecorderVariant.SMALL, recorder.getVariant());
        }

        @Test
        public void canCalculateMarkup(){
            assertEquals(10, recorder.calculateMarkup());
        }

    @Test
    public void canPlaySound(){
        assertEquals("peeeeep", recorder.playSound());
    }
    }
