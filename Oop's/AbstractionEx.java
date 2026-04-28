// Abstract class
abstract class Payment {

    // abstract method
    abstract void pay(double amount);
}

// UPI payment
class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid Rs " + amount + " using UPI");
    }
}

// Card payment
class CardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid Rs " + amount + " using Card");
    }
}

// Cash on Delivery
class CashOnDelivery extends Payment {
    void pay(double amount) {
        System.out.println("Pay Rs " + amount + " at delivery");
    }
}

// Main class
public class AbstractionEx {
    public static void main(String[] args) {

        // Abstraction: parent reference
        Payment p;

        // choose payment type
        p = new UPIPayment();
        p.pay(500);

        p = new CardPayment();
        p.pay(1000);

        p = new CashOnDelivery();
        p.pay(300);
    }
}