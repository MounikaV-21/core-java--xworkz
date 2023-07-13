class Television1{
	
static String name = "Sony";
static  int minVolume; //default value will be 0
static  int currentVolume;
static  int maxVolume = 10;
static boolean isConnected;

//method
public static boolean onOrOff(){
	System.out.println("Invoking onOrOff()");
	System.out.println("Parameter" + 0);
	if(isConnected == false){
		isConnected = true;
		System.out.println("Television is turned on.. Enjoy");
	}
	else if(isConnected == true){
		isConnected = false;
		System.out.println("Television is turned off...");
	}
	return isConnected;
	
}




//increase volume
public static void increaseVolume(){
	System.out.println("Start of increaseVolume()");
if(isConnected == true){
if(currentVolume < maxVolume){
currentVolume = currentVolume+1;
System.out.println("The current Volume is" + currentVolume);
}
else{
System.out.println("Max Volume reached");
}
}
else{
System.out.println("Gubee... TV on Maadu Firstu");
}
}

//decrease Volume

public static void decreaseVolume(){
	
	System.out.println("Invoking decreaseVolume()");
	System.out.println("List of parameters "+2);
if(isConnected = true){
if(currentVolume > minVolume){
currentVolume = currentVolume-1;
System.out.println("The current volume is" + currentVolume);
}
else{
System.out.println("min volume reached");
}
}
else{
System.out.println("Gubee... Tv on Maadu Firstu");
}
}
}	
