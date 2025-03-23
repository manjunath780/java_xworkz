public class InstagranRunner {
    public static void main(String[] args) {
       
        String result = Instagram.accountSignin(
            "John Doe", "john_doe123", "Password123", "Password123", "john.doe@example.com", 
            "9876543210", "15/08/1990", "Male", "profilePic.jpg", "Photography enthusiast"
        );
        System.out.println(result);
    }
}
