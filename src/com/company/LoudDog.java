package com.company;

public class LoudDog extends Dog {
    public LoudDog(String name)
    {
        super(name);
    }

    public String speak()
    {
        return this.sound + "/n" + this.sound;
    }
}
