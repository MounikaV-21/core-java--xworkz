//DTO - data trancefer object - design part 
//class PassportApplicationDTO{
     class PassportApplication{
	 private int applicantId;
	 private String applicantName;
	 private int applicantAge;
	 private long applicantPhoneNo;
	 private long aadharNo;
	 private double passportFees;
	 private int noOfDaysToProceed;
	 private String state;
	 private String applicantAddress;
	 private String applicantQualification;
	 
	 public void setApplicantId(int applicantId){
		 this.applicantId = applicantId;
	 }
	 public int getApplicantId(){
		 return applicantId;
	 }
	 public void setApplicantName(String applicantName){
		 this.applicantName = applicantName;
	 }
	 public String getApplicantName(){
		 return applicantName;
	 }
	 public void setApplicantAge(int applicantAge){
		 this.applicantAge = applicantAge;
	 }
	 public int getApplicantAge(){
		 return applicantAge;
	 }
	 public void setApplicantPhoneNo(long applicantPhoneNo){
		 this.applicantPhoneNo = applicantPhoneNo;
	 }
	 public long getApplicantPhoneNo(){
		 return applicantPhoneNo;
	 }
	 public void setAadharNo(long aadharNo){
		 this.aadharNo = aadharNo;
	 }
	 public long getAadharNo(){
		 return aadharNo;
	 }
	 public void setPassportFees(double passportFees){
		 this.passportFees = passportFees;
	 }
	 public double getPassportFees(){
		 return passportFees;
	 }
	 public void setNoOfDaysToProceed(int noOfDaysToProceed){
		 this.noOfDaysToProceed = noOfDaysToProceed;
	 }
	 public int getNoOfDaysToProceed(){
		 return noOfDaysToProceed;
	 }
	 public void setState(String state){
		 this.state = state;
	 }
	 public String getState(){
		 return state;
	 }
	 public void setApplicantAddress(String applicantAddress){
		 this.applicantAddress = applicantAddress;
	 }
	 public String getApplicantAddress(){
		 return applicantAddress;
	 }
	 public void setApplicantQualification(String applicantQualification){
		 this.applicantQualification = applicantQualification;
	 }
	 public String getApplicantQualification(){
		 return applicantQualification;
	 }
}