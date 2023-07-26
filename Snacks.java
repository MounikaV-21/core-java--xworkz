class Snacks{
	
	public Snacks() {
		System.out.println("Snacks constructor is invoked");
}

 String name;
 String type;
 int price;
 String quantity;
 
  public Snacks(String name, String type, int price, String quantity){
	this.name = name;
	this.type = type;
	this.price = price;
	this.quantity = quantity;
	
	System.out.println("Snacks Constructor is invoked");
}
 
 public void toEat(){
	 System.out.println("Snacks to enjoy");
 }

}