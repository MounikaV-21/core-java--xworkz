class Television1Tester{

public static void main(String test[]){
System.out.println("Main Started");
boolean connected = Television1.onOrOff();  //invoking a logic
System.out.println("is television connected " + connected);
Television1.increaseVolume();
Television1.increaseVolume();
Television1.increaseVolume();
Television1.increaseVolume();
Television1.decreaseVolume();
Television1.decreaseVolume();
Television1.decreaseVolume();
Television1.decreaseVolume();

System.out.println(" ");

boolean connected1 = Television1.onOrOff();
System.out.println("is television connected " + connected1);
Television1.increaseVolume();
Television1.increaseVolume();
Television1.increaseVolume();
Television1.increaseVolume();
Television1.decreaseVolume();
Television1.decreaseVolume();
Television1.decreaseVolume();
Television1.decreaseVolume();
System.out.println("Main ended");
}
}