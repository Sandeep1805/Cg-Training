package Assignments;

public class Usermodel {
	 private String name;
	 private String password;
	 private String email;
  public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isvalid(String password,String email) {
  	if(email.equals("Kaveesh@gmail.com")&password.equals("password"))
  		return true;
  	return false;
  }
}