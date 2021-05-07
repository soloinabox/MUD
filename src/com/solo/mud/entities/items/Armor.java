package com.solo.mud.entities.items;

public class Armor extends Item {

    private float protection;
    private ArmorClass armorClass;

    public Armor(int id, String name, String description, float weight, float value, float protection, ArmorClass armorClass) {
        super(id, name, description, weight, value);
        this.protection = protection;
        this.armorClass = armorClass;
    }

    public float getProtection() {
        return protection;
    }

    public void setProtection(float protection) {
        this.protection = protection;
    }

    public ArmorClass getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(ArmorClass armorClass) {
        this.armorClass = armorClass;
    }
}
