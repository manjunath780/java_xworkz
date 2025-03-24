class ColdDrink {
    String brand;
    String flavor;
    int volume; // Volume in milliliters

    // No-argument constructor (using reference variable)
    ColdDrink() {
        brand = "Coca-Cola";
        flavor = "Cola";
        volume = 500; // Default volume in milliliters
    }

    // Parameterized constructor (initialize variables inside constructor)
    ColdDrink(String brand, String flavor, int volume) {
        this.brand = brand;
        this.flavor = flavor;
        this.volume = volume;
    }

    // To print object details
    void displayDetails() {
        System.out.println("ColdDrink [Brand: " + brand + ", Flavor: " + flavor + ", Volume: " + volume + " ml]");
    }
}
