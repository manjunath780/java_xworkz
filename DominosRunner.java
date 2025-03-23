public class DominosRunner {
    public static void main(String[] args) {
        // Simulating Domino's Account Creation
        String result = Dominos.signIn(
            "John Doe", "john.doe@example.com", "9876543210", "john_doe123", "Password123", 
            "Password123", "123 Pizza Street", "New York", "10001", "Domino's Times Square"
        );
        System.out.println(result);
    }
}
