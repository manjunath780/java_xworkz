public class BellRunner {
    public static void main(String[] args) {
        // Creating instances using no-argument constructor
        Bell bell1 = new Bell(); // Default values
        Bell bell2 = new Bell(); // Default values
        bell2.material = "Brass";
        bell2.color = "Silver";
        bell2.sound = "Ding Dong";

        Bell bell3 = new Bell(); // Default values
        bell3.material = "Copper";
        bell3.color = "Gold";
        bell3.sound = "Chime";

        // Creating instances using parameterized constructor
        Bell bell4 = new Bell("Bronze", "Copper", "Ting");
        Bell bell5 = new Bell("Silver", "Black", "Ding");
        Bell bell6 = new Bell("Steel", "Gray", "Bong");
        Bell bell7 = new Bell("Iron", "Brown", "Ring");

        // Displaying details of all instances
        System.out.println("Bell Instances:");
        bell1.displayDetails();
        bell2.displayDetails();
        bell3.displayDetails();
        bell4.displayDetails();
        bell5.displayDetails();
        bell6.displayDetails();
        bell7.displayDetails();
    }
}