// Parent class
class Country {
    String countryName = "India";
    String countryCode = "IND";

    // Method to display country info
    void displayCountry() {
        System.out.println("Country: " + countryName);
        System.out.println("Code: " + countryCode);
    }
}

// Child class (inherits Country)
class State extends Country {
    String stateName = "Maharashtra";
    String capital = "Mumbai";

    // Method to display state info
    void displayState() {
        System.out.println("State: " + stateName);
        System.out.println("Capital: " + capital);
    }
}

// Child of State (multi-level inheritance)
class City extends State {
    String cityName = "Pune";
    int pincode = 411001;

    // Method to display city info
    void displayCity() {
        System.out.println("City: " + cityName);
        System.out.println("Pincode: " + pincode);
    }
}

public class CountryStateCity {
    public static void main(String[] args) {

        // Creating object of City
        City c = new City();

        // Calling methods
        // City object can access ALL methods (Country + State + City)
        c.displayCountry();  // from Country class
        c.displayState();    // from State class
        c.displayCity();     // from City class
    }
}
