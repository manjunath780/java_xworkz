
class TubeLight {
    String brand;
    int length; // Length in centimeters
    int wattage; // Wattage in watts

    // No-argument constructor (using reference variable)
    TubeLight() {
        brand = "Philips";
        length = 120; // Default length in centimeters
        wattage = 18; // Default wattage
    }

    // Parameterized constructor (initialize variables inside constructor)
    TubeLight(String brand, int length, int wattage) {
        this.brand = brand;
        this.length = length;
        this.wattage = wattage;
    }

    // To print object details
    void displayDetails() {
        System.out.println("TubeLight [Brand: " + brand + ", Length: " + length + " cm, Wattage: " + wattage + "W]");
    }
}