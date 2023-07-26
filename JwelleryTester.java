class JwelleryTester{

 public static void main(String jewellaries[]){
 
 /* Jwellery jewel = new Jwellery();
 jewel.name = "earings";
 jewel.type = "silver";
 jewel.price = 2000 ;
 jewel.grams = 3 ;
 jewel.toWear();
 System.out.println(jewel.name+" "+jewel.type+" "+jewel.price+" "+jewel.grams);
 System.out.println(" ");
 
 Jwellery jewel1 = new Jwellery();
 jewel1.name = "Nose pin ";
 jewel1.type = "Gold";
 jewel1.price = 1000;
 jewel1.grams = 2;
 jewel1.toWear();
 System.out.println(jewel1.name+" "+jewel1.type+" "+jewel1.price+" "+jewel1.grams);
 System.out.println(" ");
 
 Jwellery jewel2 = new Jwellery();
 jewel2.name = "Mangalsutra";
 jewel2.type = "gold";
 jewel2.price = 320000 ;
 jewel2.grams = 20 ;
 jewel2.toWear();
 System.out.println(jewel2.name+" "+jewel2.type+" "+jewel2.price+" "+jewel2.grams);
 System.out.println(" ");
 
 Jwellery jewel3 = new Jwellery();
 jewel3.name = "Necklace";
 jewel3.type = "gold";
 jewel3.price = 500000;
 jewel3.grams = 5;
 jewel3.toWear();
 System.out.println(jewel3.name+" "+jewel3.type+" "+jewel3.price+" "+jewel3.grams);
 System.out.println(" ");
 
 Jwellery jewel4 = new Jwellery();
 jewel4.name = "Pendants";
 jewel4.type = "silver";
 jewel4.price = 800 ;
 jewel4.grams = 4;
 jewel4.toWear();
 System.out.println(jewel4.name+" "+jewel4.type+" "+jewel4.price+" "+jewel4.grams);
 System.out.println(" ");
 
 Jwellery jewel5 = new Jwellery();
 jewel5.name = "Bracelets";
 jewel5.type = "silver";
 jewel5.price = 3000 ;
 jewel5.grams = 6 ;
 jewel5.toWear();
 System.out.println(jewel5.name+" "+jewel5.type+" "+jewel5.price+" "+jewel5.grams);
 System.out.println(" ");
 
 Jwellery jewel6 = new Jwellery();
 jewel6.name = "Bangles";
 jewel6.type = "gold";
 jewel6.price = 280000 ;
 jewel6.grams = 15 ;
 jewel6.toWear();
 System.out.println(jewel6.name+" "+jewel6.type+" "+jewel6.price+" "+jewel6.grams);
 System.out.println(" ");
 
 Jwellery jewel7 = new Jwellery();
 jewel7.name = "Anklets";
 jewel7.type = "silver";
 jewel7.price = 3000 ;
 jewel7.grams = 8 ;
 jewel7.toWear();
 System.out.println(jewel7.name+" "+jewel7.type+" "+jewel7.price+" "+jewel7.grams);
 System.out.println(" ");
 
 Jwellery jewel8 = new Jwellery();
 jewel8.name = "Rings";
 jewel8.type = "gold";
 jewel8.price = 10000 ;
 jewel8.grams = 2 ;
 jewel8.toWear();
 System.out.println(jewel8.name+" "+jewel8.type+" "+jewel8.price+" "+jewel8.grams);
 System.out.println(" ");
 
 Jwellery jewel9 = new Jwellery();
 jewel9.name = "Toe rings";
 jewel9.type = "silver";
 jewel9.price = 1000 ;
 jewel9.grams = 5 ;
 jewel9.toWear();
 System.out.println(jewel9.name+" "+jewel9.type+" "+jewel9.price+" "+jewel9.grams); */
 
 Jwellery jewel = new Jwellery("earings", "Silver", 200, 3);
	  System.out.println(jewel.name + ", " + jewel.type + ", " + jewel.price +" "+ jewel.grams);
	  jewel.toWear();
	  System.out.println(" "); 
	  
	  Jwellery jewel1 = new Jwellery("Nose pin", "Gold", 1000, 2);
	  System.out.println(jewel1.name + ", " + jewel1.type + ", " + jewel1.price +" "+ jewel1.grams);
	  jewel1.toWear();
	  System.out.println(" "); 
	  
	  Jwellery jewel2 = new Jwellery("Mangalsutra", "Gold", 320000, 20);
	  System.out.println(jewel2.name + ", " + jewel2.type + ", " + jewel2.price +" "+ jewel2.grams);
	  jewel2.toWear();
	  System.out.println(" "); 
	  
	  Jwellery jewel3 = new Jwellery("Necklace", "Gold", 500000, 5);
	  System.out.println(jewel3.name + ", " + jewel3.type + ", " + jewel3.price +" "+ jewel3.grams);
	  jewel3.toWear();
	  System.out.println(" "); 
	  
	  Jwellery jewel4 = new Jwellery("Pendants", "Silver", 800, 4);
	  System.out.println(jewel4.name + ", " + jewel4.type + ", " + jewel4.price +" "+ jewel4.grams);
	  jewel4.toWear();
	  System.out.println(" "); 
	  
	  Jwellery jewel5 = new Jwellery("Bracelets", "Silver", 3000, 6);
	  System.out.println(jewel5.name + ", " + jewel5.type + ", " + jewel5.price +" "+ jewel5.grams);
	  jewel5.toWear();
	  System.out.println(" "); 
	  
	  Jwellery jewel6 = new Jwellery("Bangles", "Gold", 280000, 15);
	  System.out.println(jewel6.name + ", " + jewel6.type + ", " + jewel6.price +" "+ jewel6.grams);
	  jewel6.toWear();
	  System.out.println(" "); 
	  
	  Jwellery jewel7 = new Jwellery("Anklets", "Silver", 3000, 8);
	  System.out.println(jewel7.name + ", " + jewel7.type + ", " + jewel7.price +" "+ jewel7.grams);
	  jewel7.toWear();
	  System.out.println(" "); 
	  
	  Jwellery jewel8 = new Jwellery("Rings", "Gold", 10000, 2);
	  System.out.println(jewel8.name + ", " + jewel8.type + ", " + jewel8.price +" "+ jewel8.grams);
	  jewel8.toWear();
	  System.out.println(" "); 
	  
	  Jwellery jewel9 = new Jwellery("Toe rings", "Silver", 1000, 5);
	  System.out.println(jewel9.name + ", " + jewel9.type + ", " + jewel9.price +" "+ jewel9.grams);
	  jewel9.toWear();
 
 
 }

}