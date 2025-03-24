public class TubeLightRunner {
    public static void main(String[] args) {
        // Creating instances using no-argument constructor
        TubeLight tubeLight1 = new TubeLight(); // Default values
        TubeLight tubeLight2 = new TubeLight(); // Default values
        tubeLight2.brand = "Osram";
        tubeLight2.length = 150; // Custom length
        tubeLight2.wattage = 20; // Custom wattage

        TubeLight tubeLight3 = new TubeLight(); // Default values
        tubeLight3.brand = "Philips";
        tubeLight3.length = 120; // Custom length
        tubeLight3.wattage = 18; // Custom wattage

        // Creating instances using parameterized constructor
        TubeLight tubeLight4 = new TubeLight("Halonix", 180, 24); // Custom values
        TubeLight tubeLight5 = new TubeLight("Crompton", 150, 22); // Custom values
        TubeLight tubeLight6 = new TubeLight("Bajaj", 120, 15); // Custom values
        TubeLight tubeLight7 = new TubeLight("Havells", 150, 25); // Custom values

        // Displaying details of all instances
        System.out.println("TubeLight Instances:");
        tubeLight1.displayDetails();
        tubeLight2.displayDetails();
        tubeLight3.displayDetails();
        tubeLight4.displayDetails();
        tubeLight5.displayDetails();
        tubeLight6.displayDetails();
        tubeLight7.displayDetails();
    }
}
