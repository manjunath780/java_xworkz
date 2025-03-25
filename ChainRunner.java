public class ChainRunner {
    public static void main(String[] args) {
        Chain chain1 = new Chain("Gold", 45.0, 50.0);
        Chain chain2 = new Chain("Silver", 60.0, 40.0);
        Chain chain3 = new Chain("Platinum", 50.0, 55.0);
        Chain chain4 = new Chain("Steel", 40.0, 45.0);
        Chain chain5 = new Chain("Titanium", 35.0, 60.0);
        Chain chain6 = new Chain("Copper", 55.0, 30.0);
        Chain chain7 = new Chain("Iron", 70.0, 70.0);
        
        chain1.display();
        chain2.display();
        chain3.display();
        chain4.display();
        chain5.display();
        chain6.display();
        chain7.display();
    }
}