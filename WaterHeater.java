class WaterHeater{
	
	public WaterHeater() {
		System.out.println("WaterHeater constructor is invoked");
}

 String name;
 String capacity;
 int price;
 String color;
 
   public WaterHeater(String name, String capacity, int price, String color){
	this.name = name;
	this.capacity = capacity;
	this.price = price;
	this.color = color;
	
	System.out.println("WaterHeater Constructor is invoked");
}

 public void toHeatWater(){
	 System.out.println("WaterHeater is used to heat water");
 }
}