class Umbrella{
	
	public Umbrella() {
		System.out.println("Umbrella constructor is invoked");
}

String brand;
String pattern;
String frameMaterial;
int price;

 public Umbrella(String brand, String pattern, String frameMaterial, int price){
	this.brand = brand;
	this.pattern = pattern;
	this.frameMaterial = frameMaterial;
	this.price = price;
	
	System.out.println("Umbrella Constructor is invoked");
}

public void forRain(){
System.out.println(" protected from rain");	
	
	
	
}









}