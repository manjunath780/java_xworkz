class Bell {
    String material;
    String color;
    String sound; 

    
    Bell() {
        material = "Brass";
        color = "Gold";
        sound = "Ding"; 
    }

    
    Bell(String material, String color, String sound) {
        this.material = material;
        this.color = color;
        this.sound = sound;
    }

    
    void displayDetails() {
        System.out.println("Bell [Material: " + material + ", Color: " + color + ", Sound: " + sound + "]");
    }
}
