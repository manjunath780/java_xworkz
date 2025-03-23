class Instagram {

    public static String accountSignin(String fullName, String username, String password, String confirmPassword, 
                                       String email, String phoneNumber, String dob, String gender, 
                                       String profilePicture, String bio) {
        String ref = null;

        boolean isAccountValid = validateAccountDetails(fullName, username, password, confirmPassword, 
                                                        email, phoneNumber, dob, gender, profilePicture, bio);

        if(isAccountValid) {
            ref = "Instagram account created successfully!";
        } else {
            ref = "Account creation failed. Please check your details.";
        }

        return ref;
    }

    public static boolean validateAccountDetails(String fullName, String username, String password, 
                                                 String confirmPassword, String email, String phoneNumber, 
                                                 String dob, String gender, String profilePicture, String bio) {
        boolean isValid = false;
        boolean isFullName = false;
        boolean isUsername = false;
        boolean isPassword = false;
        boolean isConfirmPassword = false;
        boolean isEmail = false;
        boolean isPhoneNumber = false;
        boolean isDOB = false;
        boolean isGender = false;
        boolean isProfilePicture = false;
        boolean isBio = false;

        // Validate full name (at least 3 characters)
        if(fullName != null && fullName.length() >= 3) {
            isFullName = true;
            System.out.println("Full Name is valid.");
        } else {
            System.out.println("Full Name must be at least 3 characters.");
        }

        // Validate username (at least 5 characters, and can only contain letters, digits, periods, and underscores)
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

        // Validate profile picture (non-empty, optional check for format)
        if(profilePicture != null ) {
            isProfilePicture = true;
            System.out.println("Profile Picture is valid.");
        } else {
            System.out.println("Profile Picture is optional, but if provided, should be valid.");
        }

        // Validate bio (maximum 150 characters)
        if(bio != null && bio.length() <= 150) {
            isBio = true;
            System.out.println("Bio is valid.");
        } else {
            System.out.println("Bio should not exceed 150 characters.");
        }

        // Final validation: All conditions must be true
        if(isFullName && isUsername && isPassword && isConfirmPassword && isEmail && isPhoneNumber && 
           isDOB && isGender && isProfilePicture && isBio) {
            isValid = true;
        }

        return isValid;
    }
}
