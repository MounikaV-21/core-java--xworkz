class Mixer1{
	
static String name = "Butterfly";
static  int minSpeed; //default value will be 0
static  int currentSpeed;
static  int maxSpeed = 10;
static boolean isConnected;

//method
public static boolean onOrOff(){
	System.out.println("Invoking onOrOff()");
	System.out.println("Parameter" + 0);
	if(isConnected == false){
		isConnected = true;
		System.out.println("Mixer is turned on..");
	}
	else if(isConnected == true){
		isConnected = false;
		System.out.println("Mixer is turned off...");
	}
	return isConnected;
	
}




//increase Speed
public static void increaseSpeed(){
	System.out.println("Start of increaseSpeed()");
if(isConnected == true){
if(currentSpeed < maxSpeed){
currentSpeed = currentSpeed+1;
System.out.println("The current Speed is" + currentSpeed);
}
else{
System.out.println("Max Speed reached");
}
}
else{
System.out.println("Gubee... Mixer on Maadu Firstu");
}
}

//decrease Speed

public static void decreaseSpeed(){
	
	System.out.println("Invoking decreaseSpeed()");
	System.out.println("List of parameters "+2);
if(isConnected = true){
if(currentSpeed > minSpeed){
currentSpeed = currentSpeed-1;
System.out.println("The current Speed is" + currentSpeed);
}
else{
System.out.println("min Speed reached");
}
}
else{
System.out.println("Gubee... Mixer on Maadu Firstu");
}
}
}	
