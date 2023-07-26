class AgroIndustry{
	
	//default constructor
	/* public AgroIndustry() { 
		System.out.println("AgroIndustry constructor is invoked");
} */

 // insatnce variables
  String name;
  String type;
  int quantityProducedInKg; 
  
  public AgroIndustry(String name, String type, int quantityProducedInKg){
	this.name = name;
	this.type = type;
	this.quantityProducedInKg = quantityProducedInKg;
	
	
	System.out.println("AgroIndustry Constructor is invoked");
}
  //instance method
  public void toProduceRawMaterials(){
  System.out.println("Agro industries have agricultural produce as raw material");
  }
}