//class TravelAgency{
//	touristPlaces[] = 8
//}

class TravelAgency{
static String touristPlaces[] = {null, null, null, null, null, null, null, null};
static int index;

public static boolean addTouristPlaces(String tourist){
boolean isAdded = false;
if(touristPlaces.length>index){
if(tourist != null && tourist.length()>0){
	touristPlaces[index] = tourist;
	index++;
	isAdded = true;
	System.out.println("tourist place added" +isAdded);
}else{
	System.out.println("Cann't get Tourist places as it is null");
}
}else{
		System.out.println("Array size has been reached cann't add tourist places");
		System.out.println(" ");
	}
return isAdded;
}

public static void getAllTouristPlaces(){
	for(int tourist=0; tourist<touristPlaces.length; tourist++){
		String refrence = touristPlaces[tourist];
		System.out.println("Access Tourist " + refrence + " at " +tourist);
	}
	System.out.println("End getAllTouristPlaces");
	System.out.println(" ");
}

public static boolean updateTouristPlaces(String existingTouristPlace, String updatedTouristPlace){
	boolean isUpdated = false;
	for(int touristIndex = 0; touristIndex<touristPlaces.length; touristIndex++){
		if(touristPlaces[touristIndex].equals(existingTouristPlace)){
			touristPlaces[touristIndex] = updatedTouristPlace;
			isUpdated = true;
}
	}
	return isUpdated;
}

public static int deleteTouristPlace(String deletedTouristPlace){
	boolean isDeleted = false;
	int touristIndex;
	int  noOfElements = touristPlaces.length;
for(touristIndex = 0; touristIndex<touristPlaces.length; touristIndex++){
	if(touristPlaces[touristIndex].equals(deletedTouristPlace)){
		break;
}
}
if(touristIndex < noOfElements){
	noOfElements = noOfElements-1;
	for(int newTouristIndex = touristIndex; newTouristIndex < noOfElements; newTouristIndex++){
		touristPlaces[newTouristIndex] = touristPlaces[newTouristIndex+1];
	}
}
return noOfElements;
}
public static void getAllTouristPlacesPostDeletion(int newLength){
	for(int touristIndex=0; touristIndex<newLength; touristIndex++){
		System.out.println(touristPlaces[touristIndex]);
	}
		
		
}
}