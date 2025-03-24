public class NoodlesRunner {
    public static void main(String[] args) {
        // Creating instances using no-argument constructor
        Noodles noodles1 = new Noodles(); // Default values
        Noodles noodles2 = new Noodles(); // Default values
        noodles2.brand = "Top Ramen";
        noodles2.flavor = "Chicken";
        noodles2.weight = 80; // Custom values

        Noodles noodles3 = new Noodles(); // Default values
        noodles3.brand = "Maggi";
        noodles3.flavor = "Masala";
        noodles3.weight = 70; // Custom values

        // Creating instances using parameterized constructor
        Noodles noodles4 = new Noodles("Yippee", "Classic", 90); // Custom values
        Noodles noodles5 = new Noodles("Knorr", "Chicken", 85); // Custom values
        Noodles noodles6 = new Noodles("Indomie", "Curry", 100); // Custom values
        Noodles noodles7 = new Noodles("Patanjali", "Aloo", 75); // Custom values

        // Displaying details of all instances
        System.out.println("Noodles Instances:");
        noodles1.displayDetails();
        noodles2.displayDetails();
        noodles3.displayDetails();
        noodles4.displayDetails();
        noodles5.displayDetails();
        noodles6.displayDetails();
        noodles7.displayDetails();
    }
}
