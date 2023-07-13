class OvenTester{

public static void main(String test[]){
System.out.println("Main Started");
boolean connected = Oven.onOrOff();  //invoking a logic
System.out.println("is Oven connected " + connected);
Oven.increaseTemp();
Oven.increaseTemp();
Oven.increaseTemp();
Oven.increaseTemp();
Oven.decreaseTemp();
Oven.decreaseTemp();
Oven.decreaseTemp();
Oven.decreaseTemp();

System.out.println(" ");

boolean connected1 = Oven.onOrOff();
System.out.println("is Oven connected " + connected1);
Oven.increaseTemp();
Oven.increaseTemp();
Oven.increaseTemp();
Oven.increaseTemp();
Oven.decreaseTemp();
Oven.decreaseTemp();
Oven.decreaseTemp();
Oven.decreaseTemp();
System.out.println("Main ended");
}
}