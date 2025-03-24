class Noodles {
    String brand;
    String flavor;
    int weight; // Weight in grams

    // No-argument constructor (using reference variable)
    Noodles() {
        brand = "Maggi";
        flavor = "Masala";
        weight = 70; // Default weight in grams
    }

    // Parameterized constructor (initialize variables inside constructor)
    Noodles(String brand, String flavor, int weight) {
        this.brand = brand;
        this.flavor = flavor;
        this.weight = weight;
    }

    // To print object details
    void displayDetails() {
        System.out.println("Noodles [Brand: " + brand + ", Flavor: " + flavor + ", Weight: " + weight + " grams]");
    }
}