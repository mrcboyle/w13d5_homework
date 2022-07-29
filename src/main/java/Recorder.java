import Enums.InstrumentType;
import Enums.RecorderVariant;

public class Recorder extends Instrument{

    private RecorderVariant variant;


    public Recorder(String material, String colour, int buyPrice, int sellPrice, InstrumentType type, RecorderVariant variant) {
        super(material, colour, buyPrice, sellPrice, type);
        this.variant = variant;
    }

    public RecorderVariant getVariant() {
        return variant;
    }

    public void setVariant(RecorderVariant variant) {
        this.variant = variant;
    }

    public String playSound(){
        return "peeeeep";
    }
}
