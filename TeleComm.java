class TeleComm{
static String simNames[] = {null, null, null, null, null};
static int index;

public static boolean addSim(String sim){
	boolean isAdded = false;
	if(simNames.length>index){
	if(sim != null && sim.length()>0){
		simNames[index] = sim;
		index++;
		isAdded = true;
		System.out.println("sim added " + isAdded);
		
	}else{
		System.out.println("Cann't add sim names as it is null");
	}
	}else{
		System.out.println("Array size has been reached cann't add city name");
		System.out.println(" ");
	}
	return isAdded;	
}

public static void getAllSimNames(){
	System.out.println("Invoking getAllSimNames");
	
	for(int sim=0; sim<simNames.length; sim++){
	String refrence = simNames[sim];
	System.out.println("access sim " + refrence +  " at "  +sim);
}
System.out.println("End getAllSimNames");
System.out.println(" ");
}

public static boolean updateSimName(String existingSimName, String updatedSimName){
boolean isUpdated = false;
for(int simIndex = 0; simIndex < simNames.length; simIndex++){
if(simNames[simIndex].equals(existingSimName)){
simNames[simIndex] = updatedSimName;
isUpdated = true;
}
}
return isUpdated;
}

public static int deleteSim(String deletedSim){
	boolean isDeleted = false;
	int simIndex;
	int  noOfElements = simNames.length;
for(simIndex = 0; simIndex<simNames.length; simIndex++){
	if(simNames[simIndex].equals(deletedSim)){
		break;
}
}
if(simIndex < noOfElements){
	noOfElements = noOfElements-1;
	for(int newSimIndex = simIndex; newSimIndex < noOfElements; newSimIndex++){
		simNames[newSimIndex] = simNames[newSimIndex+1];
	}
}
return noOfElements;
}
public static void getAllSimNamesPostDeletion(int newLength){
	for(int simIndex=0; simIndex<newLength; simIndex++){
		System.out.println(simNames[simIndex]);
	}
		
		
}
}
