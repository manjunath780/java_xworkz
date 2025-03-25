public class ColdDrinkRunner {
 
    public static void main(String[] args) {
        ColdDrink drink1 = new ColdDrink("Cola", 500.0, "CocaCola");
        ColdDrink drink2 = new ColdDrink("Lemon", 300.0, "Sprite");
        ColdDrink drink3 = new ColdDrink("Orange", 250.0, "Fanta");
        ColdDrink drink4 = new ColdDrink("Apple", 600.0, "Peach");
        ColdDrink drink5 = new ColdDrink("Mango", 450.0, "Slice");
        ColdDrink drink6 = new ColdDrink("Grape", 550.0, "Mountain Dew");
        ColdDrink drink7 = new ColdDrink("Peach", 500.0, "Tropicana");
        
        drink1.display();
        drink2.display();
        drink3.display();
        drink4.display();
        drink5.display();
        drink6.display();
        drink7.display();
    }
}
