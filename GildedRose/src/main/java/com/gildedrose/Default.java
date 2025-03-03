package com.gildedrose;

public class Default extends StockedItem{
    public Default(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        if (!this.name.equals("Aged Brie")
                && !this.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (this.quality > 0) {
                if (!this.name.equals("Sulfuras, Hand of Ragnaros")) {
                    this.quality = this.quality - 1;
                }
            }
        }

        if (!this.name.equals("Sulfuras, Hand of Ragnaros")) {
            this.sellIn = this.sellIn - 1;
        }

        if (this.sellIn < 0) {
            if (!this.name.equals("Aged Brie")) {
                if (!this.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (this.quality > 0) {
                        if (!this.name.equals("Sulfuras, Hand of Ragnaros")) {
                            this.quality = this.quality - 1;
                        }
                    }
                }
            }
        }
    }
}
