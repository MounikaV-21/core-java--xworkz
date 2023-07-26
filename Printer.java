class Printer{
	
	public Printer() {
		System.out.println("Printer constructor is invoked");
}

 String name;
 String type;
 int price;
 String origin;
 
 public Printer(String name, String type, int price, String origin){
	this.name = name;
	this.type = type;
	this.price = price;
	this.origin = origin;
	
	System.out.println("Printer constructor is invoked");
}
 
 public void toPrint(){
	 System.out.println("Printers to print");
 }
}