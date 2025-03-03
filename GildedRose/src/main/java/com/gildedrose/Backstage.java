package com.gildedrose;

public class Backstage extends StockedItem{
    public Backstage(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        if (this.quality < 50) {
            this.quality = this.quality + 1;
            if (this.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (this.sellIn < 11) {
                    if (this.quality < 50) {
                        this.quality = this.quality + 1;
                    }
                }
                if (this.sellIn < 6) {
                    if (this.quality < 50) {
                        this.quality = this.quality + 1;
                    }
                }
            }
        }
        if(!this.name.equals("Sulfuras, Hand of Ragnaros")) {
            this.sellIn = this.sellIn - 1;
        }
        if (this.sellIn < 0) {
            this.quality = 0;
        }
    }
}
