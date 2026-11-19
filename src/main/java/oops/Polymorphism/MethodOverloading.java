package oops.Polymorphism;

//When multiple methods have the same name but different parameters within a class, it is called method overloading.
class Calculator {

    // Method 1
    int add(int a, int b) {
        return a + b;
    }

    // Method 2
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3
    double add(double a, double b) {
        return a + b;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.add(10, 20));

        System.out.println(c.add(10, 20, 30));

        System.out.println(c.add(10.5, 20.5));
    }
}
