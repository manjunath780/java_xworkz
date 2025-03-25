class Flag {
    String country;
    String color1;
    String color2;
    String color3;
    String shape;
    String symbol;

 
    Flag() {
        this("Unknown");
        System.out.println("Constructor 1: No parameters");
    }

 
    Flag(String country) {
        this(country, "Red");
        System.out.println("Constructor 2: Country initialized");
    }

  
    Flag(String country, String color1) {
        this(country, color1, "White");
        System.out.println("Constructor 3: Country and Color1 initialized");
    }

    
    Flag(String country, String color1, String color2) {
        this(country, color1, color2, "Blue");
        System.out.println("Constructor 4: Country, Color1, and Color2 initialized");
    }

  
    Flag(String country, String color1, String color2, String color3) {
        this(country, color1, color2, color3, "Rectangular");
        System.out.println("Constructor 5: Country, Color1, Color2, and Color3 initialized");
    }

  
    Flag(String country, String color1, String color2, String color3, String shape) {
        this(country, color1, color2, color3, shape, "None");
        System.out.println("Constructor 6: Country, Color1, Color2, Color3, and Shape initialized");
    }

   
    Flag(String country, String color1, String color2, String color3, String shape, String symbol) {
        this.country = country;
        this.color1 = color1;
        this.color2 = color2;
        this.color3 = color3;
        this.shape = shape;
        this.symbol = symbol;
        System.out.println("Constructor 7: All variables initialized");
    }

   
    void display() {
        System.out.println("Flag [Country: " + country + ", Colors: " + color1 + ", " + color2 + ", " + color3 +
                ", Shape: " + shape + ", Symbol: " + symbol + "]");
    }
}
