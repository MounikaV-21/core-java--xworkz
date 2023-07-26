class Rockets{
	
	public Rockets() {
		System.out.println("Rockets constructor is invoked");
}



String name;
String launchedDate;
int launchedYear;

public Rockets(String name, String launchedDate, int launchedYear){
	this.name = name;
	this.launchedDate = launchedDate;
	this.launchedYear = launchedYear;
	System.out.println("Rockets constructor is invoked");
}

public void allLaunched(){
	System.out.println("Some rockets lauched in india");
	
}

}