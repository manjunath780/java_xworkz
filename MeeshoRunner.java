public class MeeshoRunner {
    public static void main(String[] args) {
        // Simulating Invalid Meesho Account Creation
        String result = Meesho.accountRegistrtion(
            "Jo", "john.doe@com", "98765", "jd", "123", "123", "", "Mumbai", "4000", "REF"
        );
        System.out.println(result);
    }
}
