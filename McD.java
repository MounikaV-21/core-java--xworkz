class McD{
public static double search(String foodName){
if("McSpicy Chicken" == foodName){
System.out.println("Search food name is "+ foodName);
return 160.00;
}
if("Chicken Wrap" == foodName){
	System.out.println("Search food name is "+ foodName);
return 185.90;
}
if("McSpicy Paneer" == foodName){
	System.out.println("Search food name is "+ foodName);
return 140.70;
}
if("McAloo" == foodName){
	System.out.println("Search food name is "+ foodName);
return 160.80;
}
if("Iced Tea" == foodName){
	System.out.println("Search food name is "+ foodName);
return 100.00;
}
if("Coke Float" == foodName){
	System.out.println("Search food name is "+ foodName);
return 135.00;
}
if("Chicken Wrap" == foodName){
	System.out.println("Search food name is "+ foodName);
return 120.10;
}
if("Chicken Kebab Burger " == foodName){
	System.out.println("Search food name is "+ foodName);
return 180.20;
}
if("Salsa Bean Burger" == foodName){
	System.out.println("Search food name is "+ foodName);
return 190.00;
}
if("Cheesy Rice Bowl" == foodName){
	System.out.println("Search food name is "+ foodName);
return 200.00;
}
if("Spicy Rice Bowl" == foodName){
	System.out.println("Search food name is "+ foodName);
return 215.05;
}
if("Chicken Maharaja Mac" == foodName){
	System.out.println("Search food name is "+ foodName);
return 250.20;
}
if("Veg Maharaja Mac" == foodName){
	System.out.println("Search food name is "+ foodName);
return 180.30;
}
if("McWings" == foodName){
	System.out.println("Search food name is "+ foodName);
return 290.00;
}
if("Masala Wedges" == foodName){
	System.out.println("Search food name is "+ foodName);
return 160.30;
}
if("Chicken Strips" == foodName){
	System.out.println("Search food name is "+ foodName);
return 280.30;
}
if("Mexican Cheesy Fries" == foodName){
	System.out.println("Search food name is "+ foodName);
return 260.30;
}
if("Filter Coffee" == foodName){
	System.out.println("Search food name is "+ foodName);
return 120.00;
}
if("Cold Coffee" == foodName){
	System.out.println("Search food name is "+ foodName);
return 110.30;
}
if("McSwirl" == foodName){
	System.out.println("Search food name is "+ foodName);
return 110.30;
}
return 0.0;
}

//Method Overloading

public static double search(String foodName , int quantity){
if("McSpicy Chicken" == foodName){
System.out.println("Search food name is "+ foodName);
return 160.00 * quantity;
}
if("Chicken Wrap" == foodName){
	System.out.println("Search food name is "+ foodName);
return 185.90 * quantity;
}
if("McSpicy Paneer" == foodName){
	System.out.println("Search food name is "+ foodName);
return 140.70 * quantity;
}
if("McAloo" == foodName){
	System.out.println("Search food name is "+ foodName);
return 160.80 * quantity;
}
if("Iced Tea" == foodName){
	System.out.println("Search food name is "+ foodName);
return 100.00 * quantity;
}
if("Coke Float" == foodName){
	System.out.println("Search food name is "+ foodName);
return 135.00 * quantity;
}
if("Chicken Wrap" == foodName){
	System.out.println("Search food name is "+ foodName);
return 120.10 * quantity;
}
if("Chicken Kebab Burger " == foodName){
	System.out.println("Search food name is "+ foodName);
return 180.20 * quantity;
}
if("Salsa Bean Burger" == foodName){
	System.out.println("Search food name is "+ foodName);
return 190.00 * quantity;
}
if("Cheesy Rice Bowl" == foodName){
	System.out.println("Search food name is "+ foodName);
return 200.00 * quantity;
}
if("Spicy Rice Bowl" == foodName){
	System.out.println("Search food name is "+ foodName);
return 215.05 * quantity;
}
if("Chicken Maharaja Mac" == foodName){
	System.out.println("Search food name is "+ foodName);
return 250.20 * quantity;
}
if("Veg Maharaja Mac" == foodName){
	System.out.println("Search food name is "+ foodName);
return 180.30 * quantity;
}
if("McWings" == foodName){
	System.out.println("Search food name is "+ foodName);
return 290.00 * quantity;
}
if("Masala Wedges" == foodName){
	System.out.println("Search food name is "+ foodName);
return 160.30 * quantity;
}
if("Chicken Strips" == foodName){
	System.out.println("Search food name is "+ foodName);
return 280.30 * quantity;
}
if("Mexican Cheesy Fries" == foodName){
	System.out.println("Search food name is "+ foodName);
return 260.30 * quantity;
}
if("Filter Coffee" == foodName){
	System.out.println("Search food name is "+ foodName);
return 120.00 * quantity;
}
if("Cold Coffee" == foodName){
	System.out.println("Search food name is "+ foodName);
return 110.30 * quantity;
}
if("McSwirl" == foodName){
	System.out.println("Search food name is "+ foodName);
return 110.30 * quantity;
}
return 0.0;
}


}