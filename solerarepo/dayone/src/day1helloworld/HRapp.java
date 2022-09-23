package day1helloworld;

public class HRapp {
	public static void main(String[] args) {
		employee emp=new employee();
		Address address =new Address();
		
		address.setAddressid(123);
		address.setCity("hardoi");
		address.setState("uttar");
		
     	emp.setAddress(address);
		emp.setEmpid(38);
		emp.setName("sachin verma");
	
		System.out.println(emp);
		
		employee e1=new employee();
		
	}

	
}
