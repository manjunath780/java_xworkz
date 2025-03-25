class CarryBag {
    String material;
    String color;
    double capacity;

    CarryBag(String material, String color, double capacity) {
        this.material = material;
        this.color = color;
        this.capacity = capacity;
    }

    void display() {
        System.out.println("Material: " + material + ", Color: " + color + ", Capacity: " + capacity + " liters");
    }

   
}
