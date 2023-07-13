class Bank{
	static String bankName = "SBI";
	static String location = "Bangalore";
	static int branchCode = 1234;
	static long ifscCode = 12345678L;
	static int noOfAccounts = 100;
	
	public static void main(String bank[]){
		System.out.println("The bank name is " +bankName);
		System.out.println("The bank location is " +location);
		System.out.println("The bank branch code is " +branchCode);
		System.out.println("The bank ifsc code is " +ifscCode);
		System.out.println("The bank no of acoounts is " +noOfAccounts);
	}
}