class Noodles {
    String flavor;
    String packaging;
    double weight;

    Noodles(String flavor, String packaging, double weight) {
        this.flavor = flavor;
        this.packaging = packaging;
        this.weight = weight;
    }

    void display() {
        System.out.println("Flavor: " + flavor + ", Packaging: " + packaging + ", Weight: " + weight + "g");
    }

  
}
