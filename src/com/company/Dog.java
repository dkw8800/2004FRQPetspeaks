package com.company;

public class Dog extends Pet {
    public String sound = "woof";
    public Dog(String name)
    {
        super(name);
    }

    public String speak()
    {
        return this.sound;
    }
}
