class SuitCaseTester{
 
public static void main(String suite[]){
	
 /* SuitCase suitCase = new SuitCase();
 suitCase.brandName = "Delsey";
 suitCase.weight = "5kg";
 suitCase.price = 5000;
 suitCase.noOfCompartments = 3;
 suitCase.forLuggage();
 System.out.println(suitCase.brandName+" "+suitCase.weight+" "+suitCase.price+" "+suitCase.noOfCompartments);
 System.out.println(" ");
 
 SuitCase suitCase1 = new SuitCase();
 suitCase1.brandName = "American Tourister";
 suitCase1.weight = "7kg";
 suitCase1.price = 7000;
 suitCase1.noOfCompartments = 5;
 suitCase1.forLuggage();
 System.out.println(suitCase1.brandName+" "+suitCase1.weight+" "+suitCase1.price+" "+suitCase1.noOfCompartments);
 System.out.println(" ");

 SuitCase suitCase2 = new SuitCase();
 suitCase2.brandName = "Wildcraft";
 suitCase2.weight = "8kg";
 suitCase2.price = 8000;
 suitCase2.noOfCompartments = 6;
 suitCase2.forLuggage();
 System.out.println(suitCase2.brandName+" "+suitCase2.weight+" "+suitCase2.price+" "+suitCase2.noOfCompartments);
 System.out.println(" ");

 SuitCase suitCase3 = new SuitCase();
 suitCase3.brandName = "Tumi";
 suitCase3.weight = "4kg";
 suitCase3.price = 1000;
 suitCase3.noOfCompartments = 5;
 suitCase3.forLuggage();
 System.out.println(suitCase3.brandName+" "+suitCase3.weight+" "+suitCase3.price+" "+suitCase3.noOfCompartments);
 System.out.println(" ");

 SuitCase suitCase4 = new SuitCase();
 suitCase4.brandName = "Samsonite";
 suitCase4.weight = "5kg";
 suitCase4.price = 5000;
 suitCase4.noOfCompartments = 8;
 suitCase4.forLuggage();
 System.out.println(suitCase4.brandName+" "+suitCase4.weight+" "+suitCase4.price+" "+suitCase4.noOfCompartments);
 System.out.println(" ");

 SuitCase suitCase5 = new SuitCase();
 suitCase5.brandName = "Monos";
 suitCase5.weight = "6kg";
 suitCase5.price = 9000;
 suitCase5.noOfCompartments = 5;
 suitCase5.forLuggage();
 System.out.println(suitCase5.brandName+" "+suitCase5.weight+" "+suitCase5.price+" "+suitCase5.noOfCompartments);
 System.out.println(" ");

 SuitCase suitCase6 = new SuitCase();
 suitCase6.brandName = "Away";
 suitCase6.weight = "7kg";
 suitCase6.price = 6000;
 suitCase6.noOfCompartments = 4;
 suitCase6.forLuggage();
 System.out.println(suitCase6.brandName+" "+suitCase6.weight+" "+suitCase6.price+" "+suitCase6.noOfCompartments);
 System.out.println(" ");

 SuitCase suitCase7 = new SuitCase();
 suitCase7.brandName = "Paravel";
 suitCase7.weight = "4kg";
 suitCase7.price = 7900;
 suitCase7.noOfCompartments = 6;
 suitCase7.forLuggage();
 System.out.println(suitCase7.brandName+" "+suitCase.weight+" "+suitCase7.price+" "+suitCase7.noOfCompartments);
 System.out.println(" ");

 SuitCase suitCase8 = new SuitCase();
 suitCase8.brandName = "Calpak";
 suitCase8.weight = "6kg";
 suitCase8.price = 10000;
 suitCase8.noOfCompartments = 5;
 suitCase8.forLuggage();
 System.out.println(suitCase8.brandName+" "+suitCase8.weight+" "+suitCase8.price+" "+suitCase8.noOfCompartments);
 System.out.println(" ");

 SuitCase suitCase9 = new SuitCase();
 suitCase9.brandName = "Travelpro";
 suitCase9.weight = "4kg";
 suitCase9.price = 10000;
 suitCase9.noOfCompartments = 5;
 suitCase9.forLuggage();
 System.out.println(suitCase9.brandName+" "+suitCase9.weight+" "+suitCase9.price+" "+suitCase9.noOfCompartments);
 System.out.println(" "); */
 
 SuitCase suitCase = new SuitCase("Delsey ", "5kg", 500, 3);
	  System.out.println(suitCase.brandName + ", " + suitCase.weight + ", " + suitCase.price +" "+ suitCase.noOfCompartments);
	  suitCase.forLuggage();
	  System.out.println(" ");
 
 SuitCase suitCase1 = new SuitCase("American Tourister", "7kg", 700, 5);
	  System.out.println(suitCase1.brandName + ", " + suitCase1.weight + ", " + suitCase1.price +" "+ suitCase1.noOfCompartments);
	  suitCase1.forLuggage();
	  System.out.println(" ");
	  
	  SuitCase suitCase2 = new SuitCase("Wildcraft", "8kg", 800, 6);
	  System.out.println(suitCase2.brandName + ", " + suitCase2.weight + ", " + suitCase2.price +" "+ suitCase2.noOfCompartments);
	  suitCase2.forLuggage();
	  System.out.println(" ");
	  
	  SuitCase suitCase3 = new SuitCase("Tumi ", "4kg", 1000, 5);
	  System.out.println(suitCase3.brandName + ", " + suitCase3.weight + ", " + suitCase3.price +" "+ suitCase3.noOfCompartments);
	  suitCase3.forLuggage();
	  System.out.println(" ");
	  
	  SuitCase suitCase4 = new SuitCase("Samsonite ", "5kg", 5000, 8);
	  System.out.println(suitCase4.brandName + ", " + suitCase4.weight + ", " + suitCase4.price +" "+ suitCase4.noOfCompartments);
	  suitCase4.forLuggage();
	  System.out.println(" ");
	  
	  SuitCase suitCase5 = new SuitCase("Monos ", "6kg", 9000, 5);
	  System.out.println(suitCase5.brandName + ", " + suitCase5.weight + ", " + suitCase5.price +" "+ suitCase5.noOfCompartments);
	  suitCase5.forLuggage();
	  System.out.println(" ");
	  
	  SuitCase suitCase6 = new SuitCase("Away ", "7kg", 6000, 4);
	  System.out.println(suitCase6.brandName + ", " + suitCase6.weight + ", " + suitCase6.price +" "+ suitCase6.noOfCompartments);
	  suitCase6.forLuggage();
	  System.out.println(" ");
	  
	  SuitCase suitCase7 = new SuitCase("Paravel ", "4kg", 7900, 6);
	  System.out.println(suitCase7.brandName + ", " + suitCase7.weight + ", " + suitCase7.price +" "+ suitCase7.noOfCompartments);
	  suitCase7.forLuggage();
	  System.out.println(" ");
	  
	  SuitCase suitCase8 = new SuitCase("Calpak ", "6kg", 1000, 5);
	  System.out.println(suitCase8.brandName + ", " + suitCase8.weight + ", " + suitCase8.price +" "+ suitCase8.noOfCompartments);
	  suitCase8.forLuggage();
	  System.out.println(" ");
	  
	  SuitCase suitCase9 = new SuitCase("Travelpro ", "4kg", 1000, 5);
	  System.out.println(suitCase9.brandName + ", " + suitCase9.weight + ", " + suitCase9.price +" "+ suitCase9.noOfCompartments);
	  suitCase9.forLuggage();
	  System.out.println(" ");
}
}