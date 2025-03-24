class CarryBag {
    String material;
    String size;
    double price; 

    
    CarryBag() {
        material = "Plastic";
        size = "Medium";
        price = 2.0; 
    }

    
    CarryBag(String material, String size, double price) {
        this.material = material;
        this.size = size;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("CarryBag [Material: " + material + ", Size: " + size + ", Price: $" + price + "]");
    }
}
