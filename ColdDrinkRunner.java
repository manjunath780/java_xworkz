public class ColdDrinkRunner {
    public static void main(String[] args) {
        // Creating instances using no-argument constructor
        ColdDrink coldDrink1 = new ColdDrink(); // Default values
        ColdDrink coldDrink2 = new ColdDrink(); // Default values
        coldDrink2.brand = "Pepsi";
        coldDrink2.flavor = "Lemon";
        coldDrink2.volume = 600; // Custom values

        ColdDrink coldDrink3 = new ColdDrink(); // Default values
        coldDrink3.brand = "Sprite";
        coldDrink3.flavor = "Lime";
        coldDrink3.volume = 500; // Custom values

        // Creating instances using parameterized constructor
        ColdDrink coldDrink4 = new ColdDrink("Fanta", "Orange", 750); // Custom values
        ColdDrink coldDrink5 = new ColdDrink("Coca-Cola", "Cola", 330); // Custom values
        ColdDrink coldDrink6 = new ColdDrink("7Up", "Lemon", 600); // Custom values
        ColdDrink coldDrink7 = new ColdDrink("Mountain Dew", "Citrus", 500); // Custom values

        // Displaying details of all instances
        System.out.println("ColdDrink Instances:");
        coldDrink1.displayDetails();
        coldDrink2.displayDetails();
        coldDrink3.displayDetails();
        coldDrink4.displayDetails();
        coldDrink5.displayDetails();
        coldDrink6.displayDetails();
        coldDrink7.displayDetails();
    }
}
