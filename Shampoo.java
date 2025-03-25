class Shampoo {
    String brand;
    String fragrance;
    double volume;

    Shampoo(String brand, String fragrance, double volume) {
        this.brand = brand;
        this.fragrance = fragrance;
        this.volume = volume;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Fragrance: " + fragrance + ", Volume: " + volume + "ml");
    }

}
