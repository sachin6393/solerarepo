package day1helloworld;

public class Address {
	private int addressid;
	private String state;
   @Override
	public String toString() {
		return "Address [addressid=" + addressid + ", state=" + state + ", country=" + country + ", city=" + city
				+ ", name=" + name + "]";
	}
private String country;
   private String city;
   private String name;
public int getAddressid() {
	return addressid;
}
public void setAddressid(int addressid) {
	this.addressid = addressid;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
   
}
