class RadioTester{
 
 public static void main(String radio[]){
   
	  System.out.println("Creating first copy of radio");
	  Radio radio1 = new Radio("samsung", "bluetooth", 3000, "black");
	  /* radio1.brandName = "samsung";
	  radio1.connectivityTechnology = "bluetooth";
	  radio1.price = 3000;
	  radio1.color = "black"; */
	  radio1.playSongs();
	  System.out.println(radio1.brandName + ", " + radio1.connectivityTechnology + ", " + radio1.price + ", " + radio1.color);
	  System.out.println(" ");
	  
	  System.out.println("Creating second copy of radio");
	  Radio radio2 = new Radio("lg", "usb", 3500, "blue");
	  /* radio2.brandName = "lg";
	  radio2.connectivityTechnology = "usb";
	  radio2.price = 3500;
	  radio2.color = "blue"; */
	  radio2.playSongs();
	  System.out.println(radio2.brandName + ", " + radio2.connectivityTechnology + ", " + radio2.price + ", " + radio2.color);
	  System.out.println(" ");
	  
	  System.out.println("Creating third copy of radio");
	  Radio radio3 = new Radio("carvaan", "auxiliary", 7000, "skyline blue");
	  /* radio3.brandName = "carvaan";
	  radio3.connectivityTechnology = "auxiliary";
	  radio3.price = 7000;
	  radio3.color = "skyline blue"; */
	  radio3.playSongs();
	  System.out.println(radio3.brandName + ", " + radio3.connectivityTechnology + ", " + radio3.price + ", " + radio3.color);
	  System.out.println(" ");
	  
	  System.out.println("Creating fourth copy of radio");
	  Radio radio4 = new Radio("philips", "bluetooth", 4900, "cherrywood red");
	  /* radio4.brandName = "philips";
	  radio4.connectivityTechnology = "bluetooth";
	  radio4.price = 4900;
	  radio4.color = "cherrywood red"; */
	  radio4.playSongs();
	  System.out.println(radio4.brandName + ", " + radio4.connectivityTechnology + ", " + radio4.price + ", " + radio4.color);
	  System.out.println(" ");
	  
	  System.out.println("Creating fifth copy of radio");
	  Radio radio5 = new Radio("luminous", "usb", 9000, "violet");
	  /* radio5.brandName = "luminous";
	  radio5.connectivityTechnology = "usb";
	  radio5.price = 9000;
	  radio5.color = "violet"; */
	  radio5.playSongs();
	  System.out.println(radio5.brandName + ", " + radio5.connectivityTechnology + ", " + radio5.price + ", " + radio5.color);
	  System.out.println(" ");
	  
	  System.out.println("Creating sixth copy of radio");
	  Radio radio6 = new Radio("iBell", "auxiliary", 1674, "brown");
	  /* radio6.brandName = "iBell";
	  radio6.connectivityTechnology = "auxiliary";
	  radio6.price = 1674;
	  radio6.color = "brown"; */
	  radio6.playSongs();
	  System.out.println(radio6.brandName + ", " + radio6.connectivityTechnology + ", " + radio6.price + ", " + radio6.color);
	  System.out.println(" ");
	  
	  System.out.println("Creating seventh copy of radio");
	  Radio radio7 = new Radio("zebronics", "bluetooth", 489, "grey");
	  /* radio7.brandName = "zebronics";
	  radio7.connectivityTechnology = "bluetooth";
	  radio7.price = 489;
	  radio7.color = "grey"; */
	  radio7.playSongs();
	  System.out.println(radio7.brandName + ", " + radio7.connectivityTechnology + ", " + radio7.price + ", " + radio7.color);
	  System.out.println(" ");
	  
	  System.out.println("Creating eighth copy of radio");
	  Radio radio8 = new Radio("vemax base", "auxiliary", 1399, "Black");
	  /* radio8.brandName = "vemax base";
	  radio8.connectivityTechnology = "auxiliary";
	  radio8.price = 1399;
	  radio8.color = "black"; */
	  radio8.playSongs();
	  System.out.println(radio8.brandName + ", " + radio8.connectivityTechnology + ", " + radio8.price + ", " + radio8.color);
	  System.out.println(" ");
	  
	  System.out.println("Creating ninth copy of radio");
	  Radio radio9 = new Radio("pagaria", "bluetooth", 3900, "maroon");
	  /* radio9.brandName = "pagaria";
	  radio9.connectivityTechnology = "bluetooth";
	  radio9.price = 3900;
	  radio9.color = "maroon"; */
	  radio9.playSongs();
	  System.out.println(radio9.brandName + ", " + radio9.connectivityTechnology + ", " + radio9.price + ", " + radio9.color);
	  System.out.println(" ");
	  
	  System.out.println("Creating tenth copy of radio");
	  Radio radio10 = new Radio("saregama carvaan", "usb", 7790, "orchid purple");
	  /* radio10.brandName = "saregama carvaan";
	  radio10.connectivityTechnology = "usb";
	  radio10.price = 7790;
	  radio10.color = "orchid purple"; */
	  radio10.playSongs();
	  System.out.println(radio10.brandName + ", " + radio10.connectivityTechnology + ", " + radio10.price + ", " + radio10.color);
}
}