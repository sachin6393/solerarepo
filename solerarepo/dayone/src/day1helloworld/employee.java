package day1helloworld;

import java.time.LocalDate;

public class employee {
	private int empid ;
	private String name ;
	private double salary ;
	private	LocalDate dateofbirth ;
	private Address address ;
	
	public employee()
	{
		
	}
	
	
	
	public employee(int empid, String name, double salary, LocalDate dateofbirth, Address address) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.dateofbirth = dateofbirth;
		this.address = address;
	}



	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(LocalDate dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", dateofbirth=" + dateofbirth
				+ ", address=" + address + "]";
	}

}
