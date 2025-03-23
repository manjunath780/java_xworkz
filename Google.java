class Google {

    public static String createAccount(String firstName, String lastName, String username, String password, 
                                       String confirmPassword, String email, String phoneNumber, String dob, 
                                       String gender, String country) {
        String ref = null;

        boolean isAccountValid = validateAccountDetails(firstName, lastName, username, password, confirmPassword, 
                                                        email, phoneNumber, dob, gender, country);
        //if(isAccountValid = true)
        if(isAccountValid) {
            ref = "Google account created successfully!";
        } else {
            ref = "Account creation failed. Please check your details.";
        }

        return ref;
    }

    public static boolean validateAccountDetails(String firstName, String lastName, String username, 
                                                 String password, String confirmPassword, String email, 
                                                 String phoneNumber, String dob, String gender, String country) {
        boolean isValid = false;
        boolean isFirstName = false;
        boolean isLastName = false;
        boolean isUsername = false;
        boolean isPassword = false;
        boolean isConfirmPassword = false;
        boolean isEmail = false;
        boolean isPhoneNumber = false;
        boolean isDOB = false;
        boolean isGender = false;
        boolean isCountry = false;

        // Validate first name (at least 2 characters)
        if(firstName != null && firstName.length() >= 2) {
            isFirstName = true;
            System.out.println("First Name is valid.");
        } else {
            System.out.println("First Name must be at least 2 characters.");
        }

        // Validate last name (at least 2 characters)
        if(lastName != null && lastName.length() >= 2) {
            isLastName = true;
            System.out.println("Last Name is valid.");
        } else {
            System.out.println("Last Name must be at least 2 characters.");
        }

        // Validate username (at least 5 characters, and contains only alphanumeric characters or periods)
        if(username != null && username.length() >= 5 ) {
            isUsername = true;
            System.out.println("Username is valid.");
        } else {
            System.out.println("Username must be at least 5 characters and can only contain letters, digits, dots, and underscores.");
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

        // Validate email (basic regex for valid email format)
        if(email != null ) {
            isEmail = true;
            System.out.println("Email is valid.");
        } else {
            System.out.println("Invalid email address.");
        }

        // Validate phone number (must be 10 digits)
        if(phoneNumber != null) {
            isPhoneNumber = true;
            System.out.println("Phone number is valid.");
        } else {
            System.out.println("Phone number must be 10 digits.");
        }

        // Validate date of birth (must match dd/MM/yyyy format)
        if(dob != null ) {  // Format: dd/MM/yyyy
            isDOB = true;
            System.out.println("Date of birth is valid.");
        } else {
            System.out.println("Date of birth must be in dd/MM/yyyy format.");
        }

        // Validate gender (Male, Female, or Other)
        if(gender != null ) {
            isGender = true;
            System.out.println("Gender is valid.");
        } else {
            System.out.println("Gender must be Male, Female, or Other.");
        }

        // Validate country (non-empty string)
        if(country != null ) {
            isCountry = true;
            System.out.println("Country is valid.");
        } else {
            System.out.println("Country must not be empty.");
        }

        // Final validation: All conditions must be true
        if(isFirstName && isLastName && isUsername && isPassword && isConfirmPassword && isEmail && 
           isPhoneNumber && isDOB && isGender && isCountry) {
            isValid = true;
        }

        return isValid;
    }
}
