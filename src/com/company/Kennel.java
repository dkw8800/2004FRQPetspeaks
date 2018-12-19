package com.company;

import java.util.ArrayList;

public class Kennel {
    private ArrayList petList;

    public void allSpeak()
    {
        for(int i = 0; i < petList.size();i++)
        {
            petList.get(i).speak();
        }
    }

}
