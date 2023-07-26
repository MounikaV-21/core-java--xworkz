class ProjectorObject{
	
	public ProjectorObject() {
		System.out.println("ProjectorObject constructor is invoked");
}

 String name;
 String type;
 double maxDistance;
 int price;
 
 public ProjectorObject(String name, String type, int price, double maxDistance){
	this.name = name;
	this.type = type;
	this.price = price;
	this.maxDistance = maxDistance;
	
	System.out.println("ProjectorObject constructor is invoked");
}
 
 public void projectImage(){
 System.out.println("Projector is to project Image");
 }
}