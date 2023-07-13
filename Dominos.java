class Dominos{
 
 public static double search(String foodName){
 
  if("Coke" == foodName){
   System.out.println("Searched foodName is "+ foodName);
   return 69.00;
  }
  if("Pepsi" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 399.90;
  }
  if("Garlic Breadsticks" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 109.0;
  }
  if("Choco Lava Cake" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 149.0;
  }
  if("Classic stuffed garlic bread" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 159.0;
  }
  if("Panner Tikka stuffed garlic bread" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 169.0;
  }
  if("Chicken pepperoni stuffed garlic bread" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 169.0;
  }
  if("Taco Mexican Veg" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 139.0;
  }
  if("Taco Mexican Non Veg" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 8169.0;
  }
  if("Chicken Parcel" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 55.0;
  }
  if("Mushroom Parcel" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 159.0;
  }
  if("Potato Cheesy Shots" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 79.0;
  }
  if("Crunchy Strips" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 69.0;
  }
  if("Creamy Tomato Pasta veg" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 139.0;
  }
  if("Cheesy Jalapeno Pasta veg" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 139.0;
  }
  if("Tikka Masala Pasta Veg" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 139.0;
  }
  if("Moroccan Spice Pasta Veg" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 139.0;
  }
  if("Creamy Tomato Pasta Non Veg" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 149.0;
  }
  if("Cheesy Jalapeno Pasta non-veg" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 149.0;
  }
  if("Moroccan Spice Pasta Non-Veg" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 159.0;
  }
  return 0.0;
 }
 
 //Method Overloading
 
 public static double search(String foodName , int quantity){
 
  if("Coke" == foodName){
   System.out.println("Searched foodName is "+ foodName);
   return 69.00 * quantity;
  }
  if("Pepsi" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 399.90 * quantity;
  }
  if("Garlic Breadsticks" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 109.0 * quantity;
  }
  if("Choco Lava Cake" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 149.0 * quantity;
  }
  if("Classic stuffed garlic bread" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 159.0 * quantity;
  }
  if("Panner Tikka stuffed garlic bread" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 169.0 * quantity;
  }
  if("Chicken pepperoni stuffed garlic bread" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 169.0 * quantity;
  }
  if("Taco Mexican Veg" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 139.0 * quantity;
  }
  if("Taco Mexican Non Veg" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 8169.0 * quantity;
  }
  if("Chicken Parcel" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 55.0 * quantity;
  }
  if("Mushroom Parcel" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 159.0 * quantity;
  }
  if("Potato Cheesy Shots" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 79.0 * quantity;
  }
  if("Crunchy Strips" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 69.0 * quantity;
  }
  if("Creamy Tomato Pasta veg" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 139.0 * quantity;
  }
  if("Cheesy Jalapeno Pasta veg" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 139.0 * quantity;
  }
  if("Tikka Masala Pasta Veg" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 139.0 * quantity;
  }
  if("Moroccan Spice Pasta Veg" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 139.0 * quantity;
  }
  if("Creamy Tomato Pasta Non Veg" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 149.0 * quantity;
  }
  if("Cheesy Jalapeno Pasta non-veg" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 149.0 * quantity;
  }
  if("Moroccan Spice Pasta Non-Veg" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 159.0 * quantity;
  }
  return 0.0;
 }

}