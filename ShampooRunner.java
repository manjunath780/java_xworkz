public class ShampooRunner {
    
    public static void main(String[] args) {
        Shampoo shampoo1 = new Shampoo("Dove", "Lavender", 250.0);
        Shampoo shampoo2 = new Shampoo("Pantene", "Rose", 300.0);
        Shampoo shampoo3 = new Shampoo("Head & Shoulders", "Mint", 400.0);
        Shampoo shampoo4 = new Shampoo("Sunsilk", "Jasmine", 350.0);
        Shampoo shampoo5 = new Shampoo("L'Oréal", "Coconut", 200.0);
        Shampoo shampoo6 = new Shampoo("Tresemme", "Vanilla", 500.0);
        Shampoo shampoo7 = new Shampoo("Herbal Essences", "Apple", 250.0);
        
        shampoo1.display();
        shampoo2.display();
        shampoo3.display();
        shampoo4.display();
        shampoo5.display();
        shampoo6.display();
        shampoo7.display();
    }
}
