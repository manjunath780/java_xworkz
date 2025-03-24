

public class StoveRunner {

    public static void main(String[] args) {
     

        // Stove class instances using no-argument constructor
        Stove stove1 = new Stove();

        Stove stove2 = new Stove();
       stove2.brand = "Panasonic";
        stove2.burnerCount = 4;
        stove2.fuelType = "Induction";

        Stove stove3 = new Stove();
        stove3.brand = "Prestige";
        stove3.burnerCount = 5;
        stove3.fuelType = "Gas";

        Stove stove4 = new Stove("LG", 2, "Electric");
        Stove stove5 = new Stove("Whirlpool", 6, "Gas");
        Stove stove6 = new Stove("Bosch", 5, "Induction");
        Stove stove7 = new Stove("GE", 4, "Dual Fuel");

    

        System.out.println("\nStove Instances:");
        stove1.displayDetails();
        stove2.displayDetails();
        stove3.displayDetails();
        stove4.displayDetails();
        stove5.displayDetails();
        stove6.displayDetails();
        stove7.displayDetails();
    }
}
    

