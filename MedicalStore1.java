//class MedicalStore{
//	medicineNames[] = 9
// }

class MedicalStore1{
static String medicineNames[] = {null, null, null, null, null, null, null, null, null};
static int index;

public static boolean addMedicines(String medicine){
boolean isAdded  = false;
// if is flexible
if(medicineNames.length>index){
if(medicine != null && medicine.length()>0){
medicineNames[index] = medicine;
index++;
isAdded = true;
System.out.println("medicine added" +isAdded);
}else{
System.out.println("Cann't get the Medicin names as it is null");
}
}else{
		System.out.println("Array size has been reached cann't add medicine names");
		System.out.println(" ");
	}
return isAdded;
}

public static void getAllMedicineNames(){
	for(int medicine=0; medicine<medicineNames.length; medicine++){
		String refrence = medicineNames[medicine];
		System.out.println("Access medicines " + refrence + " at " +medicine);
	}
System.out.println("End getAllMedicineNames");
System.out.println(" ");
}

public static boolean updateMedicineNames(String existingMedicineName, String updatedMedicineName){
	boolean isUpdated = false;
	for(int medicineIndex = 0; medicineIndex<medicineNames.length; medicineIndex++){
		if(medicineNames[medicineIndex].equals(existingMedicineName)){
			medicineNames[medicineIndex] = updatedMedicineName;
			isUpdated = true;
}	
	}
	return isUpdated;
}

public static int deleteMedicine(String deletedMedicine){
	boolean isDeleted = false;
	int medicineIndex;
	int  noOfElements = medicineNames.length;
for(medicineIndex = 0; medicineIndex<medicineNames.length; medicineIndex++){
	if(medicineNames[medicineIndex].equals(deletedMedicine)){
		break;
}
}
if(medicineIndex < noOfElements){
	noOfElements = noOfElements-1;
	for(int newMedicineIndex = medicineIndex; newMedicineIndex < noOfElements; newMedicineIndex++){
		medicineNames[newMedicineIndex] = medicineNames[newMedicineIndex+1];
	}
}
return noOfElements;
}
public static void getAllMedicineNamesPostDeletion(int newLength){
	for(int medicineIndex=0; medicineIndex<newLength; medicineIndex++){
		System.out.println(medicineNames[medicineIndex]);
	}
		
		
}
}