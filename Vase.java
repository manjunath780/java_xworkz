class Vase {
    String material;
    String color;
    double height; // Height in centimeters

    // No-argument constructor
    Vase() {
        material = "Ceramic";
        color = "White";
        height = 30.0; // Default height in centimeters
    }

    // Parameterized constructor
    Vase(String material, String color, double height) {
        this.material = material;
        this.color = color;
        this.height = height;
    }

    // To print object details
    void displayDetails() {
        System.out.println("Vase [Material: " + material + ", Color: " + color + ", Height: " + height + " cm]");
    }
}
