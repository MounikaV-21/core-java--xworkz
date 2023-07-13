class AirCoolerTester{

public static void main(String test[]){
System.out.println("Main Started");
boolean connected = AirCooler.onOrOff();  //invoking a logic
System.out.println("is AC connected " + connected);
AirCooler.increaseTemp();
AirCooler.increaseTemp();
AirCooler.increaseTemp();
AirCooler.increaseTemp();
AirCooler.decreaseTemp();
AirCooler.decreaseTemp();
AirCooler.decreaseTemp();
AirCooler.decreaseTemp();

System.out.println(" ");

boolean connected1 = AirCooler.onOrOff();
System.out.println("is AC connected " + connected1);
AirCooler.increaseTemp();
AirCooler.increaseTemp();
AirCooler.increaseTemp();
AirCooler.increaseTemp();
AirCooler.decreaseTemp();
AirCooler.decreaseTemp();
AirCooler.decreaseTemp();
AirCooler.decreaseTemp();
System.out.println("Main ended");
}
}