package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    void testAgedBrieSellIn(){
        Item[] items = new Item[]{ new Item("Aged Brie", 1, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].sellIn);
    }

    @Test
    void testAgedBrieQuality(){
        Item[] items = new Item[]{ new Item("Aged Brie", 1, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1, app.items[0].quality);
    }

    @Test
    void testAgedBrieQualityLimits(){
        Item[] items = new Item[]{ new Item("Aged Brie", 1, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void testAgedBrieSellInPassed(){
        Item[] items = new Item[]{ new Item("Aged Brie", 0, 20)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(22, app.items[0].quality);
    }

    @Test
    void testSulfurasSellIn(){
        Item[] items = new Item[]{ new Item("Sulfuras, Hand of Ragnaros", 1, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1, app.items[0].sellIn);
    }

    @Test
    void testSulfurasQuality(){
        Item[] items = new Item[]{ new Item("Sulfuras, Hand of Ragnaros", 1, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(10, app.items[0].quality);
    }

    @Test
    void testBackstagePassesQuality10j(){
        Item[] items = new Item[]{ new Item("Backstage passes to a TAFKAL80ETC concert", 9, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(12, app.items[0].quality);
    }

    @Test
    void testBackstagePassesQuality5j(){
        Item[] items = new Item[]{ new Item("Backstage passes to a TAFKAL80ETC concert", 4, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(13, app.items[0].quality);
    }

    @Test
    void testBackstagePassesQualityAfterConcert(){
        Item[] items = new Item[]{ new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }



    @Test
    void testItemBasiqueSellIn(){
        Item[] items = new Item[]{ new Item("Basique", 1, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].sellIn);
    }

    @Test
    void testItemBasiqueQuality(){
        Item[] items = new Item[]{ new Item("Basique", 1, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].quality);
    }

    @Test
    void testItemBasiqueQualitySellInPassed(){
        Item[] items = new Item[]{ new Item("Basique", 0, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(8, app.items[0].quality);
    }
}
