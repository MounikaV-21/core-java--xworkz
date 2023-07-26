class MusicalInstruments{
	
	public MusicalInstruments() {
		System.out.println("MusicalInstruments constructor is invoked");
}
 
 String name;
 String type;
 String color;
 int price;
 
 public MusicalInstruments(String name, String type, int price, String color){
	this.name = name;
	this.type = type;
	this.price = price;
	this.color = color;
	
	System.out.println("MusicalInstruments constructor is invoked");
}

 public void produceMusic(){
 System.out.println("MusicalInstruments produce music");
 
 }


}