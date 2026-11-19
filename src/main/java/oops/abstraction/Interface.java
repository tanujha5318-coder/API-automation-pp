package oops.abstraction;
//An interface is a contract that defines behaviours a class agrees to implement.We use the
// interface keyword to create an interface and implements to use it in a class.
// Interface
interface Payment {

    void pay(double amount);
}

// Class 1
class CreditCard implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println(
                "Paid " + amount + " using Credit Card");
    }
}

// Class 2
class UPI implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println(
                "Paid " + amount + " using UPI");
    }
}
public class Interface {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCard();
        p.pay(5000);

        p = new UPI();
        p.pay(2000);
    }
}
