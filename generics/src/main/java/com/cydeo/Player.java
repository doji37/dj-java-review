package com.cydeo;

// Why abstract class?
// There will be classes that extend this class
public abstract class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
