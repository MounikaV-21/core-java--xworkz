class RocketsTester{
 
 public static void main(String rock[]){
 
/* Rockets rocket=new Rockets();
rocket.name="Astrosat";
rocket.launchedDate="September 28";
rocket.launchedYear=2015;
rocket.allLaunched();
System.out.println( rocket.name  + " " + rocket.launchedDate + " " + rocket.launchedYear);
System.out.println(" ");
 
Rockets rocket1=new Rockets();
rocket1.name="Cartosat2";
rocket1.launchedDate="Janauary 10";
rocket1.launchedYear=2007;
System.out.println(rocket1.name  + " " + rocket1.launchedDate + " " + rocket1.launchedYear);
System.out.println(" ");
  
   
Rockets rocket2=new Rockets();
rocket2.name="Insat4CR";
rocket2.launchedDate="September 2";
rocket2.launchedYear=2007;
System.out.println(rocket2.name  + " " + rocket2.launchedDate + " "+ rocket2.launchedYear);
System.out.println(" ");
  
  
Rockets rocket3=new Rockets();
rocket3.name="GSAT-1";
rocket3.launchedDate="April 18";
rocket3.launchedYear=2001;
System.out.println(rocket3.name  + " "+ rocket3.launchedDate + " " + rocket3.launchedYear);
  System.out.println(" ");
  
Rockets rocket4=new Rockets();
rocket4.name="INSAT-1B";
rocket4.launchedDate="August 29";
rocket4.launchedYear=1983;
System.out.println(rocket4.name  + " " + rocket4.launchedDate + " " + rocket4.launchedYear);
  System.out.println(" ");
  
Rockets rocket5=new Rockets();
rocket5.name="INSAT-4B";
rocket5.launchedDate="March 17";
rocket5.launchedYear=2007;
System.out.println(rocket5.name  + " " + rocket5.launchedDate + " " + rocket5.launchedYear);
  System.out.println(" ");
  
Rockets rocket6=new Rockets();
rocket6.name="Resourceat-2A";
rocket6.launchedDate="December 7";
rocket6.launchedYear=2016;
System.out.println(rocket6.name  + " " + rocket6.launchedDate + " " + rocket6.launchedYear);
  System.out.println(" ");
  
Rockets rocket7=new Rockets();
rocket7.name="GSAT-18";
rocket7.launchedDate="Octomber 5";
rocket7.launchedYear=2016;
System.out.println(rocket7.name  + " " + rocket7.launchedDate + " " + rocket7.launchedYear);
  System.out.println(" ");
  
Rockets rocket8=new Rockets();
rocket8.name="Gsat-7A";
rocket8.launchedDate="December 19";
rocket8.launchedYear=2018;
System.out.println(rocket8.name  + " " + rocket8.launchedDate + " " + rocket8.launchedYear);
  System.out.println(" ");
  
Rockets rocket9=new Rockets();
rocket9.name="GSAT-8";
rocket9.launchedDate="May 21";
rocket9.launchedYear=2011;
System.out.println(rocket9.name  + " " + rocket9.launchedDate + "  " + rocket9.launchedYear);
  System.out.println(" ");
 
Rockets rocket10=new Rockets();
rocket10.name="INSAT-1E";
rocket10.launchedDate="April 2";
rocket10.launchedYear=1999;
System.out.println(rocket10.name  + " " + rocket10.launchedDate + " " + rocket10.launchedYear); */

Rockets rocket = new Rockets("Astrosat", "September 28", 2015);
	  System.out.println(rocket.name + ", " + rocket.launchedDate + ", " + rocket.launchedYear);
	  rocket.allLaunched();
	  System.out.println(" ");
	  
	  Rockets rocket1 = new Rockets("Cartosat2", "Janauary 10", 2007);
	  System.out.println(rocket1.name + ", " + rocket1.launchedDate + ", " + rocket1.launchedYear);
	  rocket1.allLaunched();
	  System.out.println(" ");
	  
	  Rockets rocket2 = new Rockets("Insat4CR", "September 2", 2008);
	  System.out.println(rocket2.name + ", " + rocket2.launchedDate + ", " + rocket2.launchedYear);
	  rocket2.allLaunched();
	  System.out.println(" ");
	  
	  Rockets rocket3 = new Rockets("GSAT-1", "April 18", 2001);
	  System.out.println(rocket3.name + ", " + rocket3.launchedDate + ", " + rocket3.launchedYear);
	  rocket3.allLaunched();
	  System.out.println(" ");
	  
	  Rockets rocket4 = new Rockets("INSAT-1B", "August 29", 1983);
	  System.out.println(rocket4.name + ", " + rocket4.launchedDate + ", " + rocket4.launchedYear);
	  rocket4.allLaunched();
	  System.out.println(" ");
	  
	  Rockets rocket5 = new Rockets("INSAT-4B", "March 17", 1993);
	  System.out.println(rocket5.name + ", " + rocket5.launchedDate + ", " + rocket5.launchedYear);
	  rocket5.allLaunched();
	  System.out.println(" ");
	  
	  Rockets rocket6 = new Rockets("Resourceat-2A", "December 7", 2016);
	  System.out.println(rocket6.name + ", " + rocket6.launchedDate + ", " + rocket6.launchedYear);
	  rocket6.allLaunched();
	  System.out.println(" ");
	  
	  Rockets rocket7 = new Rockets("GSAT-18", "Octomber 5", 2018);
	  System.out.println(rocket7.name + ", " + rocket7.launchedDate + ", " + rocket7.launchedYear);
	  rocket7.allLaunched();
	  System.out.println(" ");
	  
	  Rockets rocket8 = new Rockets("Gsat-7A", "December 19", 2018);
	  System.out.println(rocket8.name + ", " + rocket8.launchedDate + ", " + rocket8.launchedYear);
	  rocket.allLaunched();
	  System.out.println(" ");
	  
	  Rockets rocket9 = new Rockets("GSAT-8", "May-21", 2011);
	  System.out.println(rocket9.name + ", " + rocket9.launchedDate + ", " + rocket9.launchedYear);
	  rocket9.allLaunched();
	  System.out.println(" ");
 
 }

}