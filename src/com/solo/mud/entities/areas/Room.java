package com.solo.mud.entities.areas;

import com.solo.mud.entities.containers.Container;
import com.solo.mud.entities.creatures.Creature;
import com.solo.mud.entities.items.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Room {

    private final String access; // directions from which the room can be accessed eg "ne" or "nsew" or "w"
    private final Item key;
    private final List<Creature> creatures = new ArrayList<>();
    private final List<Container> containers = new ArrayList<>();

    public Room(String access, Item key) {

        this.access = access;
        this.key = key;

    }

    public Room(String access, Item key, Creature[] creatures, Container[] containers) {

        this.access = access;
        this.key = key;
        Collections.addAll(this.containers, containers);
        Collections.addAll(this.creatures, creatures);

    }

    public String getAccess() {
        return access;
    }

    public Item getKey() {
        return key;
    }

    public List<Creature> getCreatures() {
        return creatures;
    }

    public List<Container> getContainers() {
        return containers;
    }
}
