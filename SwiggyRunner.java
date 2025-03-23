public class SwiggyRunner {
   
        public static void main(String []ref){
            double result = Swiggy.searchFood("Filter Coffee");
            System.out.println(result);

            double item = Swiggy.searchFood("Filter Coffee",2);
            System.out.println(item);
        }
        
    }

