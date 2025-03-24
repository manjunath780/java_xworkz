public class ChainRunner {
    public static void main(String[] args) {
        
        Chain chain1 = new Chain(); 
        Chain chain2 = new Chain(); 
        chain2.material = "Silver";
        chain2.type = "Necklace";
        chain2.length = 45.0;

        Chain chain3 = new Chain(); 
        chain3.material = "Gold";
        chain3.type = "Bracelet";
        chain3.length = 50.0;

        
        Chain chain4 = new Chain("Platinum", "Anklet", 30.0);
        Chain chain5 = new Chain("Leather", "Belt", 120.0);
        Chain chain6 = new Chain("Silver", "Choker", 20.0);
        Chain chain7 = new Chain("Titanium", "Pendant", 60.0);

        
        System.out.println("Chain Instances:");
        chain1.displayDetails();
        chain2.displayDetails();
        chain3.displayDetails();
        chain4.displayDetails();
        chain5.displayDetails();
        chain6.displayDetails();
        chain7.displayDetails();
    }
}
