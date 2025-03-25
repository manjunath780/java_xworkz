public class CarryBagRunner {
    public static void main(String[] args) {
        CarryBag bag1 = new CarryBag("Cotton", "Red", 5.0);
        CarryBag bag2 = new CarryBag("Plastic", "Blue", 3.0);
        CarryBag bag3 = new CarryBag("Jute", "Green", 7.0);
        CarryBag bag4 = new CarryBag("Nylon", "Yellow", 10.0);
        CarryBag bag5 = new CarryBag("Leather", "Brown", 2.5);
        CarryBag bag6 = new CarryBag("Canvas", "Black", 4.5);
        CarryBag bag7 = new CarryBag("Wool", "White", 8.0);
        
        bag1.display();
        bag2.display();
        bag3.display();
        bag4.display();
        bag5.display();
        bag6.display();
        bag7.display();
    }
}
