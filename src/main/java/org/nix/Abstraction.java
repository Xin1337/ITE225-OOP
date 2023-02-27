package org.nix;

abstract class Abstraction {
    private String name;
    private int age;
    private String breed;
    private String color;
    private String specialTrait;
    private String owner;

    abstract void speak();
    abstract void eat();
    abstract void sleep();
    abstract void play();
    abstract void showInfo();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public String getSpecialTrait() {
        return specialTrait;
    }

    public String getOwner() {
        return owner;
    }

    public Abstraction(String name, int age, String breed, String color, String specialTrait, String owner) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.specialTrait = specialTrait;
        this.owner = owner;
    }
}