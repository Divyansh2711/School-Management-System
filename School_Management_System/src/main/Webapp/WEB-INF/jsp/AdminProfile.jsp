<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
    <head>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Josefin+Sans" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="neon button.css">
        <link rel="stylesheet" href="<c:url value="/resources/css/AdminProfile.css" />">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Reggae+One&display=swap" rel="stylesheet">
        <title>Admin Profile Page</title>    
    </head>
    <body><br><br>
        <div class="container">
            <div class="main">
                <div class="topbar">
                    <img class="logo" src="logo.gif" height ="150" width ="150">
                    <span style="color:midnightblue; font-weight:150 ;font-size:3vmax;font-family: 'Reggae One', cursive;padding-left: 50px;"> Welcome Aboard!!! </span>
                    <span class="lout"><button type="submit" class="logout">Logout</button></span>
                </div>
                    <div class="row">
                        <div class="col-md-4 mt-1">
                            <div class="card text-center sidebar">
                                <div class="card-body">
                                    <img src="Admin.png" class="rounded-circle" width="75" height="100">
                                    <div class="mt-3">
                                        <h4 style="font-weight: 500;font-style: italic;color: #C8A165;">Hello Vignesh!!!</h4>
                                        <div class="button">Edit Profile</div>
                                        <hr>
                                        <div class="button">Add new Admin</div>
                                        <hr>
                                        <div  class="button"><a href="DPS/school/registration">Add new Student</a></div>
                                        <hr>
                                        <div class="button"><a href="DPS/school/Teacherregistration">Add new Teacher</a></div>
                                        <hr>
                                        <div class="button">Add News</div>
                                        <hr>
                                        <div class="button">Add Events</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-8 mt-1">
                            <div class="card mb-3 content">
                                <h3 class="m-3 pt-3">About</h3>
                                <div class="card-body">
                                    <div class="row">
                                        <div class="col-md-3">
                                            <h6>Full Name :</h6>
                                        </div>
                                        <div class="col-md-9 text-secondary">
                                          Vignesh G.
                                        </div>
                                    </div>
                                  
                                    <div class="row">
                                        <div class="col-md-3">
                                            <h6>Age :</h6>
                                        </div>
                                        <div class="col-md-9 text-secondary">
                                            45
                                        </div>
                                    </div>
                                   
                                    <div class="row">
                                        <div class="col-md-3">
                                            <h6>Gender :</h6>
                                        </div>
                                        <div class="col-md-9 text-secondary">
                                           Male
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-3">
                                            <h6>Email-Id :</h6>
                                        </div>
                                        <div class="col-md-9 text-secondary">
                                          xyz@gmail.com
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-3">
                                            <h6>Phone number</h6>
                                        </div>
                                        <div class="col-md-9 text-secondary">
                                            9999999999
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-3">
                                            <h6>Address :</h6><br>
                                    </div>
                                    <div class="col-md-9 text-secondary">
                                    street xyz
                                </div>
                            </div>
                        </div>
                    </div><br><br>
                    <div class="sub">
                        
                        <button id="submit" type="submit" >Submit</button>
                    
              
                      </div>
                  </div>
              </div>
          </div>
      </div>
     </div>
                    
        </div>
       </div>
      
    </div>
    </body>
</html>