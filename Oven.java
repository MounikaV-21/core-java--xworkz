class Oven{
	
static String name = "Bajaj";
static  int minTemp; //default value will be 0
static  int currentTemp;
static  int maxTemp = 10;
static boolean isConnected;

//method
public static boolean onOrOff(){
	System.out.println("Invoking onOrOff()");
	System.out.println("Parameter" + 0);
	if(isConnected == false){
		isConnected = true;
		System.out.println("Oven is turned on.. Enjoy");
	}
	else if(isConnected == true){
		isConnected = false;
		System.out.println("Oven is turned off...");
	}
	return isConnected;
	
}




//increase Temp
public static void increaseTemp(){
	System.out.println("Start of increaseTemp()");
if(isConnected == true){
if(currentTemp < maxTemp){
currentTemp = currentTemp+1;
System.out.println("The current Temp is" + currentTemp);
}
else{
System.out.println("Max Temp reached");
}
}
else{
System.out.println("Gubee... Oven On Maadu Firstu");
}
}

//decrease temp

public static void decreaseTemp(){
	
	System.out.println("Invoking decreaseTemp()");
	System.out.println("List of parameters "+2);
if(isConnected = true){
if(currentTemp > minTemp){
currentTemp = currentTemp-1;
System.out.println("The current temp is" + currentTemp);
}
else{
System.out.println("min temp reached");
}
}
else{
System.out.println("Gubee... Oven on Maadu Firstu");
}
}
}	