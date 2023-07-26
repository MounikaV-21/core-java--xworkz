class Helmet{
	
	public Helmet() {
		System.out.println("Helmet constructor is invoked");
}
 
 String name;
 String type;
 int price;
 String color;
 
  public Helmet(String name, String typre, int price, String color){
	this.name = name;
	this.type = type;
	this.price = price;
	this.color = color;
	
	System.out.println("Helmet Constructor is invoked");
}
 
 public void forSafety(){
	 System.out.println("Helmets for safe driving");
 }
 
}
