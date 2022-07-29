import Enums.GuitarVariant;
import Enums.InstrumentType;

public class Guitar extends Instrument{

    private int noOfStrings;
    private GuitarVariant variant;

    public Guitar(String material, String colour, int buyPrice, int sellPrice, InstrumentType type, int noOfStrings, GuitarVariant variant) {
        // sent back to the super class to be dealt with
        super(material, colour, buyPrice, sellPrice, type);
        this.noOfStrings = noOfStrings;
        this.variant = variant;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public void setNoOfStrings(int noOfStrings) {
        this.noOfStrings = noOfStrings;
    }

    public GuitarVariant getVariant() {
        return variant;
    }

    public void setVariant(GuitarVariant variant) {
        this.variant = variant;
    }

    public String playSound(){
        return "thrummmmm";
    }
}

