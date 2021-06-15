<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login </title>
<link rel="stylesheet"
	href="<c:url value="/resources/css/login.css" />">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Big+Shoulders+Display:wght@300&display=swap" rel="stylesheet">

</head>
<body><br><br><br>
  <h1 >Enter your details below to continue</h1>  
  <form method="POST" action="/admin/login">  
      <div class="container">   
          <div>
              <h1 style="color: red;">${message}</h1>
          <input type="email" placeholder="Enter Your Username" name="email" required> </div> 
          <div>
          <input type="password" placeholder="Enter Password" name="password" required>  </div>
          <button type="submit">Login</button>    
          <button type="reset" class="resetbutton">Reset</button>
          <a href="forgot.html" style="color: blue;"> Forgot password?</a>
      </div>   
  </form>     
</body>     
</html>  