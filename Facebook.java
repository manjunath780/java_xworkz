public class Facebook {
    public static String userName(String firstName,String lastName,long phNumber,String gmailID,String dOB,char gender){
       String  message = "";
        if(firstName != null){
           message = "login successful "; 
        }
        else{
            message = "login failed";
        }
        return message;
    }
}
