/**
 * Task 2 – OOP in Java: Animal Inheritance Example
 * Demonstrates Inheritance, Polymorphism, and Method Overriding.
 */

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " barks");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " meows ");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal a1 = new Dog("Tommy");
        Animal a2 = new Cat("Kitty");

        System.out.println("=== Animal Sounds ===");
        a1.makeSound();
        a2.makeSound();
    }
}
