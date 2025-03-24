class PhotoFrame {
    String material;
    String color;
    String size; // Size in inches (e.g., 4x6, 8x10)

    // No-argument constructor
    PhotoFrame() {
        material = "Wood";
        color = "Brown";
        size = "4x6"; // Default size
    }

    // Parameterized constructor
    PhotoFrame(String material, String color, String size) {
        this.material = material;
        this.color = color;
        this.size = size;
    }

    // To print object details
    void displayDetails() {
        System.out.println("PhotoFrame [Material: " + material + ", Color: " + color + ", Size: " + size + "]");
    }
}
