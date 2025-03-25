class Vase {
    String material;
    String color;
    int height;

    Vase(String material, String color, int height) {
        this.material = material;
        this.color = color;
        this.height = height;
    }

    void display() {
        System.out.println("Material: " + material + ", Color: " + color + ", Height: " + height + " cm");
    }

}
