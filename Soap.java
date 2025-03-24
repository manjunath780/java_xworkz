class Soap {
    String brand;
    String scent;
    int weight; // weight in grams

    // No-argument constructor (using reference variable)
    Soap() {
        brand = "Dove";
        scent = "Lavender";
        weight = 100; // Default weight in grams
    }

    // Parameterized constructor (initialize variables inside constructor)
    Soap(String brand, String scent, int weight) {
        this.brand = brand;
        this.scent = scent;
        this.weight = weight;
    }

    // To print object details
    void displayDetails() {
        System.out.println("Soap [Brand: " + brand + ", Scent: " + scent + ", Weight: " + weight + " grams]");
    }

}

