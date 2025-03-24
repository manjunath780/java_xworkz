
class BubbleGum {
    String flavor;
    String color;
    int size;

    
    BubbleGum() {
        flavor = "Strawberry";
        color = "Pink";
        size = 5; // size in cm
    }


    BubbleGum(String flavor, String color, int size) {
        this.flavor = flavor;
        this.color = color;
        this.size = size;
    }

    
    void displayDetails() {
        System.out.println("BubbleGum [Flavor: " + flavor + ", Color: " + color + ", Size: " + size + " cm]");
    }
}



