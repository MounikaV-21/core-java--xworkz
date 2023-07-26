class Bars{
	
	public Bars() {
		System.out.println("Bars constructor is invoked");
}
 
  String name;
  String type;
  String drinksAvailable;
  String address;
  
    public Bars(String name, String type, String drinksAvailable, String address){
	this.name = name;
	this.type = type;
	this.drinksAvailable = drinksAvailable;
	this.address = address;
	
	System.out.println("Bars Constructor is invoked");
}
  
  public void toHaveFun(){
	  System.out.println("Bars to have fun");
  }

}