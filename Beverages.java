class Beverages{
	
	public Beverages() {
		System.out.println("Beverages constructor is invoked");
}
 
 String name;
 String flavour;
 String type;
 String color;
 
  public Beverages(String name, String flavour, String type, String color){
	this.name = name;
	this.flavour = flavour;
	this.type = type;
	this.color = color;
	
	System.out.println("Beverages Constructor is invoked");
}
 
 public void toDrink(){
	 System.out.println("Beverages to drink");
 }
 
}