package oops.Polymorphism;

//When a child class provides its own implementation of a method already defined in the parent class, it is called method overriding.

// Parent class
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

// Child class 1
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}
