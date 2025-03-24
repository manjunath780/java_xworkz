// BubbleGum class with no-argument constructor and parameterized constructor
class BubbleGum {
    String flavor;
    String color;
    int size;

    // No-argument constructor (using reference variable)
    BubbleGum() {
        flavor = "Strawberry";
        color = "Pink";
        size = 5; // size in cm
    }

    // Parameterized constructor (initialize variables inside constructor)
    BubbleGum(String flavor, String color, int size) {
        this.flavor = flavor;
        this.color = color;
        this.size = size;
    }

    // To print object details
    void displayDetails() {
        System.out.println("BubbleGum [Flavor: " + flavor + ", Color: " + color + ", Size: " + size + " cm]");
    }
}



