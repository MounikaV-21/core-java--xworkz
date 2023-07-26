class SwitchBoard{

String brandName;
int noOfSwitches;
String color;
String type;
double price;

/* public SwitchBoard(String bn, int nOS, String clr, String tp, double pr){
	brandName = bn;
	noOfSwitches = nOS;
	color = clr;
	type = tp;
	price = pr;
	
	System.out.println("SwitchBoard Constructor is invoked"); 
} */

//Parameterized constructor
public SwitchBoard(String brandName, int noOfSwitches, String color, String type, double price){
	this.brandName = brandName;
	this.noOfSwitches = noOfSwitches;
	this.color = color;
	this.type = type;
	this.price = price;
	
	System.out.println("SwitchBoard Constructor is invoked");
}

public void provideElectricity(){
	System.out.println("To supply electricity");
}
}