package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for(Item i : this.items) {
            handleItem(i);
        }
    }
    
    public void handleItem(Item item){
        if(item.name.equals("Aged Brie")){
            handleBrie(item);
        } else if(item.name.equals("Sulfuras, Hand of Ragnaros")){
            handleSulfuras(item);
        } else if(item.name.equals("Backstage passes to a TAFKAL80ETC concert")){
            handleBackStage(item);
        } else {
            handleDefault(item);
        }
    }

    private void handleDefault(Item item) {
        if (!item.name.equals("Aged Brie")
                && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (item.quality > 0) {
                if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                    item.quality = item.quality - 1;
                }
            }
        }

        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn = item.sellIn - 1;
        }

        if (item.sellIn < 0) {
            if (!item.name.equals("Aged Brie")) {
                if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (item.quality > 0) {
                        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                            item.quality = item.quality - 1;
                        }
                    }
                }
            }
        }
    }

    private void handleBackStage(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
            if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.sellIn < 11) {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }
                if (item.sellIn < 6) {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }
            }
        }
        if(!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn = item.sellIn - 1;
        }
        if (item.sellIn < 0) {
            item.quality = item.quality - item.quality;
        }
    }

    private void handleSulfuras(Item item) {
    }

    private void handleBrie(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn = item.sellIn - 1;
        }

        if (item.sellIn < 0) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }
        }
    }
}
