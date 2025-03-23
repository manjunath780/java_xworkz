

public class FlipkartRunner {
    public static void main(String[] args) {
        // Simulating Flipkart Account Creation
        String result = Flipkart.createAccount(
            "john_doe", "Password123", "john.doe@example.com", "9876543210", "John Doe", 
            "123 Main St, City, Country", "15/08/1990", "Male", "What is your pet's name?", "Fluffy"
        );
        System.out.println(result);
    }
}

