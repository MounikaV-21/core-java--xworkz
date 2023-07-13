//class Metro{
//stationNames[] = {7}
//}

class Metro{
static String stationNames[] = {null, null, null, null, null, null, null};
static int index;

public static boolean saveStationNames(String station){
	boolean isSaved = false;
	if(stationNames.length>index){
	if(station != null && station.length()>0){
		stationNames[index] = station;
		index ++;
		isSaved = true;
		System.out.println("station added" +isSaved);
	}else{
		System.out.println("Cann't get station names as it is null");
	}
	}else{
		System.out.println("Array size has been reached cann't add station names");
		System.out.println(" ");
	}
	return isSaved;
}
public static void getAllStationNames(){
	for(int station=0; station<stationNames.length; station++){
		String refrence = stationNames[station];
		System.out.println("Access Station name " + refrence + " at " +station);
	}
	System.out.println("End saveStationNames");
	System.out.println(" ");
}

public static boolean updateStationNames(String existingStationName, String updatedStationName){
	boolean isUpdated = false;
	for(int stationIndex = 0; stationIndex<stationNames.length; stationIndex++){
		if(stationNames[stationIndex].equals(existingStationName)){
			stationNames[stationIndex] = updatedStationName;
			isUpdated = true;
}
	}
	return isUpdated;
}

public static int deleteStation(String deletedStation){
	boolean isDeleted = false;
	int stationIndex;
	int  noOfElements = stationNames.length;
for(stationIndex = 0; stationIndex<stationNames.length; stationIndex++){
	if(stationNames[stationIndex].equals(deletedStation)){
		break;
}
}
if(stationIndex < noOfElements){
	noOfElements = noOfElements-1;
	for(int newStationIndex = stationIndex; newStationIndex < noOfElements; newStationIndex++){
		stationNames[newStationIndex] = stationNames[newStationIndex+1];
	}
}
return noOfElements;
}
public static void getAllStationNamesPostDeletion(int newLength){
	for(int stationIndex=0; stationIndex<newLength; stationIndex++){
		System.out.println(stationNames[stationIndex]);
	}
		
		
}
}
	