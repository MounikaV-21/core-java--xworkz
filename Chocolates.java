class Chocolates{
	
	public Chocolates() {
		System.out.println("Chocolates constructor is invoked");
}
 
  String name;
  String flavour;
  int quantity;
  int price;
  String color;
  
  public Chocolates(String name, String flavour, int price, int quantity, String color){
	this.name = name;
	this.flavour = flavour;
	this.quantity = quantity;
	this.price = price;
	this.color = color;
	
	System.out.println("Chocolates Constructor is invoked");
}
  
  public void toGetCalories(){
  System.out.println("Chocloates helps to gain calories");
  
  }


}