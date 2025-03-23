public class BigBasketRunner {
    public static void main(String[] args) {
        // Simulating Invalid BigBasket Account Creation
        String result = BigBasket.createAccount(
            "John", "john.doe@com", "9876999995", "johnd", "12345678", "12345678", "", "New York", "789000", "Bank Transfer"
        );
        System.out.println(result);
    }
}
