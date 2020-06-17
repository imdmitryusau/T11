package com.company;

public class Item {
    private String id, name;

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void Show() //show() method, which prints the item name on the console
    {
        System.out.println(name);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
