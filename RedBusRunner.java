public class RedBusRunner {
    public static void main(String[] args) {
        // Simulating RedBus Account Creation
        String result = RedBus.accountCreation(
            "John Doe", "john.doe@example.com", "9876543210", "john_doe123", "Password123", 
            "Password123", "123 Bus Stop Lane", "Chennai", "600100", "Online"
        );
        System.out.println(result);
    }
}
