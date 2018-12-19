package com.company;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Cat");
        Dog dog = new Dog("Dog");
        LoudDog louddog = new LoudDog("LoudDog");

        System.out.println(cat.speak());
        System.out.println(dog.speak());
        System.out.println(louddog.speak());
        new Kennel(Cat, Dog, LoudDog).allSpeak();
    }
}
