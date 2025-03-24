

class Stove {
    String brand;
    int burnerCount;
    String fuelType;

    // No-argument constructor (using reference variable)
    Stove() {
        brand = "Samsung";
        burnerCount = 4;
        fuelType = "Gas";
    }

    // Parameterized constructor (initialize variables inside constructor)
    Stove(String brand, int burnerCount, String fuelType) {
        this.brand = brand;
        this.burnerCount = burnerCount;
        this.fuelType = fuelType;
    }

    // To print object details
    void displayDetails() {
        System.out.println("Stove [Brand: " + brand + ", Burner Count: " + burnerCount + ", Fuel Type: " + fuelType + "]");
    }
}