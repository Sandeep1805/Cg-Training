package REST.SpringRESTassignments.Q3;

public class Address {
    long zipcode;
	String state;
   String city;
   String country;
   public String getState() {
	return state;
}
public Address(String state, String city, String country,long zipcode) {
	super();
	this.state = state;
	this.city = city;
	this.country = country;
	this.zipcode=zipcode;
}
public long getZipcode() {
	return zipcode;
}
public void setZipcode(long zipcode) {
	this.zipcode = zipcode;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

@Override
public String toString() {
	return "Address [state=" + state + ", city=" + city + ", country=" + country + "]";
}
}
