class Cosmetic {
    String brand;
    String productType;
    double price; // Price in USD

    // No-argument constructor (using reference variable)
    Cosmetic() {
        brand = "Maybelline";
        productType = "Lipstick";
        price = 15.0; // Default price in USD
    }

    // Parameterized constructor (initialize variables inside constructor)
    Cosmetic(String brand, String productType, double price) {
        this.brand = brand;
        this.productType = productType;
        this.price = price;
    }

    // To print object details
    void displayDetails() {
        System.out.println("Cosmetic [Brand: " + brand + ", Product Type: " + productType + ", Price: $" + price + "]");
    }
}