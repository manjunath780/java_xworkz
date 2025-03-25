class Chain {
    String material;
    double length;
    double weight;

    Chain(String material, double length, double weight) {
        this.material = material;
        this.length = length;
        this.weight = weight;
    }

    void display() {
        System.out.println("Material: " + material + ", Length: " + length + "cm, Weight: " + weight + "g");
    }

   
}
