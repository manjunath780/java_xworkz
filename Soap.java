class Soap {
    String type;
    double weight;
    String fragrance;

    Soap(String type, double weight, String fragrance) {
        this.type = type;
        this.weight = weight;
        this.fragrance = fragrance;
    }

    void display() {
        System.out.println("Type: " + type + ", Weight: " + weight + "g, Fragrance: " + fragrance);
    }

 
}

