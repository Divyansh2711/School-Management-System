<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>

<!doctype html>
<html lang="en">
<head>
  <meta charset="ISO-8859-1">
  <title>Successful Register </title>
  <base href="/">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="icon" type="image/x-icon" href="favicon.ico">
  <link rel="stylesheet"
	href="<c:url value="/resources/css/Success.css" />">
    <link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Pattaya&display=swap" rel="stylesheet">
</head>
<body>

    <div id='card' class="animated fadeIn">
        <div id='upper-side'>
            <h3 id='status'>
            Success
          </h3>
        </div>
        <div id='lower-side'>
          <p id='message'>
            Congratulations, your account has been successfully created.
          </p>
          <a href="DPS/school/registration" class="contBtn">Click to Login</a><br><br>
          <a href="DPS/school" class="contBtn">Return Home</a>
        </div>
      </div>

    </body>
</html>