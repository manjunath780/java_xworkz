public class ZomotoRunner {
    public static void main(String []re){
        double ref = Zomato.searchFood("Paneer Tikka");
        System.out.println(ref);

        double item = Zomato.searchFood("Paneer Tikka",3);
        System.out.println(item);
    }
    
}

