class Metro {
    String lineName;
    int stations;
    String operatingHours;
    String trainType;
    double totalLength;
    double ticketPrice;

  
    Metro() {
        this("Red Line");
        System.out.println("Constructor 1: No parameters");
    }

  
    Metro(String lineName) {
        this(lineName, 10);
        System.out.println("Constructor 2: Line Name initialized");
    }


    Metro(String lineName, int stations) {
        this(lineName, stations, "5:00 AM to 11:00 PM");
        System.out.println("Constructor 3: Line Name and Stations initialized");
    }

   
    Metro(String lineName, int stations, String operatingHours) {
        this(lineName, stations, operatingHours, "Electric");
        System.out.println("Constructor 4: Line Name, Stations, and Operating Hours initialized");
    }

    Metro(String lineName, int stations, String operatingHours, String trainType) {
        this(lineName, stations, operatingHours, trainType, 25.0);
        System.out.println("Constructor 5: Line Name, Stations, Operating Hours, and Train Type initialized");
    }

  
    Metro(String lineName, int stations, String operatingHours, String trainType, double totalLength) {
        this(lineName, stations, operatingHours, trainType, totalLength, 20.0);
        System.out.println("Constructor 6: Line Name, Stations, Operating Hours, Train Type, and Total Length initialized");
    }

    
    Metro(String lineName, int stations, String operatingHours, String trainType, double totalLength, double ticketPrice) {
        this.lineName = lineName;
        this.stations = stations;
        this.operatingHours = operatingHours;
        this.trainType = trainType;
        this.totalLength = totalLength;
        this.ticketPrice = ticketPrice;
        System.out.println("Constructor 7: All variables initialized");
    }

 
    void display() {
        System.out.println("Metro [Line: " + lineName + ", Stations: " + stations + ", Operating Hours: " + operatingHours +
                ", Train Type: " + trainType + ", Total Length: " + totalLength + " km, Ticket Price: Rs " + ticketPrice + "]");
    }
}