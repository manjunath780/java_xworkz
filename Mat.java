class Mat {
    String material;
    String color;
    double length; 
    double width;  

    
    Mat() {
        material = "Cotton";
        color = "Beige";
        length = 60.0; 
        width = 40.0; 
    }

    // Parameterized constructor
    Mat(String material, String color, double length, double width) {
        this.material = material;
        this.color = color;
        this.length = length;
        this.width = width;
    }

    
    void displayDetails() {
        System.out.println("Mat [Material: " + material + ", Color: " + color + ", Dimensions: " + length + "x" + width + " cm]");
    }
}


