package com.solo.mud.entities.creatures;

import com.solo.mud.entities.items.Item;
import com.solo.mud.entities.items.Weapon;

import java.util.List;

public class HostileCreature extends Creature{

    public HostileCreature(int health, Weapon weapon, List<Item> inventory) {
        super(health, weapon, inventory);
    }

    public HostileCreature(int health) {
        super(health);
    }

    public HostileCreature(int health, List<Item> inventory) {
        super(health, inventory);
    }
}
