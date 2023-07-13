class Karnataka{
	//Array has limitation - size is fixed
static String cityNames[] = {null, null, null, null, null, null};
static int index;
// Save, Create, Add, Insert
public static boolean saveCityNames(String city){
	boolean isSaved = false;
	//Validate
	if(cityNames.length>index){
		
	
	if(city != null && city.length()>0){
		cityNames[index] = city;
		index++;
		isSaved = true;
		System.out.println("city added " + isSaved);
	}else{
		System.out.println("Cann't save city names as it is null");
		}
}else{
		System.out.println("Array size has been reached cann't add city name");
		System.out.println(" ");
	}
		
		return isSaved;
}

public static void getAllCityNames(){
	System.out.println("Invoking getAllCityNames");
	 
for(int city=0; city<cityNames.length; city++){
	String refrence = cityNames[city];
	System.out.println("Access city " + refrence + " at " +city);
}
System.out.println("End getAllCityNames");
System.out.println(" ");
}

public static boolean updateCityName(String existingCityName, String updateCityName){
	boolean isUpdated = false;
	for(int cityIndex = 0; cityIndex < cityNames.length; cityIndex++){
		if(cityNames[cityIndex].equals(existingCityName)){
			cityNames[cityIndex] = updateCityName;
			isUpdated = true;
}
}
return isUpdated;
}

public static int deleteCity(String deletedCity){
	boolean isDeleted = false;
	int cityIndex;
	int  noOfElements = cityNames.length;
for(cityIndex = 0; cityIndex<cityNames.length; cityIndex++){
	if(cityNames[cityIndex].equals(deletedCity)){
		break;
}
}
if(cityIndex < noOfElements){
	noOfElements = noOfElements-1;
	for(int newCityIndex = cityIndex; newCityIndex < noOfElements; newCityIndex++){
		cityNames[newCityIndex] = cityNames[newCityIndex+1];
	}
}
return noOfElements;
}
public static void getAllCityNamesPostDeletion(int newLength){
	for(int cityIndex=0; cityIndex<newLength; cityIndex++){
		System.out.println(cityNames[cityIndex]);
	}
		
		
}
}
