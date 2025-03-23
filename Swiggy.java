class Swiggy {
    public static double searchFood(String foodName){
        double price = 0.0;
        if(foodName=="Masala Dosa")
            price = 130.00;

        else if(foodName=="Idli and Vada:")  
            price=150.00;
    

            else if(foodName=="Biryani")  
            price=350.00;

            else if(foodName=="Paneer Butter Masala")  
            price=140.00;

            else if(foodName=="Chicken Fried Rice")  
            price=150.67;

            else if(foodName=="Mysore Pak")  
            price=120.00;

            else if(foodName=="Ragi Mudde")  
            price=180.00;

            else if(foodName=="Kebab Platter:")  
            price=150.00;

            else if(foodName=="Filter Coffee")  
            price=150.00;

            else if(foodName=="Samosa")  
            price=90.00;

            else if(foodName=="Chicken Kebab")  
            price=170.00;

            else if(foodName=="Veg Pulao")  
            price=160.00;

            
        else if(foodName=="Gobi Manchurian")  
        price=150.00;
    
        else if(foodName=="Pav Bhaji")  
        price=170.00;
        
        else if(foodName=="Butter Chicken")  
        price=150.00;

        else if(foodName=="Chole Bhature")  
        price=180.00;

        else if(foodName=="Dhokla")  
        price=170.00;

        else if(foodName=="Pani Puri")  
        price=150.00;

        else if(foodName=="Hyderabadi Biryani")  
        price=350.00;

        else if(foodName=="Malai Kofta:")  
        price=406.00;

        else if(foodName=="Mutton Rogan Josh")  
        price=450.00;

        else if(foodName=="Palak Paneer")  
        price=160.00;

        else if(foodName=="Rajma Chawal")  
        price=150.89;

        else if(foodName=="Fish Curry")  
        price=150.60;

        else if(foodName=="Egg Curry")  
        price=150.00;

        else if(foodName=="Veg Biryani:")  
        price=250.00;

        else if(foodName=="Chicken Tikka Masala")  
        price=350.00;

        else if(foodName=="Dal Makhani")  
        price=250.00;

        else if(foodName=="Aloo Paratha")  
        price=150.00;

        else if(foodName=="Paneer Tikka")  
        price=650.00;

        else if(foodName=="Mutton Biryani")  
        price=550.00;

        else if(foodName=="Veg Hakka Noodles")  
        price=150.40;

        else if(foodName=="Chicken 65")  
        price=150.90;

        else if(foodName=="Pesarattu")  
        price=150.00;

        else if(foodName=="Neer Dosa")  
        price=80.00;

        else if(foodName=="Akki Roti")  
        price=140.00;

        else if(foodName=="Benne Dosa")  
        price=140.00;

        else if(foodName=="Obbattu/Holige")  
        price=120.30;

        else if(foodName=="Mangalore Buns")  
        price=120.70;

        else if(foodName=="Chicken Ghee Roas")  
        price=100.50;

        else
            System.out.println(foodName  +" is Not available") ;
            
       return price;     
    } 

    public static double searchFood(String foodName,int quantity){

        double foodPrice = 0;
        if(foodName=="Masala Dosa")  
        foodPrice = 100.50 * quantity;

        
        else if(foodName=="Idli and Vada:")  
            foodPrice=150.00 * quantity ;
    

            else if(foodName=="Biryani")  
            foodPrice=350.00* quantity;

            else if(foodName=="Paneer Butter Masala")  
            foodPrice=140.00 * quantity ;

            else if(foodName=="Chicken Fried Rice")  
            foodPrice=150.67 * quantity ;

            else if(foodName=="Mysore Pak")  
            foodPrice=120.00 * quantity ;

            else if(foodName=="Ragi Mudde")  
            foodPrice=180.00 * quantity ;

            else if(foodName=="Kebab Platter:")  
            foodPrice=150.00 * quantity ;

            else if(foodName=="Filter Coffee")  
            foodPrice=150.00 * quantity ;

            else if(foodName=="Samosa")  
            foodPrice=90.00 * quantity ;

            else if(foodName=="Chicken Kebab")  
            foodPrice=170.00 * quantity ;

            else if(foodName=="Veg Pulao")  
            foodPrice=160.00 * quantity ;

            
        else if(foodName=="Gobi Manchurian")  
        foodPrice=150.00 * quantity ;
    
        else if(foodName=="Pav Bhaji")  
        foodPrice=170.00 * quantity ;
        
        else if(foodName=="Butter Chicken")  
        foodPrice=150.00 * quantity ;

        else if(foodName=="Chole Bhature")  
        foodPrice=180.00 * quantity ;

        else if(foodName=="Dhokla")  
        foodPrice=170.00 * quantity ;

        else if(foodName=="Pani Puri")  
        foodPrice=150.00 * quantity ;

        else if(foodName=="Hyderabadi Biryani")  
        foodPrice=350.00 * quantity ;

        else if(foodName=="Malai Kofta:")  
        foodPrice=406.00 * quantity ;

        else if(foodName=="Mutton Rogan Josh")  
        foodPrice=450.00 * quantity ;

        else if(foodName=="Palak Paneer")  
        foodPrice=160.00 * quantity ;

        else if(foodName=="Rajma Chawal")  
        foodPrice=150.89 * quantity ;

        else if(foodName=="Fish Curry")  
        foodPrice=150.60 * quantity ;

        else if(foodName=="Egg Curry")  
        foodPrice=150.00 * quantity ;

        else if(foodName=="Veg Biryani:")  
        foodPrice=250. * quantity ;

        else if(foodName=="Chicken Tikka Masala")  
        foodPrice=350.00 * quantity ;

        else if(foodName=="Dal Makhani")  
        foodPrice=250.00 * quantity ;

        else if(foodName=="Aloo Paratha")  
        foodPrice=150. * quantity ;

        else if(foodName=="Paneer Tikka")  
        foodPrice=650.00 * quantity ;

        else if(foodName=="Mutton Biryani")  
        foodPrice=550.00 * quantity ;

        else if(foodName=="Veg Hakka Noodles")  
        foodPrice=150.40 * quantity ;

        else if(foodName=="Chicken 65")  
        foodPrice=150.90 * quantity ;

        else if(foodName=="Pesarattu")  
        foodPrice=150.00 * quantity ;

        else if(foodName=="Neer Dosa")  
        foodPrice=80.00 * quantity ;

        else if(foodName=="Akki Roti")  
        foodPrice=140.00 * quantity ;

        else if(foodName=="Benne Dosa")  
        foodPrice=140.00 * quantity ;

        else if(foodName=="Obbattu/Holige")  
        foodPrice=120.30 * quantity ;

        else if(foodName=="Mangalore Buns")  
        foodPrice=120.70 * quantity ;

        else if(foodName=="Chicken Ghee Roas")  
        foodPrice=100.50 * quantity ;




        return foodPrice;
    }    
}
