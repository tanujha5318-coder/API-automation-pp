package oops.abstraction;

//An abstract class is a class declared with the abstract keyword.
// Abstract parent class
abstract class Bank {

    // Abstract method
    abstract void interestRate();

    // Concrete method
    void bankDetails() {
        System.out.println("Welcome to the bank");
    }
}

// Child class
class SBI extends Bank {

    @Override
    void interestRate() {
        System.out.println("SBI interest rate is 7%");
    }
}
// Another child class
class HDFC extends Bank {

    @Override
    void interestRate() {
        System.out.println("HDFC interest rate is 8%");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Bank b = new SBI();

        b.bankDetails();
        b.interestRate();

        Bank b2 = new HDFC();
        b2.interestRate();
    }
}
