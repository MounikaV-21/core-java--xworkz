class Swiggy{
public static double search(String foodName){
if("Biriyani Rice" == foodName){
System.out.println("Search food name is "+ foodName);
return 110.00;
}
if("Mutton Biriyani" == foodName){
	System.out.println("Search food name is "+ foodName);
return 145.90;
}
if("Sholay Kebab" == foodName){
	System.out.println("Search food name is "+ foodName);
return 120.70;
}
if("Shawarma Roll" == foodName){
	System.out.println("Search food name is "+ foodName);
return 150.80;
}
if("Grilled Chicken" == foodName){
	System.out.println("Search food name is "+ foodName);
return 180.00;
}
if("Ghee Rice" == foodName){
	System.out.println("Search food name is "+ foodName);
return 145.00;
}
if("Mutton Haleem" == foodName){
	System.out.println("Search food name is "+ foodName);
return 150.10;
}
if("Chicken Roll" == foodName){
	System.out.println("Search food name is "+ foodName);
return 120.20;
}
if("Coin Paratha" == foodName){
	System.out.println("Search food name is "+ foodName);
return 130.00;
}
if("Jeera Rice" == foodName){
	System.out.println("Search food name is "+ foodName);
return 150.00;
}
if("Veg Noodles" == foodName){
	System.out.println("Search food name is "+ foodName);
return 225.05;
}
if("Paneer Chilli" == foodName){
	System.out.println("Search food name is "+ foodName);
return 200.20;
}
if("Baby Corn Pepper" == foodName){
	System.out.println("Search food name is "+ foodName);
return 80.30;
}
if("Mushroom Chilli" == foodName){
	System.out.println("Search food name is "+ foodName);
return 90.00;
}
if("Paneer Pepper" == foodName){
	System.out.println("Search food name is "+ foodName);
return 280.30;
}
if("Ginger Mushroom" == foodName){
	System.out.println("Search food name is "+ foodName);
return 180.30;
}
if("Gobi Pepper" == foodName){
	System.out.println("Search food name is "+ foodName);
return 160.30;
}
if("Mushroom Lemon" == foodName){
	System.out.println("Search food name is "+ foodName);
return 140.00;
}
if("Mushroom Spring" == foodName){
	System.out.println("Search food name is "+ foodName);
return 110.30;
}
if("Pudina Kabab" == foodName){
	System.out.println("Search food name is "+ foodName);
return 210.30;
}
return 0.0;
}

//Method Overloading

public static double search(String foodName , int quantity){
if("Biriyani Rice" == foodName){
System.out.println("Search food name is "+ foodName);
return 110.00 * quantity;
}
if("Mutton Biriyani" == foodName){
	System.out.println("Search food name is "+ foodName);
return 145.90 * quantity;
}
if("Sholay Kebab" == foodName){
	System.out.println("Search food name is "+ foodName);
return 120.70 * quantity;
}
if("Shawarma Roll" == foodName){
	System.out.println("Search food name is "+ foodName);
return 150.80 * quantity;
}
if("Grilled Chicken" == foodName){
	System.out.println("Search food name is "+ foodName);
return 180.00 * quantity;
}
if("Ghee Rice" == foodName){
	System.out.println("Search food name is "+ foodName);
return 145.00 * quantity;
}
if("Mutton Haleem" == foodName){
	System.out.println("Search food name is "+ foodName);
return 150.10 * quantity;
}
if("Chicken Roll" == foodName){
	System.out.println("Search food name is "+ foodName);
return 120.20 * quantity;
}
if("Coin Paratha" == foodName){
	System.out.println("Search food name is "+ foodName);
return 130.00 * quantity;
}
if("Jeera Rice" == foodName){
	System.out.println("Search food name is "+ foodName);
return 150.00 * quantity;
}
if("Veg Noodles" == foodName){
	System.out.println("Search food name is "+ foodName);
return 225.05 * quantity;
}
if("Paneer Chilli" == foodName){
	System.out.println("Search food name is "+ foodName);
return 200.20 * quantity;
}
if("Baby Corn Pepper" == foodName){
	System.out.println("Search food name is "+ foodName);
return 80.30 * quantity;
}
if("Mushroom Chilli" == foodName){
	System.out.println("Search food name is "+ foodName);
return 90.00 * quantity;
}
if("Paneer Pepper" == foodName){
	System.out.println("Search food name is "+ foodName);
return 280.30 * quantity;
}
if("Ginger Mushroom" == foodName){
	System.out.println("Search food name is "+ foodName);
return 180.30 * quantity;
}
if("Gobi Pepper" == foodName){
	System.out.println("Search food name is "+ foodName);
return 160.30 * quantity;
}
if("Mushroom Lemon" == foodName){
	System.out.println("Search food name is "+ foodName);
return 140.00 * quantity;
}
if("Mushroom Spring" == foodName){
	System.out.println("Search food name is "+ foodName);
return 110.30 * quantity;
}
if("Pudina Kabab" == foodName){
	System.out.println("Search food name is "+ foodName);
return 210.30 * quantity;
}
return 0.0;
}


}
