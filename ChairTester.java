class ChairTester{
public static void main(String c[]){
Chair chair = new Chair();
chair.name = "Nirmala";
chair.type = "Plastic";
chair.color = "cream";
chair.price = 500.00;
chair.toSit();
System.out.println("Creating 1st copy of chai");
System.out.println(chair.name +" "+ chair.type +" "+ chair.color +" "+ chair.price);
System.out.println(" ");

Chair chair2 = new Chair();
chair2.name = "Anand";
chair2.type = "Wooden";
chair2.color = "Black";
chair2.price = 800.00;
chair2.toSit();
System.out.println("Creating 2nd copy of chai");
System.out.println(chair2.name +" "+ chair2.type +" "+ chair2.color +" "+ chair2.price);
System.out.println(" ");

Chair chair3 = new Chair();
chair2.name = "Vishal";
chair2.type = "Plastic";
chair2.color = "Blue";
chair2.price = 400.00;
chair2.toSit();
System.out.println("Creating 3rd copy of chai");
System.out.println(chair3.name +" "+ chair3.type +" "+ chair3.color +" "+ chair3.price);
}
}