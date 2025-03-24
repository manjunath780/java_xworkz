public class CarryBagRunner {
    public static void main(String[] args) {
        // Creating instances using no-argument constructor
        CarryBag carryBag1 = new CarryBag(); // Default values
        CarryBag carryBag2 = new CarryBag(); // Default values
        carryBag2.material = "Jute";
        carryBag2.size = "Large";
        carryBag2.price = 5.0; // Custom values

        CarryBag carryBag3 = new CarryBag(); // Default values
        carryBag3.material = "Cotton";
        carryBag3.size = "Medium";
        carryBag3.price = 3.0; // Custom values

        // Creating instances using parameterized constructor
        CarryBag carryBag4 = new CarryBag("Plastic", "Small", 2.0); // Custom values
        CarryBag carryBag5 = new CarryBag("Canvas", "Large", 6.0); // Custom values
        CarryBag carryBag6 = new CarryBag("Paper", "Medium", 4.0); // Custom values
        CarryBag carryBag7 = new CarryBag("Recycled Material", "Large", 7.0); // Custom values

        // Displaying details of all instances
        System.out.println("CarryBag Instances:");
        carryBag1.displayDetails();
        carryBag2.displayDetails();
        carryBag3.displayDetails();
        carryBag4.displayDetails();
        carryBag5.displayDetails();
        carryBag6.displayDetails();
        carryBag7.displayDetails();
    }
}
