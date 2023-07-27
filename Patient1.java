/* public class Patient{
	
	// 5 Rules

1. public class
2. default constructor
3. private variables/data-members/states/fields
4. public getter and setter
5. OOPS 
*/


class Patient1{
private int patientId;
private String name;
private int age;
private String bloodGroup;
private String gender;
private String address;
private long contactNo;
private int wardNo;
private String attenderName;
private String diseaseName;
private String consultant;
private String hospitalName;
private double fees;

public void setPatientId(int patientId){
	this.patientId = patientId;
}
public int getPatientId(){
	return patientId;
}

public void setName(String name){
	this.name = name;
}
public String getName(){
	return name;
}

public void setAge(int age){
	this.age = age;
}
public int getAge(){
	return age;
}

public void setBloodGroup(String bloodGroup){
	this.bloodGroup = bloodGroup;
}
public String getBloodGroup(){
	return bloodGroup;
}

public void setGender(String gender){
	this.gender = gender;
}
public String getGender(){
	return gender;
}

public void setAddress(String address){
	this.address = address;
}
public String getAddress(){
	return address;
}

public void setContactNo(long contactNo){
	this.contactNo = contactNo;
}
public long getContactNo(){
	return contactNo;
}

public void setWardNo(int wardNo){
	this.wardNo = wardNo;
}
public int getWardNo(){
	return wardNo;
}

public void setAttenderName(String attenderName){
	this.attenderName = attenderName;
}
public String getAttenderName(){
	return attenderName;
}

public void setDiseaseName(String diseaseName){
	this.diseaseName = diseaseName;
}
public String getDiseaseName(){
	return diseaseName;
}

public void setConsultant(String consultant){
	this.consultant = consultant;
}
public String getConsultant(){
	return consultant;
}

public void setHospitalName(String hospitalName){
	this.hospitalName = hospitalName;
}
public String getHospitalName(){
	return hospitalName;
}

public void setFees(double fees){
	this.fees = fees;
}
public double getFees(){
	return fees;
}

}