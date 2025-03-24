

class Stove {
    String brand;
    int burnerCount;
    String fuelType;

    
    Stove() {
        brand = "Samsung";
        burnerCount = 4;
        fuelType = "Gas";
    }

    
    Stove(String brand, int burnerCount, String fuelType) {
        this.brand = brand;
        this.burnerCount = burnerCount;
        this.fuelType = fuelType;
    }

    
    void displayDetails() {
        System.out.println("Stove [Brand: " + brand + ", Burner Count: " + burnerCount + ", Fuel Type: " + fuelType + "]");
    }
}
