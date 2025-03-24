class Mat {
    String material;
    String color;
    double length; // Length in centimeters
    double width;  // Width in centimeters

    // No-argument constructor
    Mat() {
        material = "Cotton";
        color = "Beige";
        length = 60.0; // Default length in centimeters
        width = 40.0;  // Default width in centimeters
    }

    // Parameterized constructor
    Mat(String material, String color, double length, double width) {
        this.material = material;
        this.color = color;
        this.length = length;
        this.width = width;
    }

    // To print object details
    void displayDetails() {
        System.out.println("Mat [Material: " + material + ", Color: " + color + ", Dimensions: " + length + "x" + width + " cm]");
    }
}
5. Vase Class:
java
Copy
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
