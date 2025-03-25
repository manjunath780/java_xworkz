public class VaseRunner {
   
    public static void main(String[] args) {
        Vase vase1 = new Vase("Glass", "Clear", 30);
        Vase vase2 = new Vase("Ceramic", "White", 25);
        Vase vase3 = new Vase("Plastic", "Red", 20);
        Vase vase4 = new Vase("Clay", "Green", 40);
        Vase vase5 = new Vase("Metal", "Gold", 35);
        Vase vase6 = new Vase("Wood", "Brown", 50);
        Vase vase7 = new Vase("Stone", "Gray", 45);
        
        vase1.display();
        vase2.display();
        vase3.display();
        vase4.display();
        vase5.display();
        vase6.display();
        vase7.display();
    }
}