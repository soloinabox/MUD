package com.solo.mud.entities.items.exceptions;

public class ItemNotFoundException extends Exception{

    private final int id;

    public ItemNotFoundException(int id) {

        this.id = id;

    }

    @Override
    public String getMessage() {
        return "Item of ID " + this.id + " does not exist.";
    }
}
