package org.nix;

public class Animals {

    class Dog extends Abstraction {
        public Dog(String name, int age, String breed, String color, String specialTrait, String owner) {
            super(name, age, breed, color, specialTrait, owner);
        }
        @Override
        public void speak() {
            System.out.printf("%s barks!%n", getName());
        }
        @Override
        public void eat() {
            System.out.printf("%s eats!%n", getName());
        }
        @Override
        public void sleep() {
            System.out.printf("%s sleeps!%n", getName());
        }
        @Override
        public void play() {
            System.out.printf("%s plays!%n", getName());
        }
        @Override
        public void showInfo() {
            System.out.printf("""

                    Name: %s
                    Age: %s
                    Breed: %s
                    Color: %s
                    Special Traits: %s
                    Owner: %s
                    %n""", getName(), getAge(), getBreed(), getColor(), getSpecialTrait(), getOwner());
        }
    }

    class Cat extends Abstraction {
        public Cat(String name, int age, String breed, String color, String specialTrait, String owner) {
            super(name, age, breed, color, specialTrait, owner);
        }
        @Override
        public void speak() {
            System.out.printf("%s meows!%n", getName());
        }
        @Override
        public void eat() {
            System.out.printf("%s eats!%n", getName());
        }
        @Override
        public void sleep() {
            System.out.printf("%s sleeps!%n", getName());
        }
        @Override
        public void play() {
            System.out.printf("%s plays!%n", getName());
        }
        @Override
        public void showInfo() {
            System.out.printf("""

                    Name: %s
                    Age: %s
                    Breed: %s
                    Color: %s
                    Special Traits: %s
                    Owner: %s
                    %n""", getName(), getAge(), getBreed(), getColor(), getSpecialTrait(), getOwner());
        }
    }
}
