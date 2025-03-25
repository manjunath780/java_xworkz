class Stove {
    String type;
    int burners;
    double price;

    Stove(String type, int burners, double price) {
        this.type = type;
        this.burners = burners;
        this.price = price;
    }

    void display() {
        System.out.println("Type: " + type + ", Burners: " + burners + ", Price: Rs " + price);
    }

   
}