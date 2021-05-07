package com.solo.mud.entities.creatures;

import com.solo.mud.entities.items.Armor;
import com.solo.mud.entities.items.Item;
import com.solo.mud.entities.items.Weapon;

import java.util.List;

public class Creature {

    private int health;
    private Weapon weapon;
    private Armor armor;
    private List<Item> inventory;

    public Creature(int health, Weapon weapon, Armor armor, List<Item> inventory) {
        this.health = health;
        this.weapon = weapon;
        this.armor = armor;
        this.inventory = inventory;
    }

    public Creature(int health) {
        this.health = health;
    }

    public Creature(int health, List<Item> inventory) {
        this.health = health;
        this.inventory = inventory;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
}
