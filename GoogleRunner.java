public class GoogleRunner {
    public static void main(String[] args) {
        // Simulating Google Account Creation
        String result = Google.createAccount(
            "John", "Doe", "john_doe123", "Password123", "Password123", "john.doe@example.com", 
            "9876543210", "15/08/1990", "Male", "USA"
        );
        System.out.println(result);
    }
}
