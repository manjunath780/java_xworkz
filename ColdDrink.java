class ColdDrink {
    String flavor;
    double volume;
    String brand;

    ColdDrink(String flavor, double volume, String brand) {
        this.flavor = flavor;
        this.volume = volume;
        this.brand = brand;
    }

    void display() {
        System.out.println("Flavor: " + flavor + ", Volume: " + volume + "ml, Brand: " + brand);
    }

}
