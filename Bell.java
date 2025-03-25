class Bell {
    String material;
    String color;
    double weight;

    Bell(String material, String color, double weight) {
        this.material = material;
        this.color = color;
        this.weight = weight;
    }

    void display() {
        System.out.println("Material: " + material + ", Color: " + color + ", Weight: " + weight + "kg");
    }

    
}
