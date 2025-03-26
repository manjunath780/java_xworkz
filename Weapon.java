class Weapon {
    String name;
    String type;
    double weight;
    String material;
    int damage;
    double range;

   
    Weapon() {
        this("Sword");
        System.out.println("Constructor 1: No parameters");
    }

    Weapon(String name) {
        this(name, "Melee");
        System.out.println("Constructor 2: Name initialized");
    }

  
    Weapon(String name, String type) {
        this(name, type, 5.0);
        System.out.println("Constructor 3: Name and Type initialized");
    }

 
    Weapon(String name, String type, double weight) {
        this(name, type, weight, "Steel");
        System.out.println("Constructor 4: Name, Type, and Weight initialized");
    }

  
    Weapon(String name, String type, double weight, String material) {
        this(name, type, weight, material, 50);
        System.out.println("Constructor 5: Name, Type, Weight, and Material initialized");
    }

   
    Weapon(String name, String type, double weight, String material, int damage) {
        this(name, type, weight, material, damage, 100.0);
        System.out.println("Constructor 6: Name, Type, Weight, Material, and Damage initialized");
    }

    Weapon(String name, String type, double weight, String material, int damage, double range) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.material = material;
        this.damage = damage;
        this.range = range;
        System.out.println("Constructor 7: All variables initialized");
    }

 
   
    void display() {
        System.out.println("Weapon [Name: " + name + ", Type: " + type + ", Weight: " + weight + " kg, Material: " + material +
                ", Damage: " + damage + ", Range: " + range + " meters]");
    }
}


