package Q1;

public class Customer {
  int  Id;
  String name;
  long contact;
  public Address address;
public Customer(int id, String name, long contact, Address address) {
	super();
	Id = id;
	this.name = name;
	this.contact = contact;
	this.address = address;
}
  

//  public int getId() {
//	return Id;
//}
//
//public void setId(int id) {
//	Id = id;
//}
//
//public String getName() {
//	return name;
//}
//
//public void setName(String name) {
//	this.name = name;
//}
//
//public long getContact() {
//	return contact;
//}
//
//public void setContact(long contact) {
//	this.contact = contact;
//}
//
//public Address getAddress() {
//	return address;
//}
//
//public void setAddress(Address address) {
//	this.address = address;
//}
//
public void displaycust() {
	  System.out.println("The name of customer is "+name+"with Id "+Id+"and contact is: "+contact);
	  System.out.println("Address is"+address.toString());}


//private String id() {
//	// TODO Auto-generated method stub
//	return null;
//}
}
