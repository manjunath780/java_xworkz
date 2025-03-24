public class ShampooRunner {
    public static void main(String[] args) {
        // Creating instances using no-argument constructor
        Shampoo shampoo1 = new Shampoo(); // Default values
        Shampoo shampoo2 = new Shampoo(); // Default values
        shampoo2.brand = "Pantene";
        shampoo2.scent = "Coconut";
        shampoo2.volume = 400;

        Shampoo shampoo3 = new Shampoo(); // Default values
        shampoo3.brand = "Dove";
        shampoo3.scent = "Lavender";
        shampoo3.volume = 300;

        // Creating instances using parameterized constructor
        Shampoo shampoo4 = new Shampoo("Herbal Essences", "Rose", 500);
        Shampoo shampoo5 = new Shampoo("Head & Shoulders", "Apple", 350);
        Shampoo shampoo6 = new Shampoo("Sunsilk", "Citrus", 250);
        Shampoo shampoo7 = new Shampoo("Tresemme", "Coconut Milk", 750);

        // Displaying details of all instances
        System.out.println("Shampoo Instances:");
        shampoo1.displayDetails();
        shampoo2.displayDetails();
        shampoo3.displayDetails();
        shampoo4.displayDetails();
        shampoo5.displayDetails();
        shampoo6.displayDetails();
        shampoo7.displayDetails();
    }
}
