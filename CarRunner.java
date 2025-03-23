 class CarRunner {
    public static void main(String [] ref){
          
        Car car = new Car();
        car.name = "toyota supra";
        car.id = 1;
        car.price = 96000000.00;
        car.seatingCapacity = 2;
        car.modelYear = 2025;

        System.out.println("Car name is "+car.name);
        System.out.println("Car id is "+car.id);
        System.out.println("Car price is "+car.price);
        System.out.println("Car seating capcity is "+car.seatingCapacity);
        System.out.println("Car model year is "+car.modelYear);

        Car car2 = new Car();
        car2.name = "Fortuner";
        car2.id = 2;
        car2.price = 75000000.00;
        car2.seatingCapacity = 6;
        car2.modelYear = 2025;

        System.out.println("\n Car name is "+car2.name);
        System.out.println("Car id is "+car2.id);
        System.out.println("Car price is "+car2.price);
        System.out.println("Car seating capcity is "+car2.seatingCapacity);
        System.out.println("Car model year is "+car2.modelYear);



    }
}
