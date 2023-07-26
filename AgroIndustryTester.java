class AgroIndustryTester{

public static void main(String agroIndustry[]){
	
	//object creation logic
	//allocate a memory
	//invoke constructor of class
	//ref variable
   
	  /* System.out.println("Creating 1st copy of agroIndustry");
	  AgroIndustry agroIndustry1 = new AgroIndustry();
	  agroIndustry1.name = "Nisarga Farms";
	  agroIndustry1.type = "Textile Industry";
	  agroIndustry1.quantityProducedInKg = 200;
	  agroIndustry1.toProduceRawMaterials();
	  System.out.println(agroIndustry1.name + ", " + agroIndustry1.type + ", " + agroIndustry1.quantityProducedInKg);
	  System.out.println(" ");

	  
	  System.out.println("Creating 2nd copy of agroIndustry");
	  AgroIndustry agroIndustry2 = new AgroIndustry();
	  agroIndustry2.name = "Farmed Goods";
	  agroIndustry2.type = "Sugar Industry";
	  agroIndustry2.quantityProducedInKg = 130;
	  agroIndustry2.toProduceRawMaterials();
	  System.out.println(agroIndustry2.name + ", " + agroIndustry2.type + ", " + agroIndustry2.quantityProducedInKg);
	  System.out.println(" ");

	  
	  System.out.println("Creating 3rd copy of agroIndustry");
	  AgroIndustry agroIndustry3 = new AgroIndustry();
	  agroIndustry3.name = "Pastures Place";
	  agroIndustry3.type = "Vegetable Oil Industry";
	  agroIndustry3.quantityProducedInKg = 210;
	  agroIndustry3.toProduceRawMaterials();
	  System.out.println(agroIndustry3.name + ", " + agroIndustry3.type + ", " + agroIndustry3.quantityProducedInKg);
	  System.out.println(" ");

	  
	  System.out.println("Creating 4th copy of agroIndustry");
	  AgroIndustry agroIndustry4 = new AgroIndustry();
	  agroIndustry4.name = "The Friendly Farm";
	  agroIndustry4.type = "Tea Industry";
	  agroIndustry4.quantityProducedInKg = 115;
	  agroIndustry4.toProduceRawMaterials();
	  System.out.println(agroIndustry4.name + ", " + agroIndustry4.type + ", " + agroIndustry4.quantityProducedInKg);
	  System.out.println(" ");

	  
	  System.out.println("Creating 5th copy of agroIndustry");
	  AgroIndustry agroIndustry5 = new AgroIndustry();
	  agroIndustry5.name = "Natural Farms";
	  agroIndustry5.type = "Coffee Industry";
	  agroIndustry5.quantityProducedInKg = 245;
	  agroIndustry5.toProduceRawMaterials();
	  System.out.println(agroIndustry5.name + ", " + agroIndustry5.type + ", " + agroIndustry5.quantityProducedInKg);
	  System.out.println(" ");

	  
	  System.out.println("Creating 6th copy of agroIndustry");
	  AgroIndustry agroIndustry6 = new AgroIndustry();
	  agroIndustry6.name = "Fortune Farms";
	  agroIndustry6.type = "Leather Goods Industry";
	  agroIndustry6.quantityProducedInKg = 170;
	  agroIndustry6.toProduceRawMaterials();
	  System.out.println(agroIndustry6.name + ", " + agroIndustry6.type + ", " + agroIndustry6.quantityProducedInKg);
	  System.out.println(" ");

	  
	  System.out.println("Creating 7th copy of agroIndustry");
	  AgroIndustry agroIndustry7 = new AgroIndustry();
	  agroIndustry7.name = "Joy Farms";
	  agroIndustry7.type = "Textile Industry";
	  agroIndustry7.quantityProducedInKg = 99;
	  agroIndustry7.toProduceRawMaterials();
	  System.out.println(agroIndustry7.name + ", " + agroIndustry7.type + ", " + agroIndustry7.quantityProducedInKg);
	  System.out.println(" ");

	  
	  System.out.println("Creating 8th copy of agroIndustry");
	  AgroIndustry agroIndustry8 = new AgroIndustry();
	  agroIndustry8.name = "Peak Pastures";
	  agroIndustry8.type = "Sugar Industry";
	  agroIndustry8.quantityProducedInKg = 166;
	  agroIndustry8.toProduceRawMaterials();
	  System.out.println(agroIndustry8.name + ", " + agroIndustry8.type + ", " + agroIndustry8.quantityProducedInKg);
	  System.out.println(" ");

	  
	  System.out.println("Creating 9th copy of agroIndustry");
	  AgroIndustry agroIndustry9 = new AgroIndustry();
	  agroIndustry9.name = "Glow Farms";
	  agroIndustry9.type = "Vegetable Oil Industry";
	  agroIndustry9.quantityProducedInKg = 300;
	  agroIndustry9.toProduceRawMaterials();
	  System.out.println(agroIndustry9.name + ", " + agroIndustry9.type + ", " + agroIndustry9.quantityProducedInKg);
	  System.out.println(" ");

	  
	  System.out.println("Creating 10th copy of agroIndustry");
	  AgroIndustry agroIndustry10 = new AgroIndustry();
	  agroIndustry10.name = "Naamdaari Farms";
	  agroIndustry10.type = "Coffee Industry";
	  agroIndustry10.quantityProducedInKg = 104;
	  agroIndustry10.toProduceRawMaterials();
	  System.out.println(agroIndustry10.name + ", " + agroIndustry10.type + ", " + agroIndustry10.quantityProducedInKg); */
	  
	   AgroIndustry agroIndustry1 = new AgroIndustry("Nisarga Farms", "Textile Industry", 200);
	  System.out.println(agroIndustry1.name + ", " + agroIndustry1.type + ", " + agroIndustry1.quantityProducedInKg);
	  agroIndustry1.toProduceRawMaterials();
	  System.out.println(" ");
	  
	  AgroIndustry agroIndustry2 = new AgroIndustry("Farmed Goods", "Sugar Industry", 130);
	  System.out.println(agroIndustry2.name + ", " + agroIndustry2.type + ", " + agroIndustry2.quantityProducedInKg);
	  agroIndustry2.toProduceRawMaterials();
	  System.out.println(" ");
	  
	  AgroIndustry agroIndustry3 = new AgroIndustry("Pastures Place", "Vegetable Oil Industry", 210);
	  System.out.println(agroIndustry3.name + ", " + agroIndustry3.type + ", " + agroIndustry3.quantityProducedInKg);
	  agroIndustry3.toProduceRawMaterials();
	  System.out.println(" ");
	  
	  AgroIndustry agroIndustry4 = new AgroIndustry("The Friendly Farm", "Tea Industry", 115);
	  System.out.println(agroIndustry4.name + ", " + agroIndustry4.type + ", " + agroIndustry4.quantityProducedInKg);
	  agroIndustry4.toProduceRawMaterials();
	  System.out.println(" ");
	  
	  AgroIndustry agroIndustry5 = new AgroIndustry("Natural Farms", "Coffee Industry", 245);
	  System.out.println(agroIndustry5.name + ", " + agroIndustry5.type + ", " + agroIndustry5.quantityProducedInKg);
	  agroIndustry4.toProduceRawMaterials();
	  System.out.println(" ");
	  
	  AgroIndustry agroIndustry6 = new AgroIndustry("Fortune Farms", "Leather Goods Industry", 170);
	  System.out.println(agroIndustry6.name + ", " + agroIndustry6.type + ", " + agroIndustry6.quantityProducedInKg);
	  agroIndustry6.toProduceRawMaterials();
	  System.out.println(" ");
	  
	  AgroIndustry agroIndustry7 = new AgroIndustry("Joy Farms", "Texttile Industry", 99);
	  System.out.println(agroIndustry7.name + ", " + agroIndustry7.type + ", " + agroIndustry7.quantityProducedInKg);
	  agroIndustry7.toProduceRawMaterials();
	  System.out.println(" ");
	  
	  AgroIndustry agroIndustry8 = new AgroIndustry("Peak Pastures", "Sugar Industry", 116);
	  System.out.println(agroIndustry8.name + ", " + agroIndustry8.type + ", " + agroIndustry8.quantityProducedInKg);
	  agroIndustry8.toProduceRawMaterials();
	  System.out.println(" ");
	  
	  AgroIndustry agroIndustry9 = new AgroIndustry("Glow Farms", "Vegetable Oil Industry", 300);
	  System.out.println(agroIndustry9.name + ", " + agroIndustry9.type + ", " + agroIndustry9.quantityProducedInKg);
	  agroIndustry9.toProduceRawMaterials();
	  System.out.println(" ");
	  
	  AgroIndustry agroIndustry10 = new AgroIndustry("Naamdaari Farms", "Coffee Industry", 104);
	  System.out.println(agroIndustry10.name + ", " + agroIndustry10.type + ", " + agroIndustry10.quantityProducedInKg);
	  agroIndustry4.toProduceRawMaterials();
	  
}

}