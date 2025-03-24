class Chain {
    String material;
    String type;
    double length; 

    
    Chain() {
        material = "Gold";
        type = "Necklace";
        length = 45.0; 
    }

    
    Chain(String material, String type, double length) {
        this.material = material;
        this.type = type;
        this.length = length;
    }

    
    void displayDetails() {
        System.out.println("Chain [Material: " + material + ", Type: " + type + ", Length: " + length + " cm]");
    }
}
