package items;

public class GuitarStrings extends Item{
    private String material;
    private int gauge;

    public GuitarStrings(int buyPrice, int sellPrice, String material, int gauge) {
        super(buyPrice, sellPrice);
        this.material = material;
        this.gauge = gauge;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getGauge() {
        return gauge;
    }

    public void setGauge(int gauge) {
        this.gauge = gauge;
    }
}


