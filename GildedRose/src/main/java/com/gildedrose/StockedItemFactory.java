package com.gildedrose;

public class StockedItemFactory {
    private static final String AGED_BRIE = "Aged Brie";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    public static StockedItem create(String name, int sellIn, int quality){
        switch (name){
            case AGED_BRIE:
                return new AgedBrie(AGED_BRIE, sellIn, quality);
            case SULFURAS:
                return new Sulfuras(SULFURAS, sellIn, quality);
            case BACKSTAGE:
                return new Backstage(BACKSTAGE, sellIn, quality);
            default:
                return new Default(name, sellIn, quality);
        }
    }
}
