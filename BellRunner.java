public class BellRunner {
    public static void main(String[] args) {
        
        Bell bell1 = new Bell(); 
        Bell bell2 = new Bell(); 
        bell2.material = "Brass";
        bell2.color = "Silver";
        bell2.sound = "Ding Dong";

        Bell bell3 = new Bell(); 
        bell3.material = "Copper";
        bell3.color = "Gold";
        bell3.sound = "Chime";

        
        Bell bell4 = new Bell("Bronze", "Copper", "Ting");
        Bell bell5 = new Bell("Silver", "Black", "Ding");
        Bell bell6 = new Bell("Steel", "Gray", "Bong");
        Bell bell7 = new Bell("Iron", "Brown", "Ring");

        
        System.out.println("Bell Instances:");
        bell1.displayDetails();
        bell2.displayDetails();
        bell3.displayDetails();
        bell4.displayDetails();
        bell5.displayDetails();
        bell6.displayDetails();
        bell7.displayDetails();
    }
}
