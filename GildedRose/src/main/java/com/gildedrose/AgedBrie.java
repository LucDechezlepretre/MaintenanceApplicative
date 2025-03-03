package com.gildedrose;

public class AgedBrie extends StockedItem{

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        if(this.quality < 50) {
            this.quality = this.quality + 1;
        }
        this.sellIn = this.sellIn - 1;

        if (this.sellIn < 0) {
            if (this.quality < 50) {
                this.quality = this.quality + 1;
            }
        }
    }
}
