class Books{
	
	public Books() {
		System.out.println("Books constructor is invoked");
}

String name;
double price;
String type;
String author;
String publicationName;
int noOfPages;

public Books(String name, double price, String type, String author, String publicationName, int noOfPages){
	this.name = name;
	this.price = price;
	this.type = type;
	this.author = author;
	this.publicationName = publicationName;
	this.noOfPages = noOfPages;
	
	System.out.println("Books Constructor is invoked");
}

public void gainKnowledge(){
	System.out.println("To gain knowledge");
}
}
