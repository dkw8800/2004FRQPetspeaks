package com.company;

public class Cat extends Pet {
    public String sound = "meow";

    public Cat(String name)
    {
        super(name);
    }

    public String speak()
    {
        return this.sound;
    }
}
