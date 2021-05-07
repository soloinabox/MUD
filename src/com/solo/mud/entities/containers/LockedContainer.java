package com.solo.mud.entities.containers;

import com.solo.mud.entities.items.Item;

public class LockedContainer extends Container {

    private final Item key;
    private boolean locked;

    public LockedContainer(int size, Item key) {

        super(size);
        this.key = key;
        this.locked = true;

    }

    public LockedContainer(int size, Item[] items, Item key) {

        super(size, items);
        this.key = key;
        this.locked = true;

    }

    public void unlock(int itemId) {

        if(itemId == key.getId()) {
            this.locked = false;
        }

    }

}
