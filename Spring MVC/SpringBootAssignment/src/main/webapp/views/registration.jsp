<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<body>
 
<form>
  Username:<br>
  <input type="text" name="username" required>
  <br>
  Email id:<br>
  <input type="email" name="email" required>
  <br><br>
  password:<br>
  <label for="password">password:</label> >
  <input type="password" id="password" name="password"pattern="(?=.[a-z])(?=.*[A-Z]).{8,20}"
  title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required>
  <br><br>
  contact:<br>
  <input type="tel" name="contact" pattern="^\d{10}$" title="must contain 10 digits" required>
  <br><br>
  city:<br>
  <label for="city">city:</label> >
  <select name="city" id="city">
    <option value="Chennai">Chennai</option>
    <option value="Madurai">Madurai</option>
    <option value="Kannyakumari">Kannyakumari</option>
</select>
  <br><br>
  zipcode:<br>
  <input type="tel" name="zipcode" pattern="^\d{6}$" title="Must Contain 6 numbers" required>
  <br><br>
  <input type="submit" value="Submit" required>
</form>
 
</body>
</html>