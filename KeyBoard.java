class KeyBoard{

static String brandName ;
   static  int price ;
    static String size ;
	static String type;
	static String connectivityTechnology ;
	static String warranty ;
	static boolean multiDevicePairing;
	 

  public static void main(String keyboard[]){
  
    
	 
	 String brandName = "Portronics";
     int price = 2500;
     String size = "12.45 inches";
	 String type = "wireless";
	 String connectivityTechnology = "Blutooth";
	 String warranty = "3 months";
	 boolean multiDevicePairing = true;
	 
	 
	 
	  System.out.println("The brandName is "+ brandName);
      System.out.println("The price is "+ price);
      System.out.println("The size is "+ size);
	  System.out.println("The type is "+ type);
	  System.out.println("The connectivityTechnology is "+ connectivityTechnology);
	  System.out.println("The warranty is "+ warranty);
	  System.out.println("The multiDevicePairing is "+ multiDevicePairing);
   
  }
}