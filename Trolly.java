class Trolly{
	
	public Trolly() {
		System.out.println("Trolly constructor is invoked");
}
	
 String name;	
 String trollyColor;
 int price;
 String weight;
 
  public Trolly(String name, String trollyColor, int price, String weight){
	this.name = name;
	this.trollyColor = trollyColor;
	this.price = price;
	this.weight = weight;
	
	System.out.println("Trolly Constructor is invoked");
}
 
 public void toTravel(){
 System.out.println(" Trolly is used for travel purpose");
 }


}