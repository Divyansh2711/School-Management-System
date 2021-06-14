<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>
  <meta charset="ISO-8859-1">
  <title>About DPS Delhi</title>
  <base href="/">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="icon" type="image/x-icon" href="favicon.ico">
  <link rel="stylesheet"
	href="<c:url value="/resources/css/styles.css" />">
    <link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Pattaya&display=swap" rel="stylesheet">
</head>
<body>
    <section class="sec" ><br>
        <div class="text-box">
            <img class="logo" src="https://th.bing.com/th/id/OIP.4_EzOmMzv4dpp_AGVAbWhQAAAA?w=125&h=180&c=7&o=5&dpr=1.25&pid=1.7" height="100">&nbsp;
            <span class="text"><h1>DELHI PUBLIC SCHOOL</h1>
            <p>SAIL Township, Delhi, India</p></span>
            <span class="links">
                <nav class="topnav">
                    <ul id="topnav">
                        <LI class="Admin"><a href="/adminLogin" >Admin</a></LI>
                        <LI class="Teacher"><a href="/teacherLogin" >Teacher</a></LI>
                        <LI class="Student"><a href="/studentLogin" >Student</a></LI>
                    </ul>
                </nav>
            </span>
            <span class="registration"><button onclick="window.open('/DPS/school/registration')" class="register" id="registration" type="button">Registration</button> </span>
            <span class="fback"><button class="feedback" href="/feedback" type="submit">Feedback</button> </span>
        </div>
        <br>
        <nav class="nav">
            <ul id="nav">
                <li><a href="/DPS/school">Home</a>
                </li>
                <li><a href="/DPS/school/AboutUs">About Us</a>
                </li>
                <li><a href="/DPS/school/Academics">Academics</a>
                </li>
                <li><a href="/DPS/school/Facilities">Facilities</a>
                </li>
                <li><a href="/DPS/school/Admission">Admission</a>
                </li>
                <li><a href="/DPS/school/Transportation">Transportation</a></li>
                <li><a href="/DPS/school/Programme">Programmes</a>
                </li>
                <li><a href="/DPS/school/Alumni">Alumni</a></li>
                <li><a href="/DPS/school/Contact Us">Contact US</a></li>
            </ul>
        </nav>
       <div class="images">
        <div class="row">
            <div class="column">
                <img src="https://www.dpspatna.com/images/about-us.jpg" width="650" height="200"></div>
            <div class="column">
                <iframe src="https://calendar.google.com/calendar/embed?src=divyanshba4%40gmail.com&ctz=Asia%2FKolkata" style="border: 0" width="300" height="200" frameborder="0" scrolling="no"></iframe>
            </div>
        </div>
        </div><br>
        <div class="description">
            <h1 class="about">ABOUT DPS DELHI</h1><hr class="ruler"><br>
            <p>Delhi Public School Society is one of the largest chains of K-12 schools in the world with over 150 schools in India and foreign shores.
                 The first DPS School was established in 1947 and since then the society has been adding world-class 
                 educational institutions all over India and abroad. <br>  <br>                        
                 The Foundation was set up in 1997 with the explicit objective of establishing educational institutions which would offer 
                 holistic education. DPS Delhi was the first milestone but certainly not the last. The Society strove to make its presence 
                 felt in the four directions and consequently DPS Schools were established in Pune, Ludhiana and Coimbatore. 
                 Excellent Scholastic and Co Scholastic achievements year after year have made these schools create their own niche. </p>
        </div>

    </section><br><br>
    <section class="school"><br>
        <div class="ro">
            <div class="col" id="ourschool">
                <h1 id="h1">Our School</h1><br>
                <ul class="functions">
                    <li><a href="Mgmt.html">The Management</a></li>
                    <li><a href="Mission">Mission and Vision</a></li>
                    <li><a href="Campus.html">Campus</a></li>
                    <li><a href="Message.html">Message from Principal</a></li>
                    <li><a href="Awards.html">Awards</a></li>
                    <li><a href="Almanc.html">E-Almanac</a></li>
                    <li><a href="Socio.html">Social Responsibility</a></li>
                </ul>
            </div>
            <div class="col">
                <h1 id="h2">Academics</h1><br>
                <ul class="functions">
                <li><a href="sensec.html">Senior Secondary (XI-XII)</a></li>
                <li><a href="sec.html">Secondary (VI-X)</a></li>
                <li><a href="prim.html">Primary (I-V)</a></li>
                <li><a href="preprim.html">Pre Primary</a></li>
                <li><a href="staff.html">Staff</a></li>
                <li><a href="booklist.html">Book List</a></li>
                <li><a href="inno.html">Innovative Practices</a></li>
                <li><a href="home.html">Home Policy</a></li>
                </ul>
            </div>
            <div class="col">
                <h1 id="h3">Programmes</h1><br>
                <ul class="functions">
                <li><a href="extra.html">Extra Curricular</a></li>
                <li><a href="visual.html">Visual Arts</a></li>
                <li><a href="preform.html">Performing Arts</a></li>
                <li><a href="international.html">International Collaboration</a></li>
                <li><a href="council.html">Student Council</a></li>
                </ul>
            </div>
            <div class="col">
                <h1 id="h4">Curriculum</h1><br>
                <ul class="functions">
                <li><a href="precurriculum.html">Pre Primary</a></li>
                <li><a href="primcurriculum.html">Primary (I-V)</a></li>
                <li><a href="seccurriculum.html">Secondary(VI-X)</a></li>
                <li><a href="seniorcurriculum.html">Senior Secondary(XI-XII)</a></li>
                </ul>
            </div>
        </div>
        <br>
    </section>
</body>
</html>