
class Zomoto{
	
	//implementation
public static double search(String foodName){  //Method Signature
if("Pizza" == foodName){
System.out.println("Search food name is "+ foodName);
return 99.00;   
}
if("Chicken Biriyani" == foodName){
	System.out.println("Search food name is "+ foodName);
return 245.90;
}
if("Veg Biriyani" == foodName){
	System.out.println("Search food name is "+ foodName);
return 140.70;
}
if("Burger" == foodName){
	System.out.println("Search food name is "+ foodName);
return 100.80;
}
if("Chicken Fry" == foodName){
	System.out.println("Search food name is "+ foodName);
return 150.00;
}
if("Butter naan" == foodName){
	System.out.println("Search food name is "+ foodName);
return 45.00;
}
if("Roti" == foodName){
	System.out.println("Search food name is "+ foodName);
return 50.10;
}
if("Egg biriyani" == foodName){
	System.out.println("Search food name is "+ foodName);
return 200.20;
}
if("Paneer biriyani" == foodName){
	System.out.println("Search food name is "+ foodName);
return 180.00;
}
if("Veg Fried Rice" == foodName){
	System.out.println("Search food name is "+ foodName);
return 170.00;
}
if("Egg rice" == foodName){
	System.out.println("Search food name is "+ foodName);
return 125.05;
}
if("Kabab" == foodName){
	System.out.println("Search food name is "+ foodName);
return 210.20;
}
if("French Fries" == foodName){
	System.out.println("Search food name is "+ foodName);
return 80.30;
}
if("Parota" == foodName){
	System.out.println("Search food name is "+ foodName);
return 30.00;
}
if("Chicken Burger" == foodName){
	System.out.println("Search food name is "+ foodName);
return 180.30;
}
if("Chicken lollipop" == foodName){
	System.out.println("Search food name is "+ foodName);
return 280.30;
}
if("Lemon Rice" == foodName){
	System.out.println("Search food name is "+ foodName);
return 60.30;
}
if("Idly" == foodName){
	System.out.println("Search food name is "+ foodName);
return 40.00;
}
if("Masala Dosa" == foodName){
	System.out.println("Search food name is "+ foodName);
return 70.30;
}
if("Thatte Idly" == foodName){
	System.out.println("Search food name is "+ foodName);
return 50.30;
}
return 0.0;
}

//Method Overloading

public static double search(String foodName , int quantity){
	if("Pizza" == foodName){
		System.out.println("Search food name is" +foodName);
		return 99.00 * quantity;
	}
	
	if("Chicken Biriyani" == foodName){
	System.out.println("Search food name is "+ foodName);
return 245.90 * quantity;
}
if("Veg Biriyani" == foodName){
	System.out.println("Search food name is "+ foodName);
return 140.70 * quantity;
}
if("Burger" == foodName){
	System.out.println("Search food name is "+ foodName);
return 100.80 * quantity;
}
if("Chicken Fry" == foodName){
	System.out.println("Search food name is "+ foodName);
return 150.00 * quantity;
}
if("Butter naan" == foodName){
	System.out.println("Search food name is "+ foodName);
return 45.00* quantity;
}
if("Roti" == foodName){
	System.out.println("Search food name is "+ foodName);
return 50.10 * quantity;
}
if("Egg biriyani" == foodName){
	System.out.println("Search food name is "+ foodName);
return 200.20 * quantity;
}
if("Paneer biriyani" == foodName){
	System.out.println("Search food name is "+ foodName);
return 180.00 * quantity;
}
if("Veg Fried Rice" == foodName){
	System.out.println("Search food name is "+ foodName);
return 170.00 * quantity;
}
if("Egg rice" == foodName){
	System.out.println("Search food name is "+ foodName);
return 125.05 * quantity;
}
if("Kabab" == foodName){
	System.out.println("Search food name is "+ foodName);
return 210.20 * quantity;
}
if("French Fries" == foodName){
	System.out.println("Search food name is "+ foodName);
return 80.30 * quantity;
}
if("Parota" == foodName){
	System.out.println("Search food name is "+ foodName);
return 30.00 * quantity;
}
if("Chicken Burger" == foodName){
	System.out.println("Search food name is "+ foodName);
return 180.30 * quantity;
}
if("Chicken lollipop" == foodName){
	System.out.println("Search food name is "+ foodName);
return 280.30 * quantity;
}
if("Lemon Rice" == foodName){
	System.out.println("Search food name is "+ foodName);
return 60.30 * quantity;
}
if("Idly" == foodName){
	System.out.println("Search food name is "+ foodName);
return 40.00 * quantity;
}
if("Masala Dosa" == foodName){
	System.out.println("Search food name is "+ foodName);
return 70.30 * quantity;
}
if("Thatte Idly" == foodName){
	System.out.println("Search food name is "+ foodName);
return 50.30 * quantity;
}
	
return 0.0;
}


}
