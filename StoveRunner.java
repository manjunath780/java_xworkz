

public class StoveRunner {

    public static void main(String[] args) {
        Stove stove1 = new Stove("Gas", 4, 15000.0);
        Stove stove2 = new Stove("Electric", 2, 10000.0);
        Stove stove3 = new Stove("Induction", 1, 5000.0);
        Stove stove4 = new Stove("Gas", 3, 12000.0);
        Stove stove5 = new Stove("Electric", 4, 13000.0);
        Stove stove6 = new Stove("Gas", 2, 8000.0);
        Stove stove7 = new Stove("Induction", 1, 7000.0);
        
        stove1.display();
        stove2.display();
        stove3.display();
        stove4.display();
        stove5.display();
        stove6.display();
        stove7.display();
    }
}
    

