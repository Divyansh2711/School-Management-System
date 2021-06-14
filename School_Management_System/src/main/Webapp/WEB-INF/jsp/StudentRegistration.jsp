<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
  <meta charset="ISO-8859-1">
  <title>Registration Page</title>
  <base href="/">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="icon" type="image/x-icon" href="favicon.ico">
  <link rel="stylesheet"
	href="<c:url value="/resources/css/registration.css" />">
    <link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Pattaya&display=swap" rel="stylesheet">
</head>
<body>

    <h1>STUDENT REGISTRATION FORM</h1>  
<form method="POST" th:object="${student}" action="DPS/school/registration/process_register">
<table align="center" cellpadding = "10"> 
 
    <!----- First Name ---------------------------------------------------------->
    <tr>
    <td>First Name</td>
    <td><input type="text" name="first_Name" maxlength="30" placeholder="Enter your first name" required field="*{FirstName}" minlength="3"/>
    </td>
    </tr>
     
    <!----- Last Name ---------------------------------------------------------->
    <tr>
    <td>Last Name</td>
    <td><input type="text" name="last_Name" maxlength="30" placeholder="Enter your last name" required field="*{LastName}" minlength="1"/>
    </td>
    </tr>

    <tr>
        <td>Date Of Birth</td>
        <td><input type="date"  maxlength="30" placeholder="Enter your last name" required field="*{DateOfBirthf}" minlength="1"/>
        </td>
        </tr>
     
    <!----- Email Id ---------------------------------------------------------->
    <tr>
    <td>Email Id</td>
    <td><input type="text" name="email" maxlength="100" placeholder="Enter your Email-Id" required field="*{EmailID}"/></td>
    </tr>
     
    <!----- Mobile Number ---------------------------------------------------------->
    <tr>
    <td>Phone Number</td>
    <td>
    <input type="text" name="phone_no" maxlength="10" placeholder="Enter your mobile number" pattern="^[6-9]\d{9}$" required field="*{PhoneNo}" minlength="10"/>
    </td>
    </tr>

    <!----- Gender ---------------------------------------------------------->
    <tr>
        <td>Gender</td>
        <td>
        <label><input type="radio" name="gender" value="Male" required>Male</label>
        <label><input type="radio" name="gender" value="Female" required>Female</label>
        </td>
        </tr>

        <!----- City ---------------------------------------------------------->
        <tr>
            <td>City</td>
            <td><input type="text" name="City" maxlength="30" placeholder="Enter your current city" />
            </td>
            </tr>
             
        <!----- Pin Code ---------------------------------------------------------->
        <tr>
        <td>Pin Code</td>
        <td><input type="text" name="pin" maxlength="6" placeholder="Enter your current area code"/>
        </td>
        </tr>
     
     
        <!----- Address ---------------------------------------------------------->
        <tr>
        <td>Address<br /><br /><br /></td>
        <td><textarea name="Address" rows="3" cols="20" placeholder="Enter your current address" required field="*{Address}" minlength="10"></textarea></td>
        </tr>

        <tr>
        <td>Password</td>
        <td>
        <input type="password" name="password"  placeholder="Enter your password" required field="*{password}" minlength="6"/>
        </td>
        </tr>

    <!----- Submit and Reset ------------------------------------------------->
    <tr>
    <td colspan="2" align="center">
    <button type="submit">Register</button>    
    <button type="reset" class="resetbutton">Reset</button>
    </td>
    </tr>

    <br><br>
    </table>
     
    </form>
    <br><br><br><br>
     
    </body>
    </html>