class KarnatakaTester{
public static void main(String test[]){
Karnataka.saveCityNames("Bangalore");
Karnataka.saveCityNames("Udupi");
Karnataka.saveCityNames("Kolar");
Karnataka.saveCityNames("Mandya");
Karnataka.saveCityNames("Chikmagalur");
Karnataka.saveCityNames("Bidar");
Karnataka.saveCityNames("Bangalore");
Karnataka.getAllCityNames();

boolean isUpdated = Karnataka.updateCityName("Bangalore","Bengaluru");  
     System.out.println("Is city name updated "+isUpdated);	 
     Karnataka.getAllCityNames();
	 
	 int newLength = Karnataka.deleteCity("Udupi");
System.out.println("Calling all cityNames");

Karnataka.getAllCityNamesPostDeletion(newLength);

}
}