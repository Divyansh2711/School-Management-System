<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>
  <meta charset="ISO-8859-1">
  <title>Academic Programmes</title>
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
            <span class="registration"><button onclick="window.open('/DPS/school/registration')" class="register" type="submit">Registration</button> </span>
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
       <br>

        <div class="description">
            <h1 class="about">ACADEMIC PROGRAMME</h1><hr class="ruler"><br>
            <p>DPS Delhi is affiliated to CBSE, New Delhi. The curriculum followed in junior and senior classes is based on NCERT guidelines, albeit with several innovations which are introduced after much research and study. <br><br>
             The Pre-Primary teaching broadly uses the Play Way Method to teach the curriculum. Through this method, teachers facilitate students to understand basic concepts of language and numbers thus giving them the first lessons in Life Skills. The Play Way Method is further reinforced by hands-on activities conducted in and out of the classroom. Field Trips, Nature Walks, Celebrations of Festivals, Topic-based Projects, and Science Experiments form a regular and integral part of learning-through-doing.<br><br>
             Till class III the curriculum is theme-based. The idea behind this is to seamlessly integrate various subjects with a common thread which links them to practical aspect of life. This gives our students a holistic view and allows them to apply knowledge and correlate various subjects to real-life situations<br><br>
             <img src="https://www.dpspatna.com/images/academic-prgrm-3.jpg"><br><br>
             The aims of teaching and learning mathematics are to encourage and enable students to recognize that mathematics permeates the world around us and appreciate the usefulness, power and beauty of mathematics. The purpose is achieved through teaching mathematics to the students of Classes Nursery to  V in a very innovative manner and develop their abstract, logical and critical thinking. Use of Jodo Gyan Kits and self-designed Workbooks eliminate the requirement of text books to strengthen the concepts.<br><br>
             From Class VI formal subjects like Physics, Chemistry, Biology and Political Science are introduced. NCERT books are followed in school but the methodology of delivery is unique which has been developed in consultation with leading experts. Lessons are planned so that students get to learn their subjects in a practical manner with a plethora of projects and activities.<br><br>
             <img src="https://www.dpspatna.com/images/academic-prgrm-2.jpg"><br><br>
             From Class IX, along with intensive studies, career orientation is introduced so that students can decide their future study options.<br><br>
             We have also integrated certain programmes that include some important facets of education otherwise ignored these days. These include the Read Programme, SL & LP (Students Leadership and Life Skills Programme) and Financial Literacy Programme. Since we realize the importance of reading and writing in this digital age, the students are encouraged to read books and articulate their ideas impressively.<br><br>
             <img src="https://www.dpspatna.com/images/academic-prgrm-1.jpg"><br><br>

             <strong><em>Read Programme:&nbsp;</em></strong>Our schools zeal for good old reading continues unabated through the ‘Read Programme’ under which the entire school including the visitors reads silently during a specific period every Monday.<br><br>

             <strong><em>SL and LP:&nbsp;</em></strong>  Students Leadership and Life Skills Programme employs S4D technique i.e. sports for Development. It refers to the intentional use of sport, physical activity and play to attain specific development objectives such as life skills. Socio emotional skills are transformative and they help make the children good communicators and co-operative members of a team.<br><br>

             <img src="https://www.dpspatna.com/images/academic-prgrm-4.jpg"><br><br>

             <strong>Financial Literacy Programme</strong><br><br>

             Financial literacy and discipline are imperative in this age of global work culture. To ensure that our students are well versed in the principles of prudent money management, we have started Financial Literacy Programme for classes VIII to X. Beginning with the rudiments in class VIII, the programme graduates to the advanced study of the financial literacy in class X.
            </p>
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