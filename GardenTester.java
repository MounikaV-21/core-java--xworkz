class GardenTester{
public static void main(String test[]){
	Garden.saveFlower("Sun Flower");
	Garden.saveFlower("Lilly");
	Garden.saveFlower("Lotus");
	Garden.saveFlower("Rose");
	Garden.saveFlower("Jasmine");
	Garden.saveFlower("Tulip");
	Garden.getAllFlowerNames();
	
	boolean isUpdated = Garden.updateFlowerNames("Rose", "Yellow Rose");
	System.out.println("Is flower name Updated " +isUpdated);
	Garden.getAllFlowerNames();
	
	int newLength = Garden.deleteFlower("Jasmine");
System.out.println("Calling all flowerNames");

Garden.getAllFlowerNamesPostDeletion(newLength);
}
}