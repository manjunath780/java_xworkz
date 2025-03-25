class Mat {
    String material;
    String color;
    double size;

    Mat(String material, String color, double size) {
        this.material = material;
        this.color = color;
        this.size = size;
    }

    void display() {
        System.out.println("Material: " + material + ", Color: " + color + ", Size: " + size + " sq.m");
    }

    
}
