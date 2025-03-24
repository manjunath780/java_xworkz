class Cosmetic {
    String brand;
    String productType;
    double price; 

    
    Cosmetic() {
        brand = "Maybelline";
        productType = "Lipstick";
        price = 15.0; 
    }

    
    Cosmetic(String brand, String productType, double price) {
        this.brand = brand;
        this.productType = productType;
        this.price = price;
    }


    void displayDetails() {
        System.out.println("Cosmetic [Brand: " + brand + ", Product Type: " + productType + ", Price: $" + price + "]");
    }
}
