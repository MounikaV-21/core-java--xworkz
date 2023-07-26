class PrinterTester{

 public static void main(String print[]){
	 
	/* Printer printer = new Printer();
	printer.toPrint();
	printer.name = "HP DeskJet";
	printer.type = "Single function";
	printer.price = 2699;
	printer.origin = "Thailand";
	System.out.println(printer.name+" "+printer.type+" "+printer.price+" "+printer.origin);
	System.out.println(" ");
	
	Printer printer1 = new Printer();
	printer.toPrint();
	printer1.name = "Canon MG2570S";
	printer1.type = "Multi function";
	printer1.price = 3118;
	printer1.origin = "China";
	System.out.println(printer1.name+" "+printer1.type+" "+printer1.price+" "+printer1.origin);
	System.out.println(" ");
	
	Printer printer2 = new Printer();
	printer.toPrint();
	printer2.name = "HP smart tank";
	printer2.type = "Multi function";
	printer2.price = 10749;
	printer2.origin = "Thailand";
	System.out.println(printer2.name+" "+printer2.type+" "+printer2.price+" "+printer2.origin);
	System.out.println(" ");
	
	Printer printer3 = new Printer();
	printer.toPrint();
	printer3.name = "Epson";
	printer3.type = "Multi function";
	printer3.price = 12149;
	printer3.origin = "Philippines";
	System.out.println(printer3.name+" "+printer3.type+" "+printer3.price+" "+printer3.origin);
	System.out.println(" ");
	
	Printer printer4 = new Printer();
	printer.toPrint();
	printer4.name = "brother";
	printer4.type = "Single function";
	printer4.price = 9939;
	printer4.origin = "Vietnam";
	System.out.println(printer4.name+" "+printer4.type+" "+printer4.price+" "+printer4.origin);
	System.out.println(" ");
	
	Printer printer5 = new Printer();
	printer.toPrint();
	printer5.name = "Hp laserjet";
	printer5.type = "Multi function";
	printer5.price = 8643;
	printer5.origin = "Malaysia";
	System.out.println(printer5.name+" "+printer5.type+" "+printer5.price+" "+printer5.origin);
	System.out.println(" ");
	
	Printer printer6 = new Printer();
	printer.toPrint();
	printer6.name = "Canon E4570 all in one";
	printer6.type = "Multi function";
	printer6.price = 7615;
	printer6.origin = "Italy";
	System.out.println(printer6.name+" "+printer6.type+" "+printer6.price+" "+printer6.origin);
	System.out.println(" ");
	
	Printer printer7 = new Printer();
	printer.toPrint();
	printer7.name = "Canon PIXMA";
	printer7.type = "Multi function";
	printer7.price = 9545;
	printer7.origin = "US";
	System.out.println(printer7.name+" "+printer7.type+" "+printer7.price+" "+printer7.origin);
	System.out.println(" ");
	
	Printer printer8 = new Printer();
	printer.toPrint();
	printer8.name = "Pantum monochrome laser";
	printer8.type = "Single function";
	printer8.price = 8465;
	printer8.origin = "Japan";
	System.out.println(printer8.name+" "+printer8.type+" "+printer8.price+" "+printer8.origin);
	System.out.println(" ");
	
	Printer printer9 = new Printer();
	printer.toPrint();
	printer9.name = "Brother DCP";
	printer9.type = "Multi function";
	printer9.price = 10367;
	printer9.origin = "UK";
	System.out.println(printer9.name+" "+printer9.type+" "+printer9.price+" "+printer9.origin);
	System.out.println(" "); */
	
	 Printer printer = new Printer("HP DeskJet ", "Single Function", 2699, "Thailand");
	  System.out.println(printer.name + ", " + printer.type + ", " + printer.price +" "+ printer.origin);
	  printer.toPrint();
	  System.out.println(" ");
	  
	  Printer printer1 = new Printer("Canon MG2570S", "Multi Function", 3118, "China");
	  System.out.println(printer1.name + ", " + printer1.type + ", " + printer1.price +" "+ printer1.origin);
	  printer1.toPrint();
	  System.out.println(" ");
	  
	  Printer printer2 = new Printer("HP smart tank", "Multi Function", 10749, "Thailand");
	  System.out.println(printer2.name + ", " + printer2.type + ", " + printer2.price +" "+ printer2.origin);
	  printer2.toPrint();
	  System.out.println(" ");
	  
	  Printer printer3 = new Printer("Epson", "Multi Function", 12149, "Philippines");
	  System.out.println(printer3.name + ", " + printer3.type + ", " + printer3.price +" "+ printer3.origin);
	  printer3.toPrint();
	  System.out.println(" ");
	  
	  Printer printer4 = new Printer("brother ", "Single Function", 9939, "Vietnam");
	  System.out.println(printer4.name + ", " + printer4.type + ", " + printer4.price +" "+ printer4.origin);
	  printer4.toPrint();
	  System.out.println(" ");
	  
	  Printer printer5 = new Printer("Hp laserjet", "Multi Function", 8643, "Malaysia");
	  System.out.println(printer5.name + ", " + printer5.type + ", " + printer5.price +" "+ printer5.origin);
	  printer5.toPrint();
	  System.out.println(" ");
	  
	  Printer printer6 = new Printer("Canon E4570 all in one", "Multi Function", 7615, "Italy");
	  System.out.println(printer6.name + ", " + printer6.type + ", " + printer6.price +" "+ printer6.origin);
	  printer6.toPrint();
	  System.out.println(" ");
	  
	  Printer printer7 = new Printer("Canon PIXMA", "Multi Function", 9545, "US");
	  System.out.println(printer7.name + ", " + printer7.type + ", " + printer7.price +" "+ printer7.origin);
	  printer7.toPrint();
	  System.out.println(" ");
	  
	  Printer printer8 = new Printer("Pantum monochrome laser", "Single Function", 8465, "Japan");
	  System.out.println(printer8.name + ", " + printer8.type + ", " + printer8.price +" "+ printer8.origin);
	  printer8.toPrint();
	  System.out.println(" ");
	  
	  Printer printer9 = new Printer("Brother DCP", "Multi Function", 10367, "UK");
	  System.out.println(printer9.name + ", " + printer9.type + ", " + printer9.price +" "+ printer9.origin);
	  printer9.toPrint();
	  System.out.println(" ");
	  
	 
 }

}