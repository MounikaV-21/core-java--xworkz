class SuperMarket2 {
   
   static String vegetables[] = {"potato","carrot","beans","brinjal","onion"};
   
   static String biscuits[] = {"Unibic","Hide n Seek","Parle G","BOurbone","Tiger","Chaska Maska","Jim Jam","Good Day","Moms Magic","Dark Fantacy"};
   
   static String perfumes[] = {"Engage","WattaGirl","Spinz","Fogg","Shine","Lotus","Axe", "Tommy Girl","Mysore Sandal","Eva"};
 
   static String groceries[] = {"Rice","Rava","Ragi","Green Gram","Moog Dal","Sugar","Noodles","Salt","Coffee Powder","Mustard"};
   
   static String cosmetics[] = {"Sun Screen","Primer","Lipstick","Foundation","Eyeliner","Mascara","Moisturizer","Lotion","Kajal","Compact","Nail polish remover","Nail Polish", "Lip liner", "Concealer", "Blush", "Gel","toner","Lotion","Lip Balm","Highlighter","Face Powder","Lip Gloss","Perfume","EyeShadow","Nail extension"};
   
   public static void main(String market[]){
	   
	   System.out.println("main Started");
   
  getVegetables();
  getPerfumes();
   getBiscuits();
   getgroceries();
   getCosmetics();
   
  System.out.println("main Ended");
   }
   
  
   
   
   // read - get fetch, read

public static void getVegetables(){
System.out.println("List of vegetables are: ");
   for(String vegetable : vegetables ){
   System.out.println(vegetable);
   }	
   System.out.println(" ");
}

  

   
   public static void getPerfumes(){
	    System.out.println("List of perfumes are: ");
   for(String perfume : perfumes){
   System.out.println(perfume);
   }
   System.out.println(" ");
   }
  
   
  
  
  public static void getBiscuits(){
   System.out.println("List of biscuits are: ");
   for(String biscuit : biscuits){
   System.out.println(biscuit);
  }
  System.out.println(" ");
  }
   
  
	
	public static void getgroceries(){
		 System.out.println("List of groceries are: ");
   for(String grocerie : groceries){
   System.out.println(grocerie);
}   
System.out.println(" ");
	}
   
	

public static void getCosmetics(){
System.out.println("List of cosmetics are");
	    for(String cosmetic : cosmetics){
		System.out.println(cosmetic);
		}
		System.out.println(" ");
}



}