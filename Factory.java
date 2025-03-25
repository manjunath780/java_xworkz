class Factory {
    String name;
    String location;
    int employees;
    String industryType;
    double revenue;
    int productionCapacity;

    Factory() {
        this("Generic Factory");
    }

    Factory(String name) {
        this(name, "Unknown Location");
    }

    Factory(String name, String location) {
        this(name, location, 50);
    }

    Factory(String name, String location, int employees) {
        this(name, location, employees, "Manufacturing");
    }

    Factory(String name, String location, int employees, String industryType) {
        this(name, location, employees, industryType, 1000000.0);
    }

    Factory(String name, String location, int employees, String industryType, double revenue) {
        this(name, location, employees, industryType, revenue, 500);
    }

    Factory(String name, String location, int employees, String industryType, double revenue, int productionCapacity) {
        this.name = name;
        this.location = location;
        this.employees = employees;
        this.industryType = industryType;
        this.revenue = revenue;
        this.productionCapacity = productionCapacity;
    }


    void display() {
        System.out.println("Factory [Name: " + name + ", Location: " + location + ", Employees: " + employees +
                ", Industry Type: " + industryType + ", Revenue: Rs " + revenue + ", Production Capacity: " + productionCapacity + "]");
    }
}