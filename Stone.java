class Stone {
    String type;
    double weight;
    String color;
    String origin;
    double price;
    int hardness;


    Stone() {
        this("Granite");
        System.out.println("Constructor 1: No parameters");
    }

  
    Stone(String type) {
        this(type, 20.0);
        System.out.println("Constructor 2: Type initialized");
    }

    Stone(String type, double weight) {
        this(type, weight, "Gray");
        System.out.println("Constructor 3: Type and Weight initialized");
    }

   
    Stone(String type, double weight, String color) {
        this(type, weight, color, "Brazil");
        System.out.println("Constructor 4: Type, Weight, and Color initialized");
    }

   
    Stone(String type, double weight, String color, String origin) {
        this(type, weight, color, origin, 1000.0);
        System.out.println("Constructor 5: Type, Weight, Color, and Origin initialized");
    }

  
    Stone(String type, double weight, String color, String origin, double price) {
        this(type, weight, color, origin, price, 7);
        System.out.println("Constructor 6: Type, Weight, Color, Origin, and Price initialized");
    }

    Stone(String type, double weight, String color, String origin, double price, int hardness) {
        this.type = type;
        this.weight = weight;
        this.color = color;
        this.origin = origin;
        this.price = price;
        this.hardness = hardness;
        System.out.println("Constructor 7: All variables initialized");
    }

    

   
    void display() {
        System.out.println( "Stone [Type: " + type + ", Weight: " + weight + "kg, Color: " + color +
        ", Origin: " + origin + ", Price: Rs" + price + ", Hardness: " + hardness + "]");
    }
}
