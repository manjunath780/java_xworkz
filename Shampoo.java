class Shampoo {
    String brand;
    String scent;
    int volume; // Volume in milliliters

    // No-argument constructor
    Shampoo() {
        brand = "Head & Shoulders";
        scent = "Apple";
        volume = 250; // Default volume in milliliters
    }

    // Parameterized constructor
    Shampoo(String brand, String scent, int volume) {
        this.brand = brand;
        this.scent = scent;
        this.volume = volume;
    }

    // To print object details
    void displayDetails() {
        System.out.println("Shampoo [Brand: " + brand + ", Scent: " + scent + ", Volume: " + volume + " ml]");
    }
}