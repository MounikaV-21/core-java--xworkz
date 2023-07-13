class MetroTester{
public static void main(String test[]){
	Metro.saveStationNames("Rajajinagar");
	Metro.saveStationNames("Banashankari");
	Metro.saveStationNames("Magadi");
	Metro.saveStationNames("Vijaynagar");
	Metro.saveStationNames("JP Nagar");
	Metro.saveStationNames("MG Road");
	Metro.saveStationNames("Mejestic");
	Metro.saveStationNames("Silk Institute");
	Metro.getAllStationNames();
	
	boolean isUpdated = Metro.updateStationNames("JP Nagar", "JayaPrakash Nagar");
System.out.println("Is station name updated" +isUpdated);
Metro.getAllStationNames();

 int newLength = Metro.deleteStation("Magadi");
System.out.println("Calling all stationNames");

Metro.getAllStationNamesPostDeletion(newLength);
}
}