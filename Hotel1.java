class HotelFood{

public static void main(String hotel[]){

  System.out.println("Main Started");
  String foodMenu[] = {"Chhole","Pav Bhaji","Mix Veg","Channa Masala","Corn Capsicum","Green Garden","Paneer Bhurji","Panner Butter masala",
 "Dal fry","Veg Biryani","Pulav","Dal Katchdi","Jeera rice","Upma","Poha","Idli","Lemon Rice","Roti","Dosa","Parata","Gajjer Halwa","Chilly chicken",
 "Guntoor chicken","Kaima Balls","Ragi ball","Chicken Biryani","Hydrabadi dum biryani","Chickren 65","Egg Omlet","Boiled eggs","White rice",
 "Chicken sambar","Khadai Chicken","Chicken Kabab","Chicken ghee roast","Fish tawa fry","Neer Dose","Curd Rice","Tomato Soup","Chicken lollipop",
 "Ghee rice","Egg curry","Panner ghee roast","naan","Rumali roti","Fish fingers","Egg rolls","Chicken momos","Panner momos","Veg momos"};
 
 for(int index=0; index<=foodMenu.length-1; index++){
	 System.out.println(foodMenu[index]);
 }
 System.out.println("Main Ended");
}
}