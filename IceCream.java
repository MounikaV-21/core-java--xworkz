class IceCream{
	
 
static String flavours[] = {null, null, null,null, null, null};
static int index; 
//Create
public static boolean getFlavours(String flavour){
	boolean isGet = false;
	if(flavours.length>index){
	if(flavour != null && flavour.length()>0){
		flavours[index] = flavour;
		index++;
		isGet = true;
		System.out.println("flavour added" +isGet);
	}else{
		System.out.println("Cann't get flower names as it is null");
	}
	}else{
		System.out.println("Array size has been reached cann't add flavours");
		System.out.println(" ");
	}
	return isGet;
}
//Read
public static void getAllFlavours(){
System.out.println("Invoking getAllFlavours");

for(int flavour=0; flavour<flavours.length; flavour++){
	String refrence = flavours[flavour];
	System.out.println("Access Flavour " + refrence + " at " +flavour);
}
System.out.println("End getAllFlavours");
System.out.println(" ");
}
//Update
public static boolean updateFlavours(String existingFlavourName, String updatedFlavourName){
	boolean isUpdated = false;
	for(int flavourIndex = 0; flavourIndex<flavours.length; flavourIndex++){
		if(flavours[flavourIndex].equals(existingFlavourName)){
			flavours[flavourIndex] = updatedFlavourName;
			isUpdated = true;
}
	}
	return isUpdated;
}
//delete
public static int deleteFlavour(String deletedFlavour){
	boolean isDeleted = false;
	int flavourIndex;
	int  noOfElements = flavours.length;
for(flavourIndex = 0; flavourIndex<flavours.length; flavourIndex++){
	if(flavours[flavourIndex].equals(deletedFlavour)){
		break;
}
}
if(flavourIndex < noOfElements){
	noOfElements = noOfElements-1;
	for(int newFlavourIndex = flavourIndex; newFlavourIndex < noOfElements; newFlavourIndex++){
		flavours[newFlavourIndex] = flavours[newFlavourIndex+1];
	}
}
return noOfElements;
}
public static void getAllFlavoursPostDeletion(int newLength){
	for(int flavourIndex=0; flavourIndex<newLength; flavourIndex++){
		System.out.println(flavours[flavourIndex]);
	}
		
		
}
}









	
