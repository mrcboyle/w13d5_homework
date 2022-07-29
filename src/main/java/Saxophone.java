import Enums.InstrumentType;
import Enums.SaxophoneVariant;

public class Saxophone extends Instrument{

    private int noOfValves;
    private SaxophoneVariant variant;

    public Saxophone(String material, String colour, int buyPrice, int sellPrice, InstrumentType type, int noOfValves, SaxophoneVariant variant) {
        super(material, colour, buyPrice, sellPrice, type);
        this.variant = variant;
        this.noOfValves = noOfValves;
    }

    public int getNoOfValves() {
        return noOfValves;
    }

    public void setNoOfValves(int noOfValves) {
        this.noOfValves = noOfValves;
    }

    public SaxophoneVariant getVariant() {
        return variant;
    }

    public void setVariant(SaxophoneVariant variant) {
        this.variant = variant;
    }

    public String playSound(){
        return "waaaarp";
    }
}
