package oops.inheritance;

// One class inherits from another child class, forming a chain.

// Grandparent class
class Vehicle {

    void start() {
        System.out.println("Vehicle started");
    }
}

// Parent class
class Car extends Vehicle {

    void drive() {
        System.out.println("Car is driving");
    }
}

// Child class
class BMW extends Car {

    void luxury() {
        System.out.println("BMW is a luxury car");
    }
}
public class Multilevelnheritance {
    public static void main(String[] args) {
        BMW b = new BMW();
        b.start();
        b.drive();
        b.luxury();
    }
}
