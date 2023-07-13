class Panda{
   public static double search(String foodName){
   
   
     if("Mushroom Schezwan noodles" ==foodName ){
     System.out.println("Searched food name is "+ foodName);
	 return 350.00;
     }
	 
	 if("Veg Ball Manchurian" == foodName){
	 System.out.println("Searched food name is "+ foodName);
	 return 350.90;
	 }
	 
	 if("Veg Spring Roll"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 240.50;
	 }
	 
	 if("Banana icecream dessert jar"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 240.50;
	 }
	 
	 if("Chicken lemon pepper"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 180.50;
	 }
	 
	 if("Chicken Hot N sour soup"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 160.45;
	 }
	 
	 if("chicken manchow soup"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 240.50;
	 }
	 
	 if("veg Manchow soup"== foodName){
	 System.out.println("Searchd food name is " + foodName);
	 return 350.50;
	 }
	 
	 if("Chilli Paneer Dry"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 65.50;
	 }
	 
	 if("Baby Corn chilli"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 150.00;
	 }
	 
	 if("Dragon chicken dry"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 250.50;
	 }
	 
	 if("Hunan Chicken dry"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 300.00;
	 }
	 
	 if("Soya chilli"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 120.45;
	 }
	 
	 if("Egg Hakka Noodles"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 100.00;
	 }
	 
	 if(" Rainbow sundae"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 259.50;
	 }
	 
	 if("Milkshake"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 160.00;
	 }
	 
	 if("Taaka Chinese"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 300.50;
	 }
	 
	 if("Chinese Wok"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 250.00;
	 }
	 
	 if("Roti"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 15.96;
	 }
	 
	 if("Indo-Chinese noodles"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 230.50;
	 }
	 return 0.0;
   }
   
   //Method Overloading
   
   public static double search(String foodName , int quantity){
   
   
     if("Mushroom Schezwan noodles" ==foodName ){
     System.out.println("Searched food name is "+ foodName);
	 return 350.00 * quantity;
     }
	 
	 if("Veg Ball Manchurian" == foodName){
	 System.out.println("Searched food name is "+ foodName);
	 return 350.90 * quantity;
	 }
	 
	 if("Veg Spring Roll"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 240.50 * quantity;
	 }
	 
	 if("Banana icecream dessert jar"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 240.50 * quantity;
	 }
	 
	 if("Chicken lemon pepper"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 180.50 * quantity;
	 }
	 
	 if("Chicken Hot N sour soup"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 160.45 * quantity;
	 }
	 
	 if("chicken manchow soup"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 240.50 * quantity;
	 }
	 
	 if("veg Manchow soup"== foodName){
	 System.out.println("Searchd food name is " + foodName);
	 return 350.50 * quantity;
	 }
	 
	 if("Chilli Paneer Dry"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 65.50 * quantity;
	 }
	 
	 if("Baby Corn chilli"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 150.00 * quantity;
	 }
	 
	 if("Dragon chicken dry"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 250.50 * quantity;
	 }
	 
	 if("Hunan Chicken dry"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 300.00 * quantity;
	 }
	 
	 if("Soya chilli"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 120.45 * quantity;
	 }
	 
	 if("Egg Hakka Noodles"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 100.00 * quantity;
	 }
	 
	 if(" Rainbow sundae"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 259.50 * quantity;
	 }
	 
	 if("Milkshake"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 160.00 * quantity;
	 }
	 
	 if("Taaka Chinese"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 300.50 * quantity;
	 }
	 
	 if("Chinese Wok"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 250.00 * quantity;
	 }
	 
	 if("Roti"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 15.96 * quantity;
	 }
	 
	 if("Indo-Chinese noodles"== foodName){
	 System.out.println("Searched food name is " + foodName);
	 return 230.50 * quantity;
	 }
	 return 0.0;
   }

}