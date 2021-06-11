<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>
  <meta charset="ISO-8859-1">
  <title>Delhi Public School</title>
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
                        <LI class="Admin"><a href="/login.do" >Admin</a></LI>
                        <LI class="Teacher"><a href="/login.do" >Teacher</a></LI>
                        <LI class="Student"><a href="/login.do" >Student</a></LI>
                    </ul>
                </nav>
            </span>
            <span class="registration"><button href="/registration" class="register" type="submit">Registration</button> </span>
            <span class="fback"><button class="feedback" href="/feedback" type="submit">Feedback</button> </span>
        </div>
        <br>
        <nav class="nav">
            <ul id="nav">
                <li><a href="AboutUs.html">About Us</a>
                </li>
                <li><a href="Academics.html">Academics</a>
                </li>
                <li><a href="Facilities.html">Facilities</a>
                </li>
                <li><a href="Fee Structure.html">Admission</a>
                </li>
                <li><a href="Transportation.html">Transportation</a></li>
                <li><a href="Programmes.html">Programmes</a>
                </li>
                <li><a href="Alumni.html">Alumni</a></li>
                <li><a href="Vacancy.html">Vacancy</a></li>
                <li><a href="ContactUs.html">Contact US</a></li>
            </ul>
        </nav>
       <div class="images">
        <div class="row">
            <div class="column">
                <img src="https://west.dpsbangalore.edu.in/wp-content/uploads/2020/10/1.jpg" width="650" height="200"></div>
            <div class="column">
                <iframe src="https://calendar.google.com/calendar/embed?src=divyanshba4%40gmail.com&ctz=Asia%2FKolkata" style="border: 0" width="300" height="200" frameborder="0" scrolling="no"></iframe>
            </div>
        </div>
        </div>
        <div class="description">
            <h1 class="motto">Our Motto (Service before Self)</h1><hr class="ruler"><br>
            <h1 class="moto">Our Motto</h1><br>
            <p class="quote">The best way to find yourself is to lose yourself in the service of others. - Mahatma Gandhi </p><br>
            <p>To keep alive the spirit of Gandhiji in his own land, DPS Dwarka endeavours to meet the expectations of others in its attempt to follow perfect altruism. 
                Taking up the responsibility of facilitating education to the next generation, DPS Dwarka proves to be an exemplar of assistance at every opportunity. 
                With the wish to extend its helping hand, this institution has gained the faith of society and grown in leaps and bounds. From instilling values in 
                students to adopting villages and joining hands with social organizations in teaching under privileged children, DPS Dwarka has always experienced 
                the joy of sharing. <br>  <br>                        
                <em>Service before self</em> is an intentional, lifelong mission taken up to endorse the idea of a life well lived. The idea of living a happy life is 
                to be useful, to be honourable and to be compassionate. Becoming more generous and compassionate will have real tangible benefits in everyone life.  
                Thus the motto of DPS Dwarka <em>Service before self</em> shapes the foundation of each and every student and how they live their lives. </p>
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