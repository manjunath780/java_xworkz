class BubbleGum {
    String flavor;
    String color;
    double weight;

    BubbleGum(String flavor, String color, double weight) {
        this.flavor = flavor;
        this.color = color;
        this.weight = weight;
    }

    void display() {
        System.out.println("Flavor: " + flavor + ", Color: " + color + ", Weight: " + weight + "g");
    }

   
}
