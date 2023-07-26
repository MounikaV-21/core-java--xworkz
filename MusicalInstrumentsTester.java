class MusicalInstrumentsTester{
 
  public static void main(String args[]){
   
   /* MusicalInstruments instrument = new MusicalInstruments();
   instrument.name = "Piano";
   instrument.type = "Chordophones";
   instrument.color = "Black";
   instrument.price = 5000;
   instrument.produceMusic();
   System.out.println(instrument.name+" "+instrument.type+" "+instrument.color+" "+instrument.price);
   System.out.println(" ");  

   MusicalInstruments instrument1 = new MusicalInstruments();
   instrument1.name = "Guitar";
   instrument1.type = "Stringed instrument";
   instrument1.color = "Red color";
   instrument1.price = 6000;
   instrument1.produceMusic();
   System.out.println(instrument1.name+" "+instrument1.type+" "+instrument1.color+" "+instrument1.price);
   System.out.println(" ");

   MusicalInstruments instrument2 = new MusicalInstruments();
   instrument2.name = "Saxophone";
   instrument2.type = "wind instrument";
   instrument2.color = "Golden color";
   instrument2.price = 7000;
   instrument2.produceMusic();
   System.out.println(instrument2.name+" "+instrument2.type+" "+instrument2.color+" "+instrument2.price);
   System.out.println(" ");

   MusicalInstruments instrument3 = new MusicalInstruments();
   instrument3.name = "Violin";
   instrument3.type = "Stringed instrument";
   instrument3.color = "Mustard";
   instrument3.price = 5000;
   instrument3.produceMusic();
   System.out.println(instrument3.name+" "+instrument3.type+" "+instrument3.color+" "+instrument3.price);
   System.out.println(" ");

   MusicalInstruments instrument4 = new MusicalInstruments();
   instrument4.name = "Clarinet";
   instrument4.type = "Wind instrument";
   instrument4.color = "Silver color";
   instrument4.price = 15000;
   instrument4.produceMusic();
   System.out.println(instrument4.name+" "+instrument4.type+" "+instrument4.color+" "+instrument4.price);
   System.out.println(" ");

   MusicalInstruments instrument5 = new MusicalInstruments();
   instrument5.name = "Xylophone";
   instrument5.type = "percussion instrument";
   instrument5.color = "Brown";
   instrument5.price = 3000;
   instrument5.produceMusic();
   System.out.println(instrument5.name+" "+instrument5.type+" "+instrument5.color+" "+instrument5.price);
   System.out.println(" ");

   MusicalInstruments instrument6 = new MusicalInstruments();
   instrument6.name = "Electronic keyboard";
   instrument6.type = "Chordophones";
   instrument6.color = "White";
   instrument6.price = 7000;
   instrument6.produceMusic();
   System.out.println(instrument6.name+" "+instrument6.type+" "+instrument6.color+" "+instrument6.price);
   System.out.println(" ");

   MusicalInstruments instrument7 = new MusicalInstruments();
   instrument7.name = "Accordion";
   instrument7.type = "Chordophones";
   instrument7.color = "Red";
   instrument7.price = 5000;
   instrument7.produceMusic();
   System.out.println(instrument7.name+" "+instrument7.type+" "+instrument7.color+" "+instrument7.price);
   System.out.println(" ");

   MusicalInstruments instrument8 = new MusicalInstruments();
   instrument8.name = "FLute";
   instrument8.type = "Wind instrument";
   instrument8.color = "Yellow";
   instrument8.price = 1000;
   instrument8.produceMusic();
   System.out.println(instrument8.name+" "+instrument8.type+" "+instrument8.color+" "+instrument8.price);
   System.out.println(" ");

   MusicalInstruments instrument9 = new MusicalInstruments();
   instrument9.name = "Tuba";
   instrument9.type = "Wind Instrument";
   instrument9.color = "Golden";
   instrument9.price = 10000;
   instrument9.produceMusic();
   System.out.println(instrument9.name+" "+instrument9.type+" "+instrument9.color+" "+instrument9.price); */

MusicalInstruments instrument = new MusicalInstruments("Piano", "Chordophones", 5000, "Black");
	  System.out.println(instrument.name + ", " + instrument.type + ", " + instrument.price +" "+ instrument.color);
	  instrument.produceMusic();
	  System.out.println(" "); 

MusicalInstruments instrument1 = new MusicalInstruments("Guitar", "Stringed instrument", 6000, "Red color");
	  System.out.println(instrument1.name + ", " + instrument1.type + ", " + instrument1.price +" "+ instrument1.color);
	  instrument1.produceMusic();
	  System.out.println(" ");

MusicalInstruments instrument2 = new MusicalInstruments("Saxophone", "wind instrument", 7000, "Golden color");
	  System.out.println(instrument2.name + ", " + instrument2.type + ", " + instrument2.price +" "+ instrument2.color);
	  instrument2.produceMusic();
	  System.out.println(" ");

MusicalInstruments instrument3 = new MusicalInstruments("Violin", "Stringed instrument", 5000, "Mustard");
	  System.out.println(instrument3.name + ", " + instrument3.type + ", " + instrument3.price +" "+ instrument3.color);
	  instrument3.produceMusic();
	  System.out.println(" ");

MusicalInstruments instrument4 = new MusicalInstruments("Clarinet", "Wind instrument", 15000, "Silver color");
	  System.out.println(instrument4.name + ", " + instrument4.type + ", " + instrument4.price +" "+ instrument4.color);
	  instrument4.produceMusic();
	  System.out.println(" ");

MusicalInstruments instrument5 = new MusicalInstruments("Xylophone", "percussion instrument", 3000, "Brown");
	  System.out.println(instrument5.name + ", " + instrument5.type + ", " + instrument5.price +" "+ instrument5.color);
	  instrument5.produceMusic();
	  System.out.println(" ");

MusicalInstruments instrument6 = new MusicalInstruments("Electronic keyboard", "Chordophones", 7000, "white");
	  System.out.println(instrument6.name + ", " + instrument6.type + ", " + instrument6.price +" "+ instrument6.color);
	  instrument6.produceMusic();
	  System.out.println(" ");

MusicalInstruments instrument7 = new MusicalInstruments("Accordion", "Chordophones", 5000, "Red");
	  System.out.println(instrument7.name + ", " + instrument7.type + ", " + instrument7.price +" "+ instrument7.color);
	  instrument7.produceMusic();
	  System.out.println(" ");

MusicalInstruments instrument8 = new MusicalInstruments("FLute", "wind instrument", 1000, "Yellow");
	  System.out.println(instrument8.name + ", " + instrument8.type + ", " + instrument8.price +" "+ instrument8.color);
	  instrument8.produceMusic();
	  System.out.println(" ");

MusicalInstruments instrument9 = new MusicalInstruments("Tuba", "wind instrument", 10000, "Golden");
	  System.out.println(instrument9.name + ", " + instrument9.type + ", " + instrument9.price +" "+ instrument9.color);
	  instrument9.produceMusic();  
  
  }

}