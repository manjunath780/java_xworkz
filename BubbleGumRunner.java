class BubbleGumRunner{
    public static void main(String[] args) {
        // BubbleGum class instances using no-argument constructor
        BubbleGum gum1 = new BubbleGum();

        BubbleGum gum2 = new BubbleGum();
        gum2.flavor="pine apple";
        gum2.color="yellow";
        gum2.size=4;

        BubbleGum gum3 = new BubbleGum();
        gum3.flavor="mint";
        gum3.color="white";
        gum3.size=3;



        BubbleGum gum4 = new BubbleGum("Mint", "Green", 6);
        BubbleGum gum5 = new BubbleGum("Blueberry", "Blue", 7);
        BubbleGum gum6 = new BubbleGum("Watermelon", "Red", 5);
        BubbleGum gum7 = new BubbleGum("Lemon", "Yellow", 4);

   

        // Displaying details of all instances
        System.out.println("BubbleGum Instances:");
        gum1.displayDetails();
        gum2.displayDetails();
        gum3.displayDetails();
        gum4.displayDetails();
        gum5.displayDetails();
        gum6.displayDetails();
        gum7.displayDetails();

    }
}
