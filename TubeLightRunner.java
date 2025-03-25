public class TubeLightRunner {
 
    public static void main(String[] args) {
        TubeLight light1 = new TubeLight("Philips", 60.0, 18.0);
        TubeLight light2 = new TubeLight("Osram", 70.0, 20.0);
        TubeLight light3 = new TubeLight("Eveready", 55.0, 15.0);
        TubeLight light4 = new TubeLight("Bajaj", 65.0, 22.0);
        TubeLight light5 = new TubeLight("Crompton", 80.0, 25.0);
        TubeLight light6 = new TubeLight("Havells", 90.0, 30.0);
        TubeLight light7 = new TubeLight("V-Guard", 50.0, 12.0);
        
        light1.display();
        light2.display();
        light3.display();
        light4.display();
        light5.display();
        light6.display();
        light7.display();
    }
}
