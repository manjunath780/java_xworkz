public class NetflixRunner {
    public static void main(String[] args) {
        // Simulating Netflix Account Creation
        String result = Netflix.accountRegister(
            "John Doe", "john.doe@example.com", "9876543210", "john_doe123", "Password123", 
            "Password123", "123 Main Street", "New York", "10001", "Credit Card"
        );
        System.out.println(result);
    }
}
