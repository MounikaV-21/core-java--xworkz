class SwitchBoardTester{
public static void main(String sbt[]){
	
	

SwitchBoard board = new SwitchBoard("Cora",4,"plastic","White",100.00);
System.out.println(board.brandName +", "+ board.noOfSwitches +", "+ board.color +", "+ board.type +", "+ board.price);
board.provideElectricity();
System.out.println(" ");

SwitchBoard board1 = new SwitchBoard("Jkw",2,"wooden","brown",300.00);
System.out.println(board1.brandName +", "+ board1.noOfSwitches +", "+ board1.color +", "+ board1.type +", "+ board1.price);
board1.provideElectricity();
System.out.println(" ");

SwitchBoard board2 = new SwitchBoard("hks",8,"fiber","black",500.00);
System.out.println(board2.brandName +", "+ board2.noOfSwitches +", "+ board2.color +", "+ board2.type +", "+ board2.price);

board2.provideElectricity();

}
}
