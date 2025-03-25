class Wire {
    String material;
    double length;
    double diameter;
    String color;
    double resistance;
    double price;

    Wire() {
        this("Copper");
    }

    Wire(String material) {
        this(material, 10.0);
    }

    Wire(String material, double length) {
        this(material, length, 1.0);
    }

    Wire(String material, double length, double diameter) {
        this(material, length, diameter, "Silver");
    }

    Wire(String material, double length, double diameter, String color) {
        this(material, length, diameter, color, 0.5);
    }

    Wire(String material, double length, double diameter, String color, double resistance) {
        this(material, length, diameter, color, resistance, 100.0);
    }

    Wire(String material, double length, double diameter, String color, double resistance, double price) {
        this.material = material;
        this.length = length;
        this.diameter = diameter;
        this.color = color;
        this.resistance = resistance;
        this.price = price;
    }



    void display() {
        System.out.println( "Wire [Material: " + material + ", Length: " + length + " meters, Diameter: " + diameter + " mm, Color: " + color +
        ", Resistance: " + resistance + " ohms, Price: Rs " + price + "]");
    }
}

