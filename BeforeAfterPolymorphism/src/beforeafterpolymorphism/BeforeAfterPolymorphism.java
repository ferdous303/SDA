/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beforeafterpolymorphism;

/**
 *
 * @author XPS
 */
public class BeforeAfterPolymorphism {

    public static void main(String[] args) {
        System.out.println("=== Before Polymorphism ===");
        beforePolymorphism();

        System.out.println("\n=== After Polymorphism ===");
        afterPolymorphism();
    }

    // Before Polymorphism
    static void beforePolymorphism() {
        Cat cat = new Cat();
        Dog dog = new Dog();

        makeAnimalSound(cat);
        makeAnimalSound(dog);
    }

    static void makeAnimalSound(Object animal) {
        if (animal instanceof Cat) {
            ((Cat) animal).meow();
        } else if (animal instanceof Dog) {
            ((Dog) animal).bark();
        } else {
            System.out.println("Unknown animal sound");
        }
    }

    // After Polymorphism
    static void afterPolymorphism() {
        Animal[] animals = new Animal[2];
        animals[0] = new Cate();  // Cat is an Animal
        animals[1] = new Doge();  // Dog is an Animal

        for (Animal a : animals) {
            a.sound();  // Polymorphically calls the correct method
        }
    }
}

// Classes for Before Polymorphism
class Cat {
    void meow() {
        System.out.println("Cat says MEOW");
    }
}

class Dog {
    void bark() {
        System.out.println("Dog says BARK");
    }
}

// Classes for After Polymorphism
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cate extends Animal {
    @Override
    void sound() {
        System.out.println("Cat says MEOW");
    }
}

class Doge extends Animal {
    @Override
    void sound() {
        System.out.println("Dog says BARK");
    }
}

