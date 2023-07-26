class SuitCase{
	
	public SuitCase() {
		System.out.println("SuitCase constructor is invoked");
}
 
 String brandName;
 String weight;
 int price;
 int noOfCompartments;
 
 public SuitCase(String brandName, String weight, int price, int noOfCompartments){
	this.brandName = brandName;
	this.weight = weight;
	this.price = price;
	this.noOfCompartments = noOfCompartments;
	
	System.out.println("SuitCase constructor is invoked");
}
 
 public void forLuggage(){
  System.out.println("SuitCase for carrying luggage");

}

}