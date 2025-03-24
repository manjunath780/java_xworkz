public class CosmeticRunner {
    public static void main(String[] args) {
        // Creating instances using no-argument constructor
        Cosmetic cosmetic1 = new Cosmetic(); // Default values
        Cosmetic cosmetic2 = new Cosmetic(); // Default values
        cosmetic2.brand = "L'Oreal";
        cosmetic2.productType = "Foundation";
        cosmetic2.price = 30.0; // Custom values

        Cosmetic cosmetic3 = new Cosmetic(); // Default values
        cosmetic3.brand = "MAC";
        cosmetic3.productType = "Lipstick";
        cosmetic3.price = 45.0; // Custom values

        // Creating instances using parameterized constructor
        Cosmetic cosmetic4 = new Cosmetic("Maybelline", "Mascara", 20.0); // Custom values
        Cosmetic cosmetic5 = new Cosmetic("Estée Lauder", "Perfume", 120.0); // Custom values
        Cosmetic cosmetic6 = new Cosmetic("Clinique", "Moisturizer", 55.0); // Custom values
        Cosmetic cosmetic7 = new Cosmetic("Revlon", "Blush", 18.0); // Custom values

        // Displaying details of all instances
        System.out.println("Cosmetic Instances:");
        cosmetic1.displayDetails();
        cosmetic2.displayDetails();
        cosmetic3.displayDetails();
        cosmetic4.displayDetails();
        cosmetic5.displayDetails();
        cosmetic6.displayDetails();
        cosmetic7.displayDetails();
    }
}