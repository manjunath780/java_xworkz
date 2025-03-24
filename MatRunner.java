public class MatRunner {
    public static void main(String[] args) {
        // Creating instances using no-argument constructor
        Mat mat1 = new Mat(); // Default values
        Mat mat2 = new Mat(); // Default values
        mat2.material = "Wool";
        mat2.color = "Blue";
        mat2.length = 100.0;
        mat2.width = 150.0;

        Mat mat3 = new Mat(); // Default values
        mat3.material = "Cotton";
        mat3.color = "Grey";
        mat3.length = 120.0;
        mat3.width = 180.0;

        // Creating instances using parameterized constructor
        Mat mat4 = new Mat("Jute", "Beige", 80.0, 120.0);
        Mat mat5 = new Mat("Sisal", "Green", 90.0, 140.0);
        Mat mat6 = new Mat("Rubber", "Black", 110.0, 160.0);
        Mat mat7 = new Mat("Polyester", "Red", 95.0, 125.0);

        // Displaying details of all instances
        System.out.println("Mat Instances:");
        mat1.displayDetails();
        mat2.displayDetails();
        mat3.displayDetails();
        mat4.displayDetails();
        mat5.displayDetails();
        mat6.displayDetails();
        mat7.displayDetails();
    }
}