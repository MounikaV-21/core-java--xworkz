class Wallet{
	
	public Wallet() {
		System.out.println("Wallet constructor is invoked");
}
	
 String name;
 String walletMaterialType;
 String contryOfOrigin;
 int price;
 
  public Wallet(String name, String walletMaterialType, String contryOfOrigin, int price){
	this.name = name;
	this.walletMaterialType = walletMaterialType;
	this.contryOfOrigin = contryOfOrigin;
	this.price = price;
	
	System.out.println("Wallet constructor is invoked");
}

public void forSafety(){
System.out.println("wallet is used for carrying amount and cards");


}

}