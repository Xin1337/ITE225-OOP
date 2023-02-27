package org.nix;

public class Main {
    public static void main(String[] args) {
        Animals animals = new Animals();
        Animals.Dog dog = animals.new Dog("Rex", 3, "German Shepherd", "Black", "Loves to play fetch", "John");
        dog.speak();
        dog.eat();
        dog.sleep();
        dog.play();
        dog.showInfo();

        Animals.Cat cat = animals.new Cat("Mittens", 2, "Siamese", "White", "Loves to play with yarn", "Jane");
        cat.speak();
        cat.eat();
        cat.sleep();
        cat.play();
        cat.showInfo();

    }
}