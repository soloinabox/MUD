package com.solo.mud.entities.containers;

import com.solo.mud.entities.items.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Container {

    private final List<Item> items = new ArrayList<>();
    private final int size;

    public Container(int size) {

        this.size = size;

    }

    public Container(int size, Item[] items) {

        this.size = size;
        Collections.addAll(this.items, items);

    }

    public void addItem(Item item) {

        this.items.add(item);

    }

    public Item takeItem(int index) {

        Item i = items.get(index);
        items.remove(index);
        return i;

    }

    public List<Item> getItems() {
        return items;
    }
}
