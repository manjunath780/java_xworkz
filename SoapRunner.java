

public class SoapRunner {
    public static void main(String[] args) {
        // Creating instances using no-argument constructor
        Soap soap1 = new Soap();
        Soap soap2 = new Soap();
       soap2. brand = "Amam";
        soap2.scent = "Neem";
       soap2 .weight = 120; 
        Soap soap3 = new Soap();
       soap3. brand = "santoor";
       soap3 .scent = "sandal";
       soap3. weight = 98; 

        // Creating instances using parameterized constructor
        Soap soap4 = new Soap("Lux", "Rose", 125);
        Soap soap5 = new Soap("Palmolive", "Citrus", 150);
        Soap soap6 = new Soap("Nivea", "Aloe Vera", 90);
        Soap soap7 = new Soap("Olay", "Jasmine", 110);

        // Displaying details of all instances
        System.out.println("Soap Instances:");
        soap1.displayDetails();
        soap2.displayDetails();
        soap3.displayDetails();
        soap4.displayDetails();
        soap5.displayDetails();
        soap6.displayDetails();
        soap7.displayDetails();
    }
}
    

