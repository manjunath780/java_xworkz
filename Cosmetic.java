class Cosmetic {
    String productType;
    String brand;
    double price;

    Cosmetic(String productType, String brand, double price) {
        this.productType = productType;
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println("Product Type: " + productType + ", Brand: " + brand + ", Price: Rs " + price);
    }

    
}
