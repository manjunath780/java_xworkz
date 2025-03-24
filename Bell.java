class Bell {
    String material;
    String color;
    String sound; // Sound description

    // No-argument constructor
    Bell() {
        material = "Brass";
        color = "Gold";
        sound = "Ding"; // Default sound
    }

    // Parameterized constructor
    Bell(String material, String color, String sound) {
        this.material = material;
        this.color = color;
        this.sound = sound;
    }

    // To print object details
    void displayDetails() {
        System.out.println("Bell [Material: " + material + ", Color: " + color + ", Sound: " + sound + "]");
    }
}
