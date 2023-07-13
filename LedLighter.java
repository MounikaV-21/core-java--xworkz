class LedLighter{

 static String material;
  static int price;
  static String chargingTime;
  static String systemReq;
 static  boolean isRechargeble;
  

      public static void main(String LedLighter[]){
		  
		  
		  String material="metal";
   int price=1195;
   String chargingTime="30min";
   String systemReq="USB";
   boolean isRechargeble=true;
		  
		  
	  
	    System.out.println(" The LedLighter  Price is "+ price);
		System.out.println(" Is LedLighter rechargeble "+ isRechargeble );
        System.out.println(" The LedLighter material is" + material);
        System.out.println("The LedLighter system requirements is " + systemReq);		
	    System.out.println("The LedLighter charging time is " + chargingTime);
	 }
}