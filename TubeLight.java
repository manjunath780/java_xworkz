class TubeLight {
    String brand;
    double length;
    double power;

    TubeLight(String brand, double length, double power) {
        this.brand = brand;
        this.length = length;
        this.power = power;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Length: " + length + "cm, Power: " + power + "W");
    }

}
