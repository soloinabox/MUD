package com.solo.mud.entities.items;

public class Weapon extends Item{


    private float damage;
    private WeaponClass weaponClass;

    public Weapon(int id, String name, String description, float weight, float value, float damage, WeaponClass weaponClass) {

        super(id, name, description, weight, value);
        this.damage = damage;
        this.weaponClass = weaponClass;

    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public WeaponClass getWeaponClass() {
        return weaponClass;
    }

    public void setWeaponClass(WeaponClass weaponClass) {
        this.weaponClass = weaponClass;
    }
}
