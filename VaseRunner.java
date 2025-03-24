public class VaseRunner {
    public static void main(String[] args) {
        // Creating instances using no-argument constructor
        Vase vase1 = new Vase(); // Default values
        
        Vase vase2 = new Vase(); // Default values
        vase2.material = "Glass";
        vase2.color = "Blue";
        vase2.height = 35.0;

        Vase vase3 = new Vase(); // Default values
        vase3.material = "Ceramic";
        vase3.color = "White";
        vase3.height = 30.0;

        // Creating instances using parameterized constructor
        Vase vase4 = new Vase("Porcelain", "Green", 40.0);
        Vase vase5 = new Vase("Clay", "Brown", 50.0);
        Vase vase6 = new Vase("Glass", "Clear", 20.0);
        Vase vase7 = new Vase("Metal", "Silver", 25.0);

        // Displaying details of all instances
        System.out.println("Vase Instances:");
        vase1.displayDetails();
        vase2.displayDetails();
        vase3.displayDetails();
        vase4.displayDetails();
        vase5.displayDetails();
        vase6.displayDetails();
        vase7.displayDetails();
    }
}