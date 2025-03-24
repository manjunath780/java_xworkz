class Chain {
    String material;
    String type;
    double length; // Length in centimeters

    // No-argument constructor
    Chain() {
        material = "Gold";
        type = "Necklace";
        length = 45.0; // Default length in centimeters
    }

    // Parameterized constructor
    Chain(String material, String type, double length) {
        this.material = material;
        this.type = type;
        this.length = length;
    }

    // To print object details
    void displayDetails() {
        System.out.println("Chain [Material: " + material + ", Type: " + type + ", Length: " + length + " cm]");
    }
}