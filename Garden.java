class Garden{
	
static String flowerNames[] = {null, null, null, null, null};
static int index;

public static boolean saveFlower(String flower){
	boolean isSaved = false;
	if(flowerNames.length>index){
	if(flower != null && flower.length()>0){
		flowerNames[index] = flower;
		index++;
		isSaved = true;
		System.out.println("flower added " + isSaved);
	}else{
		System.out.println("Cann't save flower names as it is null");
	}
	}else{
		System.out.println("Array size has been reached, cann't add flower");
		System.out.println(" ");
	}
	return isSaved;
	
}

public static void getAllFlowerNames(){
System.out.println("Invoking getAllFlowerNames");

for(int flower=0; flower<flowerNames.length; flower++){
	String refrence = flowerNames[flower];
	System.out.println("access flower " + refrence +  " at "  +flower);
}
System.out.println("End getAllFlowerNames");
System.out.println(" ");
}
public static boolean updateFlowerNames(String existingFlowerName, String updatedFlowerName){
	boolean isUpdated = false;
	for(int flowerIndex = 0; flowerIndex < flowerNames.length; flowerIndex++){
		if(flowerNames[flowerIndex].equals(existingFlowerName)){
			flowerNames[flowerIndex] = updatedFlowerName;
			isUpdated = true;
}
}
	return isUpdated;
}

public static int deleteFlower(String deletedFlower){
	boolean isDeleted = false;
	int flowerIndex;
	int  noOfElements = flowerNames.length;
for(flowerIndex = 0; flowerIndex<flowerNames.length; flowerIndex++){
	if(flowerNames[flowerIndex].equals(deletedFlower)){
		break;
}
}
if(flowerIndex < noOfElements){
	noOfElements = noOfElements-1;
	for(int newFlowerIndex = flowerIndex; newFlowerIndex < noOfElements; newFlowerIndex++){
		flowerNames[newFlowerIndex] = flowerNames[newFlowerIndex+1];
	}
}
return noOfElements;
}
public static void getAllFlowerNamesPostDeletion(int newLength){
	for(int flowerIndex=0; flowerIndex<newLength; flowerIndex++){
		System.out.println(flowerNames[flowerIndex]);
	}
		
		
}
}
	
