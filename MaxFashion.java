 class MaxFashion {

    public static String signUp(String firstName,String lastName,String phoneNumber,String gmailID,String dOB, String gender){
        String ref =null;

      boolean isUserValited = validateUserProfile(firstName, lastName,phoneNumber, gmailID,dOB, gender);
      if(isUserValited==true){
        ref="user Registration successfull";
      }
      else{
        ref="user Registration failed";
      }

      return ref;

    }
    public static boolean validateUserProfile(String firstName,String lastName,String phoneNumber,String gmailID,String dOB, String gender){
        boolean userValid = false;
            boolean isFirstName = false;
            boolean isLastName = false;
            boolean isPhoneNumber = false;
            boolean isGmailID = false;
            boolean isDOB = false;
            boolean isGender = false;

        if(firstName != null && firstName.length() >=3){
             isFirstName = true;
             System.out.println("firstnme is "+firstName);
        } 
        else{
            System.out.println("provide valid FirstName");
        }
        
        if(lastName != null && lastName.length() >=3){
            isLastName = true;
       } 
       else{
           System.out.println("provide valid lastName");
       }

       if(phoneNumber != null && phoneNumber.length() ==10){
        isPhoneNumber = true;
        
     } 
      else{
       System.out.println("provide valid phone number");
    }
    if(gmailID != null ){
        isGmailID = true;
   } 
   else{
       System.out.println("provide valid Gmail ID");
   }
   if(dOB != null ){
    isDOB = true;
    } 
    else{
   System.out.println("provide valid date of birth");
    }

    if(gender != null ){
    isGender = true;
    } 
    else{
   System.out.println("provide valid Gender");
    }

  if(isFirstName==true&&isLastName==true&&isPhoneNumber==true&&isGender==true&&isGmailID==true&&isDOB==true){
    userValid = true;
  }
 


    return userValid;
    

}


}



