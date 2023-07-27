class Customer1Tester{
public static void main(String test[]){

Customer1 customer = new Customer1();
customer.setCustomerId(1); //int num starts from 1
System.out.println(customer.getCustomerId());

customer.setFirstName("Mounika");
customer.setMiddleName("Reddy");
customer.setLastName("V");
System.out.println(customer.getFirstName() +" "+ customer.getMiddleName() +" "+ customer.getLastName());

customer.setEmail("mounika@gmail.com");
System.out.println(customer.getEmail());

customer.setPhoneNo(9398424823l);
System.out.println(customer.getPhoneNo());

customer.setAddress("Rajajinagar");
System.out.println(customer.getAddress());

customer.setDob("02-10-1999");
System.out.println(customer.getDob());

}
}