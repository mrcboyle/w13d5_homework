package shop;

import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private int till;
    private ArrayList<ISell>stock;

    public Shop(int till) {
        this.till = till;
        this.stock = new ArrayList<>();
    }

    public int getStock() {
        return stock.size();
    }

    public void addStock(ISell stock) {
        this.stock.add(stock);
    }

    public void removeStock(ISell stock) {
        this.stock.remove(stock);
    }
}
