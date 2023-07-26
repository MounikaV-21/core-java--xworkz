class Satellite{
	
	public Satellite() {
		System.out.println("Satellite constructor is invoked");
}
  String name;
  String type;
  int communicationCost;
  
  public Satellite(String name, String type, int communicationCost){
	this.name = name;
	this.type = type;
	this.communicationCost = communicationCost;
	
	System.out.println("Satellite Constructor is invoked");
}
  
  public void launchSatellites(){
  System.out.println("Satellitesa re launched for research purpose");
  }

}