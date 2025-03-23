class Zomato {

    // Method to search food price for a single item
    public static double searchFood(String foodName) {
        double price = 0.0;

        if (foodName=="Pizza Margherita")
            price = 249.00;
        else if (foodName==("Pasta Alfredo"))
            price = 299.00;
        else if (foodName==("Paneer Tikka"))
            price = 220.00;
        else if (foodName.equals("Butter Chicken"))
            price = 350.00;
        else if (foodName.equals("Cheese Burger"))
            price = 180.00;
        else if (foodName.equals("French Fries"))
            price = 80.00;
        else if (foodName.equals("Chicken Shawarma"))
            price = 180.00;
        else if (foodName.equals("Vegetable Sizzler"))
            price = 450.00;
        else if (foodName.equals("Spring Rolls"))
            price = 120.00;
        else if (foodName.equals("Pani Puri"))
            price = 50.00;
        else if (foodName.equals("Sushi"))
            price = 499.00;
        else if (foodName.equals("Mushroom Risotto"))
            price = 350.00;
        else if (foodName.equals("Tandoori Chicken"))
            price = 300.00;
        else if (foodName.equals("Garlic Bread"))
            price = 99.00;
        else if (foodName.equals("Caesar Salad"))
            price = 180.00;
        else if (foodName.equals("Veg Biryani"))
            price = 200.00;
        else if (foodName.equals("Mutton Kebab"))
            price = 400.00;
        else if (foodName.equals("Chicken Wings"))
            price = 250.00;
        else if (foodName.equals("Masala Dosa"))
            price = 120.00;
        else if (foodName.equals("Lassi"))
            price = 70.00;
        else if (foodName.equals("Chocolate Lava Cake"))
            price = 180.00;
        else if (foodName.equals("Garlic Naan"))
            price = 50.00;
        else if (foodName.equals("Aloo Tikki"))
            price = 60.00;
        else if (foodName.equals("Falafel Wrap"))
            price = 200.00;
        else if (foodName.equals("Fish and Chips"))
            price = 300.00;
        else
            System.out.println(foodName + " is Not available");

        return price;
    }

    // Method to search food price for multiple quantities
    public static double searchFood(String foodName, int quantity) {
        double foodPrice = 0;

        if (foodName.equals("Pizza Margherita"))
            foodPrice = 249.00 * quantity;
        else if (foodName.equals("Pasta Alfredo"))
            foodPrice = 299.00 * quantity;
        else if (foodName==("Paneer Tikka"))
            foodPrice = 220.00 * quantity;
        else if (foodName.equals("Butter Chicken"))
            foodPrice = 350.00 * quantity;
        else if (foodName.equals("Cheese Burger"))
            foodPrice = 180.00 * quantity;
        else if (foodName.equals("French Fries"))
            foodPrice = 80.00 * quantity;
        else if (foodName.equals("Chicken Shawarma"))
            foodPrice = 180.00 * quantity;
        else if (foodName.equals("Vegetable Sizzler"))
            foodPrice = 450.00 * quantity;
        else if (foodName.equals("Spring Rolls"))
            foodPrice = 120.00 * quantity;
        else if (foodName.equals("Pani Puri"))
            foodPrice = 50.00 * quantity;
        else if (foodName.equals("Sushi"))
            foodPrice = 499.00 * quantity;
        else if (foodName.equals("Mushroom Risotto"))
            foodPrice = 350.00 * quantity;
        else if (foodName.equals("Tandoori Chicken"))
            foodPrice = 300.00 * quantity;
        else if (foodName.equals("Garlic Bread"))
            foodPrice = 99.00 * quantity;
        else if (foodName.equals("Caesar Salad"))
            foodPrice = 180.00 * quantity;
        else if (foodName.equals("Veg Biryani"))
            foodPrice = 200.00 * quantity;
        else if (foodName.equals("Mutton Kebab"))
            foodPrice = 400.00 * quantity;
        else if (foodName.equals("Chicken Wings"))
            foodPrice = 250.00 * quantity;
        else if (foodName.equals("Masala Dosa"))
            foodPrice = 120.00 * quantity;
        else if (foodName.equals("Lassi"))
            foodPrice = 70.00 * quantity;
        else if (foodName.equals("Chocolate Lava Cake"))
            foodPrice = 180.00 * quantity;
        else if (foodName.equals("Garlic Naan"))
            foodPrice = 50.00 * quantity;
        else if (foodName.equals("Aloo Tikki"))
            foodPrice = 60.00 * quantity;
        else if (foodName.equals("Falafel Wrap"))
            foodPrice = 200.00 * quantity;
        else if (foodName.equals("Fish and Chips"))
            foodPrice = 300.00 * quantity;

        return foodPrice;
    }
}

