package com.solo.mud.entities.items;

public class Item {

    private int id;
    private String name;
    private String description;
    private float weight;
    private float value;

    public Item(int id, String name, String description, float weight, float value) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.value = value;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
