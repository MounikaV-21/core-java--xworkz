class Radio {
	
	public Radio() {
		System.out.println("Radio constructor is invoked");
}

  String brandName;
  String connectivityTechnology;
  int price;
  String color;
  
  public Radio(String brandName, String connectivityTechnology, int price, String color){
	this.brandName = brandName;
	this.connectivityTechnology = connectivityTechnology;
	this.price = price;
	this.color = color;
	
	System.out.println("Radio Constructor is invoked");
}
  
  public void playSongs(){
  System.out.println("Listening songs using radio");
  }
}