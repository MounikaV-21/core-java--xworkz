class CricketM{
 
 
 
 public static void main(String cricket[]){
 
 String batsMans[] = {"Sachin Tendulkar","Virat Kohli","Sourav Ganguli","Rahul Dravid","MS Dhoni","Rohith Sharma","Mohammad Azharuddin","Yuvraj Singh","Veerendar Sehwag","Shikar Dhawan"};
 String iccTeamRankings[] = {"Australia","Pakistan","India","Newzealand","England","South Africa","Bangladesh","Afghanistan","Sri Lanka","West Indies"};
 String iplTeamss[] = {"Royal Challangers bangalore","Chennai Super Kings","Mumbai Indians","Gujarat Titans","Kolakata Knight Riders","Rajasthan Royals","Sunrisers Hyderabad","Delhi Capitals","Luckow Super Gaints","Punjab Kings"};
 
 System.out.println("Main started");
 System.out.println(" ");
 //foreach
 for(String batsMan : batsMans){
	 System.out.println(batsMan);
 }
 System.out.println(" ");
 
 System.out.println("List of top 10 ipl team ranking are");
 for(String iccTeamRanking : iccTeamRankings ){
	 System.out.println(iccTeamRanking);
 }
 System.out.println(" ");
 
 System.out.println("List of ipl teams are");
for(String iplTeams : iplTeamss){
	System.out.println(iplTeams);
}

 
 
 }



}