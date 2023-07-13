class SpeakerTester{

public static void main(String test[]){
System.out.println("Main Started");
boolean connected = Speaker.onOrOff();  //invoking a logic
System.out.println("is speaker connected " + connected);
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();

System.out.println(" ");

boolean connected1 = Speaker.onOrOff();
System.out.println("is speaker connected " + connected1);
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
System.out.println("Main ended");
}
}



//class SpeakerTester{
//public static void main(String test[]){
//System.out.println("Main Started");
//Speaker.name = "";
//boolean connected = Speaker.onOrOff();
//System.out.println("Is speaker connected:");
//boolean connected = Speaker.onOrOff();
//System.out.println("Is speaker connected:");
//System.out.println("Main Ended");