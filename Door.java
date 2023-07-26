class Door{
	
	public Door() {
		System.out.println("Door constructor is invoked");
}

 String Brand;
 String material;
 int price;
 String lockType;
 
  public Door(String Brand, String material, int price, String lockType){
	this.Brand = Brand;
	this.material = material;
	this.price = price;
	this.lockType = lockType;
	
	System.out.println("Door Constructor is invoked");
}
 
 public void security(){
 System.out.println("Door for security");
 
 }


}