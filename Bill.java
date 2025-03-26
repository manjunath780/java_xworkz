public class Bill {
    int billRefernceNo;
    String billIssueDate;
    String billDueDate;
    String serviceProvider;
    double billAmount;
    String billOverDate;
    boolean isBillPaid;


    Bill(){

    }
Bill( int billRefernceNo,String billIssueDate,String billDueDate,String serviceProvider,double billAmount,String billOverDate,boolean isBillPaid){

    this();
    this.billRefernceNo = billRefernceNo;
    this.billIssueDate = billIssueDate;
    this.billDueDate = billDueDate;
    this.serviceProvider =serviceProvider;
    this.billAmount=billAmount;
    this.billOverDate=billOverDate;
    this.isBillPaid= isBillPaid;
}
public void displayBill(){
    System.out.println("bill is Reaady!!...");
}
}
