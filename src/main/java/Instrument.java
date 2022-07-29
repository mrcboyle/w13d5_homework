import Behaviours.IPlay;
import Behaviours.ISell;
import Enums.InstrumentType;

public abstract class Instrument implements ISell, IPlay {

    // we declare the variables at the top to make them available in the entire class
    private String material;
    private String colour;
    private int buyPrice;
    private int sellPrice;
    private InstrumentType type;

    public Instrument(String material, String colour, int buyPrice, int sellPrice, InstrumentType type) {
        this.material = material;
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    // no need to pass anything in to the brackets as the values exist in this class
    public int calculateMarkup(){
        return this.sellPrice - this.buyPrice;
    }
}
