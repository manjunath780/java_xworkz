public class calculatorRunner {
    public static void main(String[] args) {
    int addition = Calculator.add(70,56);
    
    System.out.println("addition of two numbers is : "+addition);

    int substraction = Calculator.substract(789,88);
    System.out.println("substraction two of numbers is : "+substraction);

  int multiplication = Calculator.multiplication(789,88);
  System.out.println("multiplication two of numbers is : "+multiplication);

  int division = Calculator.division(560,10);
  System.out.println("division of two numbers is : "+division);

  String messege = Calculator.messege("happy ","women's ","day");
  System.out.println(messege);
    }
}
