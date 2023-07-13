class TeleCommTester{
public static void main(String test[]){
	TeleComm.addSim("Airtel");
	TeleComm.addSim("Jio");
	TeleComm.addSim("Idea");
	TeleComm.addSim("BSNL");
	TeleComm.addSim("Aircel");
	TeleComm.addSim("Vodafone");
	TeleComm.getAllSimNames();
	
	boolean isUpdated = TeleComm.updateSimName("Jio" , "Reliance Jio");
	System.out.println("Is Sim name updated " +isUpdated);
	TeleComm.getAllSimNames();
	
	int newLength = TeleComm.deleteSim("BSNL");
System.out.println("Calling all simNames");

TeleComm.getAllSimNamesPostDeletion(newLength);
}
}