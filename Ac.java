public class Ac {
    static  boolean turnOn = false;
    static int currentTemp;
    static int maxTemp = 6;
    static int minTemp;

    public static boolean acStatus(){
        
        if(turnOn == false)
            turnOn = true;
        
        else
            turnOn=false;

    return turnOn;     
 }


 //increase temp
 public static void increaseTemp(){
   // boolean turnOn = Ac.acStatus();
    if(turnOn==true){
        if(currentTemp<6){
            currentTemp = currentTemp+1;
            System.out.println("the current temperture is  "+currentTemp);
        }else
        System.out.println("max temp reached.... ");

    }
    else{
        System.out.println("turn on the ac first..... ");
    }
    return ;

 }

  //decrease temp
  public static void decreaseTemp(){
    //boolean turnOn = Ac.acStatus();
    if(turnOn==true){
        if(currentTemp<maxTemp){
            currentTemp = currentTemp-1;
            System.out.println("the current temperture is  "+currentTemp);
        }else   
        System.out.println("min temp reached..... ");
        
    }
    else{
        System.out.println("turn on the ac first..... ");
    }
    return ;

    
 }


}


