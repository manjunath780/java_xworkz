class BankAccount{

static double balance;

public static void credit(double amount){
    System.out.println("credit started "+amount);
    if(amount > balance)
        balance +=amount;
    else 
    System.out.println("Invalid");
System.out.println("available balance :"+balance);   

}
public static void debit(double amount){
    System.out.println("debit started "+amount);
    if(amount <= balance)
        balance -=  amount;
    else 
        System.out.println("Insuffient balance");

System.out.println("debit ended"); 
System.out.println("available balance :"+balance);     

}


}