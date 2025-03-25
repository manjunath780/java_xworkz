class PhotoFrame {
    String material;
    String color;
    int size;

    PhotoFrame(String material, String color, int size) {
        this.material = material;
        this.color = color;
        this.size = size;
    }

    void display() {
        System.out.println("Material: " + material + ", Color: " + color + ", Size: " + size + " inches");
    }


}
