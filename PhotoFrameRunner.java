public class PhotoFrameRunner {
    public static void main(String[] args) {
        // Creating instances using no-argument constructor
        PhotoFrame frame1 = new PhotoFrame(); // Default values
        PhotoFrame frame2 = new PhotoFrame(); // Default values
        frame2.material = "Plastic";
        frame2.color = "Black";
        frame2.size = "5x7";

        PhotoFrame frame3 = new PhotoFrame(); // Default values
        frame3.material = "Wood";
        frame3.color = "Brown";
        frame3.size = "8x10";

        // Creating instances using parameterized constructor
        PhotoFrame frame4 = new PhotoFrame("Metal", "Silver", "4x6");
        PhotoFrame frame5 = new PhotoFrame("Glass", "Clear", "10x12");
        PhotoFrame frame6 = new PhotoFrame("Wood", "Cherry", "5x7");
        PhotoFrame frame7 = new PhotoFrame("Acrylic", "White", "6x8");

        // Displaying details of all instances
        System.out.println("Photo Frame Instances:");
        frame1.displayDetails();
        frame2.displayDetails();
        frame3.displayDetails();
        frame4.displayDetails();
        frame5.displayDetails();
        frame6.displayDetails();
        frame7.displayDetails();
    }
}
