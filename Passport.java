class Passport {

    public static String applyForPassport(String firstName, String lastName, String gender, String dob, 
                                           String address, String phoneNumber, String email, String passportType,
                                           String nationality, String fatherName) {
        String ref = null;

        boolean isApplicationValid = validateApplicationDetails(firstName, lastName, gender, dob, address, 
                                                                phoneNumber, email, passportType, nationality, fatherName);

        if(isApplicationValid) {
            ref = "Passport application submitted successfully!";
        } else {
            ref = "Passport application failed. Please check your details.";
        }

        return ref;
    }

    public static boolean validateApplicationDetails(String firstName, String lastName, String gender, String dob, 
                                                      String address, String phoneNumber, String email, String passportType,
                                                      String nationality, String fatherName) {
        boolean isValid = false;
        boolean isFirstName = false;
        boolean isLastName = false;
        boolean isGender = false;
        boolean isDOB = false;
        boolean isAddress = false;
        boolean isPhoneNumber = false;
        boolean isEmail = false;
        boolean isPassportType = false;
        boolean isNationality = false;
        boolean isFatherName = false;

        // Validate first name
        if(firstName != null && firstName.length() >= 3) {
            isFirstName = true;
            System.out.println("First Name is valid.");
        } else {
            System.out.println("First Name must be at least 3 characters.");
        }

        // Validate last name
        if(lastName != null && lastName.length() >= 3) {
            isLastName = true;
            System.out.println("Last Name is valid.");
        } else {
            System.out.println("Last Name must be at least 3 characters.");
        }

        // Validate gender
        if(gender != null && (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female"))) {
            isGender = true;
            System.out.println("Gender is valid.");
        } else {
            System.out.println("Provide a valid gender (Male/Female).");
        }

        // Validate date of birth
        if(dob != null && dob.matches("\\d{2}/\\d{2}/\\d{4}")) { // Format: dd/MM/yyyy
            isDOB = true;
            System.out.println("Date of Birth is valid.");
        } else {
            System.out.println("Provide a valid Date of Birth in dd/MM/yyyy format.");
        }

        // Validate address
        if(address != null && address.length() >= 10) {
            isAddress = true;
            System.out.println("Address is valid.");
        } else {
            System.out.println("Provide a valid address (at least 10 characters).");
        }

        // Validate phone number (should be 10 digits)
        if(phoneNumber != null && phoneNumber.matches("\\d{10}")) {
            isPhoneNumber = true;
            System.out.println("Phone number is valid.");
        } else {
            System.out.println("Provide a valid 10-digit phone number.");
        }

        // Validate email (basic email validation)
        if(email != null && email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            isEmail = true;
            System.out.println("Email is valid.");
        } else {
            System.out.println("Provide a valid email address.");
        }

        // Validate passport type
        if(passportType != null && (passportType.equalsIgnoreCase("Normal") || passportType.equalsIgnoreCase("Tatkal"))) {
            isPassportType = true;
            System.out.println("Passport Type is valid.");
        } else {
            System.out.println("Provide a valid passport type (Normal/Tatkal).");
        }

        // Validate nationality
        if(nationality != null && nationality.length() >= 3) {
            isNationality = true;
            System.out.println("Nationality is valid.");
        } else {
            System.out.println("Provide a valid nationality (at least 3 characters).");
        }

        // Validate father name
        if(fatherName != null && fatherName.length() >= 3) {
            isFatherName = true;
            System.out.println("Father's Name is valid.");
        } else {
            System.out.println("Provide a valid Father's Name (at least 3 characters).");
        }

        // Final validation: All conditions must be true
        if(isFirstName && isLastName && isGender && isDOB && isAddress && isPhoneNumber && isEmail && 
           isPassportType && isNationality && isFatherName) {
            isValid = true;
        }

        return isValid;
    }

}

