public class BellRunner {
    public static void main(String[] args) {
        Bell bell1 = new Bell("Brass", "Golden", 0.5);
        Bell bell2 = new Bell("Steel", "Silver", 0.3);
        Bell bell3 = new Bell("Copper", "Brown", 0.4);
        Bell bell4 = new Bell("Bronze", "Copper", 0.6);
        Bell bell5 = new Bell("Aluminum", "Gray", 0.2);
        Bell bell6 = new Bell("Iron", "Black", 0.7);
        Bell bell7 = new Bell("Gold", "Yellow", 0.8);
        
        bell1.display();
        bell2.display();
        bell3.display();
        bell4.display();
        bell5.display();
        bell6.display();
        bell7.display();
    }
}