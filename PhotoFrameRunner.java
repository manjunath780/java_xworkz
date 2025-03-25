public class PhotoFrameRunner {
    public static void main(String[] args) {
        PhotoFrame frame1 = new PhotoFrame("Wood", "Brown", 10);
        PhotoFrame frame2 = new PhotoFrame("Metal", "Silver", 12);
        PhotoFrame frame3 = new PhotoFrame("Plastic", "Black", 8);
        PhotoFrame frame4 = new PhotoFrame("Wood", "White", 6);
        PhotoFrame frame5 = new PhotoFrame("Glass", "Clear", 14);
        PhotoFrame frame6 = new PhotoFrame("Metal", "Gold", 16);
        PhotoFrame frame7 = new PhotoFrame("Wood", "Dark Brown", 18);
        
        frame1.display();
        frame2.display();
        frame3.display();
        frame4.display();
        frame5.display();
        frame6.display();
        frame7.display();
    }
}
