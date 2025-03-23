class Flipkart {

    public static String createAccount(String username, String password, String email, String phoneNumber, 
                                       String fullName, String address, String dob, String gender, 
                                       String securityQuestion, String securityAnswer) {
        String ref = null;

        boolean isAccountValid = validateAccountDetails(username, password, email, phoneNumber, fullName, 
                                                        address, dob, gender, securityQuestion, securityAnswer);

        if(isAccountValid) {
            ref = "Flipkart account created successfully!";
        } else {
            ref = "Account creation failed. Please check your details.";
        }

        return ref;
    }

    public static boolean validateAccountDetails(String username, String password, String email, String phoneNumber, 
                                                 String fullName, String address, String dob, String gender, 
                                                 String securityQuestion, String securityAnswer) {
        boolean isValid = false;
        boolean isUsername = false;
        boolean isPassword = false;
        boolean isEmail = false;
        boolean isPhoneNumber = false;
        boolean isFullName = false;
        boolean isAddress = false;
        boolean isDOB = false;
        boolean isGender = false;
        boolean isSecurityQuestion = false;
        boolean isSecurityAnswer = false;

        // Validate username
        if(username != null && username.length() >= 5) {
            isUsername = true;
            System.out.println("Username is valid.");
        } else {
            System.out.println("Username must be at least 5 characters.");
        }

        // Validate password (minimum 8 characters)
        if(password != null && password.length() >= 8) {
            isPassword = true;
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password must be at least 8 characters.");
        }

        // Validate email using basic regex
        if(email != null && email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            isEmail = true;
            System.out.println("Email is valid.");
        } else {
            System.out.println("Invalid email address.");
        }

        // Validate phone number (must be 10 digits)
        if(phoneNumber != null && phoneNumber.matches("\\d{10}")) {
            isPhoneNumber = true;
            System.out.println("Phone number is valid.");
        } else {
            System.out.println("Phone number must be 10 digits.");
        }

        // Validate full name (must be at least 3 characters)
        if(fullName != null && fullName.length() >= 3) {
            isFullName = true;
            System.out.println("Full name is valid.");
        } else {
            System.out.println("Full name must be at least 3 characters.");
        }

        // Validate address (must be at least 10 characters long)
        if(address != null && address.length() >= 10) {
            isAddress = true;
            System.out.println("Address is valid.");
        } else {
            System.out.println("Address must be at least 10 characters.");
        }

        // Validate date of birth (must match dd/MM/yyyy format)
        if(dob != null && dob.matches("\\d{2}/\\d{2}/\\d{4}")) {  // Format: dd/MM/yyyy
            isDOB = true;
            System.out.println("Date of birth is valid.");
        } else {
            System.out.println("Date of birth must be in dd/MM/yyyy format.");
        }

        // Validate gender (must be Male or Female)
        if(gender != null && (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female"))) {
            isGender = true;
            System.out.println("Gender is valid.");
        } else {
            System.out.println("Gender must be Male or Female.");
        }

        // Validate security question (must not be empty)
        if(securityQuestion != null && !securityQuestion.isEmpty()) {
            isSecurityQuestion = true;
            System.out.println("Security question is valid.");
        } else {
            System.out.println("Security question must not be empty.");
        }

        // Validate security answer (must not be empty)
        if(securityAnswer != null && !securityAnswer.isEmpty()) {
            isSecurityAnswer = true;
            System.out.println("Security answer is valid.");
        } else {
            System.out.println("Security answer must not be empty.");
        }

        // Final validation: All conditions must be true
        if(isUsername && isPassword && isEmail && isPhoneNumber && isFullName && isAddress && 
           isDOB && isGender && isSecurityQuestion && isSecurityAnswer) {
            isValid = true;
        }

        return isValid;
    }
}
