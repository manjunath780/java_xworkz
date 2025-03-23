class Calculator{
    public static int add(int number,int anotherNumber){
        int total = number + anotherNumber;

       // System.out.println("addition of numbers is : "+total);
        return total;
    }

    public static int substract(int number,int anotherNumber){
        int total = number - anotherNumber;

        return total;
    }
    public static int multiplication(int number,int anotherNumber){
        int total = number * anotherNumber;

        //System.out.println("multiplication of numbers is : "+total);
        return total;
    }
    public static int division(int number,int anotherNumber){
        int total = number / anotherNumber;

        //System.out.println("multiplication of numbers is : "+total);
        return total;
    }

    public static String messege(String firstWord,String secondWord,String thirdword ){
        String text = firstWord + secondWord + thirdword;
        return text;
    }

    
}