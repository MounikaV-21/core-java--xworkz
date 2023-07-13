class Girias{


public static void main(String girias[]){
System.out.println("Main Started");
String electronicDevices[] = {"refrigerator", "washing Machine", "LED", "Grainder", "AC", "Iron Box", "Microwave"};
double priceOfElectronicDevices[] = {50000.00,40000.00,30000.50,10000.78,25000.78,55000.56,0.0,6000.64};

for(int index=0; index<electronicDevices.length;){
System.out.println(electronicDevices[index]);
index++;
}

for( String electronicDevice : electronicDevices ){
	System.out.println(electronicDevice);
}

for(double priceOfElectronicDevice : priceOfElectronicDevices){
	
System.out.println(priceOfElectronicDevice);
}




System.out.println("Main Ended");
}
} 
 

