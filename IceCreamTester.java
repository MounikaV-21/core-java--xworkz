class IceCreamTester{
public static void main(String test[]){
IceCream.getFlavours("Vennila");
IceCream.getFlavours("Chocolate");
IceCream.getFlavours("ButterScotch");
IceCream.getFlavours("Black Current");
IceCream.getFlavours("Oreo");
IceCream.getFlavours("Dark Chocolate");
IceCream.getFlavours("Blue Berry");
IceCream.getAllFlavours();

boolean isUpdated = IceCream.updateFlavours("Oreo", "StrawBerry");
System.out.println("Is flavour name updated" +isUpdated);
IceCream.getAllFlavours();

int newLength = IceCream.deleteFlavour("Oreo");
System.out.println("Calling all flavours");

IceCream.getAllFlavoursPostDeletion(newLength);

}
}