class Jwellery{
	
	public Jwellery() {
		System.out.println("Jwellery constructor is invoked");
}

 String name;
 String type;
 double price;
 double grams;
 
  public Jwellery(String name, String type, double price, double grams){
	this.name = name;
	this.type = type;
	this.price = price;
	this.grams = grams;
	
	System.out.println("Jwellery constructor is invoked");
}
 
 public void toWear(){
  System.out.println("Jewells look attractive");
 }

}