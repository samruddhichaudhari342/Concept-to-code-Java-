// Parent class
class Ride {
    void calculateFare() {
        System.out.println("Calculating fare...");
    }
}

// Child class 1
class BikeRide extends Ride {
    @Override
    void calculateFare() {
        System.out.println("Bike Fare: Rs 50");
    }
}

// Child class 2
class AutoRide extends Ride {
    @Override
    void calculateFare() {
        System.out.println("Auto Fare: Rs 100");
    }
}

// Child class 3
class CarRide extends Ride {
    @Override
    void calculateFare() {
        System.out.println("Car Fare: Rs 200");
    }
}

// Main class
public class PolymorphismEx {
    public static void main(String[] args) {

        Ride r;

        // Runtime Polymorphism
        r = new BikeRide();
        r.calculateFare();

        r = new AutoRide();
        r.calculateFare();

        r = new CarRide();
        r.calculateFare();
    }
}