class Mixer1Tester{

public static void main(String test[]){
System.out.println("Main Started");
boolean connected = Mixer1.onOrOff();  //invoking a logic
System.out.println("is mixer connected " + connected);
Mixer1.increaseSpeed();
Mixer1.increaseSpeed();
Mixer1.increaseSpeed();
Mixer1.increaseSpeed();
Mixer1.decreaseSpeed();
Mixer1.decreaseSpeed();
Mixer1.decreaseSpeed();
Mixer1.decreaseSpeed();

System.out.println(" ");

boolean connected1 = Mixer1.onOrOff();
System.out.println("is Mixer connected " + connected1);
Mixer1.increaseSpeed();
Mixer1.increaseSpeed();
Mixer1.increaseSpeed();
Mixer1.increaseSpeed();
Mixer1.decreaseSpeed();
Mixer1.decreaseSpeed();
Mixer1.decreaseSpeed();
Mixer1.decreaseSpeed();
System.out.println("Main ended");
}
}



