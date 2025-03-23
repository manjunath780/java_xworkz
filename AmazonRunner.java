class AmazonRunner{
    public static void main(String[] ref){

        Amazon ref1 = new Amazon();
        ref1.id = 1;
        ref1.name = "salman";
        ref1.phoneNumber= 7895378986L;
        ref1.password = "password@123";

        System.out.println("user name is "+ref1.name);
        System.out.println("user id is "+ref1.id);
        System.out.println("user phone number is "+ref1.phoneNumber);
        System.out.println("user password is "+ref1.password);

        Amazon ref2 = new Amazon();
        ref2.id = 2;
        ref2.name = "salman";
        ref2.phoneNumber= 8885378989L;
        ref2.password = "password@013";

        System.out.println("\nuser name is "+ref2.name);
        System.out.println("user id is "+ref2.id);
        System.out.println("user phone number is "+ref2.phoneNumber);
        System.out.println("user password is "+ref2.password);

        Amazon ref3 = new Amazon();
        ref3.id = 3;
        ref3.name = "akbar";
        ref3.phoneNumber= 9875378986L;
        ref3.password = "password@1234";

        System.out.println("\nuser name is "+ref3.name);
        System.out.println("user id is "+ref3.id);
        System.out.println("user phone number is "+ref3.phoneNumber);
        System.out.println("user password is "+ref3.password);




    }
}