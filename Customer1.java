class Customer1{
private int customerId;
private String firstName;
private String middleName;
private String lastName;
private String email;
private long phoneNo;
private String address;
private String dob;

//getter and setter

public void setCustomerId(int customerId){
this.customerId = customerId;
}
	public int getCustomerId(){
		//System.out.println(customerId);
		return customerId;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getFirstName(){
				//System.out.println(firstName);

		return firstName;
	}
	
	public void setMiddleName(String middleName){
		this.middleName = middleName;
	}
	public String getMiddleName(){
		return middleName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String getLastName(){
		return lastName;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return email;
	}
	
	public void setPhoneNo(long phoneNo){
		this.phoneNo = phoneNo;
	}
	public long getPhoneNo(){
		return phoneNo;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return address;
	}
	
	public void setDob(String dob){
		this.dob = dob;
	}
	public String getDob(){
		return dob;
	}
}

