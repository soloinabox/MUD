package com.solo.mud.entities.areas;

public class Dungeon {

    private final String name;
    private final String description;
    private final int x, y; // Starting coordinates
    private final Room[][] rooms;

    public Dungeon(String name, String description, int x, int y, Room[][] rooms) {
        this.name = name;
        this.description = description;
        this.x = x;
        this.y = y;
        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Room[][] getRooms() {
        return rooms;
    }
}
