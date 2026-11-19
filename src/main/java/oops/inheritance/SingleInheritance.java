package oops.inheritance;

//One child class inherits from one parent class.

class Animal{
    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Child class
class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
     Dog dog = new Dog();
     dog.bark();
     dog.eat();
     dog.sleep();
    }
}
