package com.solo.mud.entities.items;

import com.solo.mud.entities.items.exceptions.ItemNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class ItemHandler {

    private static final List<Item> items = new ArrayList<>();

    public static void init() {

        // Add items to item list

    }

    public static Item getItem(int id) throws ItemNotFoundException {

        for(Item i : items) {

            if(i.getId() == id) return i;

        }

        throw new ItemNotFoundException(id);

    }

}
