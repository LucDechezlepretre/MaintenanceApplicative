package com.gildedrose;

class GildedRose {
    StockedItem[] items;

    public GildedRose(Item[] items) {
        this.items = new StockedItem[items.length];
        for(int i = 0; i < items.length; i++){
            Item it = items[i];
            this.items[i] = StockedItemFactory.create(it.name, it.sellIn, it.quality);
        }
    }

    public void updateQuality() {
        for(StockedItem i : this.items) {
            i.update();
        }
    }
}
