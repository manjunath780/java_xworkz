class Dominos {

    public static String signIn(String fullName, String email, String phoneNumber, String username, 
                                       String password, String confirmPassword, String address, String city, 
                                       String postalCode, String preferredStore) {
        String ref = null;

        boolean isAccountValid = validateAccountDetails(fullName, email, phoneNumber, username, password, 
                                                        confirmPassword, address, city, postalCode, preferredStore);

        if(isAccountValid) {
            ref = "Domino's account created successfully!";
        } else {
            ref = "Account creation failed. Please check your details.";
        }

        return ref;
    }

    public static boolean validateAccountDetails(String fullName, String email, String phoneNumber, 
                                                 String username, String password, String confirmPassword, 
                                                 String address, String city, String postalCode, String preferredStore) {
        boolean isValid = false;
        boolean isFullName = false;
        boolean isEmail = false;
        boolean isPhoneNumber = false;
        boolean isUsername = false;
        boolean isPassword = false;
        boolean isConfirmPassword = false;
        boolean isAddress = false;
        boolean isCity = false;
        boolean isPostalCode = false;
        boolean isPreferredStore = false;

        // Validate full name (at least 3 characters)
        if(fullName != null && fullName.length() >= 3) {
            isFullName = true;
            System.out.println("Full Name is valid.");
        } else {
            System.out.println("Full Name must be at least 3 characters.");
        }

        // Validate email (basic regex for valid email format)
        if(email != null ) {
            isEmail = true;
            System.out.println("Email is valid.");
        } else {
            System.out.println("Invalid email address.");
        }

        // Validate phone number (must be 10 digits)
        if(phoneNumber != null ) {
            isPhoneNumber = true;
            System.out.println("Phone number is valid.");
        } else {
            System.out.println("Phone number must be 10 digits.");
        }

        // Validate username (at least 5 characters, can contain letters, digits, periods, and underscores)
        if(username != null && username.length() >= 5 ) {
            isUsername = true;
            System.out.println("Username is valid.");
        } else {
            System.out.println("Username must be at least 5 characters and can only contain letters, digits, periods, and underscores.");
        }

        // Validate password (at least 8 characters)
        if(password != null && password.length() >= 8) {
            isPassword = true;
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password must be at least 8 characters.");
        }

        // Validate confirm password (must match password)
        if(confirmPassword != null ) {
            isConfirmPassword = true;
            System.out.println("Confirm Password is valid.");
        } else {
            System.out.println("Passwords do not match.");
        }

        // Validate address (non-empty string)
        if(address != null ) {
            isAddress = true;
            System.out.println("Address is valid.");
        } else {
            System.out.println("Address must not be empty.");
        }

        // Validate city (non-empty string)
        if(city != null ) {
            isCity = true;
            System.out.println("City is valid.");
        } else {
            System.out.println("City must not be empty.");
        }

        // Validate postal code (must be 6 characters)
        if(postalCode != null ) {
            isPostalCode = true;
            System.out.println("Postal code is valid.");
        } else {
            System.out.println("Postal code must be exactly 6 digits.");
        }

        // Validate preferred store (non-empty string)
        if(preferredStore != null ) {
            isPreferredStore = true;
            System.out.println("Preferred store is valid.");
        } else {
            System.out.println("Preferred store must not be empty.");
        }

        // Final validation: All conditions must be true
        if(isFullName && isEmail && isPhoneNumber && isUsername && isPassword && isConfirmPassword && 
           isAddress && isCity && isPostalCode && isPreferredStore) {
            isValid = true;
        }

        return isValid;
    }
}
