class Road {
    String type;
    double length;
    String material;
    String location;
    int lanes;
    int speedLimit;

    // 1st Constructor (No parameters)
    Road() {
        this("Highway");
        System.out.println("Constructor 1: No parameters");
    }


    Road(String type) {
        this(type, 10.0);
        System.out.println("Constructor 2: Type initialized");
    }

    Road(String type, double length) {
        this(type, length, "Asphalt");
        System.out.println("Constructor 3: Type and Length initialized");
    }

 
    Road(String type, double length, String material) {
        this(type, length, material, "Unknown");
        System.out.println("Constructor 4: Type, Length, and Material initialized");
    }

   
    Road(String type, double length, String material, String location) {
        this(type, length, material, location, 2);
        System.out.println("Constructor 5: Type, Length, Material, and Location initialized");
    }

   
    Road(String type, double length, String material, String location, int lanes) {
        this(type, length, material, location, lanes, 60);
        System.out.println("Constructor 6: Type, Length, Material, Location, and Lanes initialized");
    }

   
    Road(String type, double length, String material, String location, int lanes, int speedLimit) {
        this.type = type;
        this.length = length;
        this.material = material;
        this.location = location;
        this.lanes = lanes;
        this.speedLimit = speedLimit;
        System.out.println("Constructor 7: All variables initialized");
    }


    void display() {
        System.out.println( "Road [Type: " + type + ", Length: " + length + " km, Material: " + material +
        ", Location: " + location + ", Lanes: " + lanes + ", Speed Limit: " + speedLimit + " km/h]");
    }
}