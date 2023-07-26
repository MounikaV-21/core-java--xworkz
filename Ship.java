class Ship{
	
	public Ship() {
		System.out.println("Ship constructor is invoked");
}

  String name;
  String purpose;
  int noOfCompartments;
  
  public Ship(String name, String purpose, int noOfCompartments){
	this.name = name;
	this.purpose = purpose;
	this.noOfCompartments = noOfCompartments;
	
	System.out.println("Ship Constructor is invoked");
}
  
  public void toSailShips(){
  System.out.println("Ships always sail on water");
  }
}