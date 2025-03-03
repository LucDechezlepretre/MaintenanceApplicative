package com.gildedrose;

public abstract class StockedItem extends Item{
    public StockedItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    public abstract void update();
}
