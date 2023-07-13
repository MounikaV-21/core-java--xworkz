class WashingMachine1Tester{

public static void main(String test[]){
System.out.println("Main Started");
boolean connected = WashingMachine1.onOrOff();  //invoking a logic
System.out.println("is mixer connected " + connected);
WashingMachine1.increaseSpeed();
WashingMachine1.increaseSpeed();
WashingMachine1.increaseSpeed();
WashingMachine1.increaseSpeed();
WashingMachine1.decreaseSpeed();
WashingMachine1.decreaseSpeed();
WashingMachine1.decreaseSpeed();
WashingMachine1.decreaseSpeed();

System.out.println(" ");

boolean connected1 = WashingMachine1.onOrOff();
System.out.println("is Mixer connected " + connected1);
WashingMachine1.increaseSpeed();
WashingMachine1.increaseSpeed();
WashingMachine1.increaseSpeed();
WashingMachine1.increaseSpeed();
WashingMachine1.decreaseSpeed();
WashingMachine1.decreaseSpeed();
WashingMachine1.decreaseSpeed();
WashingMachine1.decreaseSpeed();
System.out.println("Main ended");
}
}



