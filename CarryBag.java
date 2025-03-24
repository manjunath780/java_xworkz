class CarryBag {
    String material;
    String size; // Size (e.g., small, medium, large)
    double price; // Price in USD

    // No-argument constructor (using reference variable)
    CarryBag() {
        material = "Plastic";
        size = "Medium";
        price = 2.0; // Default price in USD
    }

    // Parameterized constructor (initialize variables inside constructor)
    CarryBag(String material, String size, double price) {
        this.material = material;
        this.size = size;
        this.price = price;
    }

    // To print object details
    void displayDetails() {
        System.out.println("CarryBag [Material: " + material + ", Size: " + size + ", Price: $" + price + "]");
    }
}
