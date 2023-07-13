class TravelAgencyTester{
public static void main(String test[]){
	//Create, Save, Add
TravelAgency.addTouristPlaces("Coorg");
TravelAgency.addTouristPlaces("Manali");
TravelAgency.addTouristPlaces("Ooty");
TravelAgency.addTouristPlaces("Goa");
TravelAgency.addTouristPlaces("Munnar");
TravelAgency.addTouristPlaces("Agra");
TravelAgency.addTouristPlaces("Kedarnath");
TravelAgency.addTouristPlaces("Varanasi");
TravelAgency.addTouristPlaces("Chikkamagaluru");
// Read, get, fetch
TravelAgency.getAllTouristPlaces();
// Update, edit
boolean isUpdated = TravelAgency.updateTouristPlaces("Agra", "Delhi");
System.out.println("Is tourist place updated" +isUpdated);
TravelAgency.getAllTouristPlaces();

 int newLength = TravelAgency.deleteTouristPlace("Agra");
System.out.println("Calling all Tourist Places");

TravelAgency.getAllTouristPlacesPostDeletion(newLength);
}
}