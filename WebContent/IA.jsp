<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="IA.css" rel="stylesheet" type="text/css">
<script src="IA.js" type="text/javascript"></script>

</head>
<body>
<!-- Header box with the color -->
<div class="box1">
<!-- Header -->
<div id="header" >
<!-- Logo -->
<div id="logo">
<img alt="" src="images/Logo3.png">
</div>
<!-- Header Text -->
<div id="header-text">Resume Builder</div>
</div>
</div>
<hr/>
<!-- Option button -->
<div class="box2">
<input type="button" id="active1" onclick="step1()" value="Contact Information:"><div id="arrow-right1"></div>
<input type="button" id="active2" onclick="step2()" value="Work & Area of Intrest:"><div id="arrow-right2"></div>
<input type="button" id="active3" onclick="step3()" value="Academic Details:"><div id="arrow-right3"></div>
<input type="button" id="active4" onclick="step4()" value="Experience Details:"><div id="arrow-right4"></div>
<input type="button" id="active5" onclick="step5()" value="Project Details:"><div id="arrow-right5"></div>
<input type="button" id="active6" onclick="step6()" value="Trainning & Certification:"><div id="arrow-right6"></div>
<input type="button" id="active7" onclick="step7()" value="Interest & Hobbies:"><div id="arrow-right7"></div>
<input type="button" id="active8" onclick="step8()" value="References:"><div id="arrow-right8"></div>
</div>
<form action="Handler">
<div class="box3">
<field id="first">
<input class="text_field" name="fullname" placeholder="Full Name" type="text" value=""> 
<input class="text_field" name="jobprofile" placeholder="Job Profile" type="text" value="">
<input class="text_field" name="emailid" placeholder="email" type="text" value="">
<input class="text_field" name="phonenumber" placeholder="Phone Number" type="text" value="">
<input class="text_field" name="address" placeholder="Address" type="text" value="">
</field>
<field id="second">
<textarea rows="5" cols="15" name="introduction" type="text" value=""></textarea>
</field>
<field id="third">
<div id="sub1">
<input class="text_field" name="course1" placeholder="Course" type="text" value="">
<input class="text_field" name="school1" placeholder="School/College/University" type="text" value="">
<input class="text_field" name="percentage1" placeholder="Percentage" type="text" value="">
<input class="text_field" name="yearofpassing1" placeholder="Year Of Passing" type="text" value="">
<div id="a1">
<input type="addbutton1" onclick="addfield1()" placeholder="add">
</div>
</div>
<div id="sub2">
<input class="text_field" name="course2" placeholder="Course" type="text" value="">
<input class="text_field" name="school2" placeholder="School/College/University" type="text" value="">
<input class="text_field" name="percentage2" placeholder="Percentage" type="text" value="">
<input class="text_field" name="yearofpassing2" placeholder="Year Of Passing" type="text" value="">
<div id="a2">
<input type="addbutton2" onclick="addfield2()" placeholder="add">
</div>
</div>
<div id="sub3">
<input class="text_field" name="course3" placeholder="Course" type="text" value="">
<input class="text_field" name="school3" placeholder="School/College/University" type="text" value="">
<input class="text_field" name="percentage3" placeholder="Percentage" type="text" value="">
<input class="text_field" name="yearofpassing3" placeholder="Year Of Passing" type="text" value="">
<div id="a3">
<input type="addbutton3" onclick="addfield3()" placeholder="add">
</div>
</div>
<div id="sub4">
<input class="text_field" name="course4" placeholder="Course" type="text" value="">
<input class="text_field" name="school4" placeholder="School/College/University" type="text" value="">
<input class="text_field" name="percentage4" placeholder="Percentage" type="text" value="">
<input class="text_field" name="yearofpassing4" placeholder="Year Of Passing" type="text" value="">
<div id="a4">
<input type="addbutton4" onclick="addfield4()" placeholder="add">
</div>
</div>
<div id="sub5">
<input class="text_field" name="course5" placeholder="Course" type="text" value="">
<input class="text_field" name="school5" placeholder="School/College/University" type="text" value="">
<input class="text_field" name="percentage5" placeholder="Percentage" type="text" value="">
<input class="text_field" name="yearofpassing5" placeholder="Year Of Passing" type="text" value="">
<div id="a5">
<input type="addbutton5" onclick="addfield5()" placeholder="add">
</div>
</div>
<div id="sub6">
<input class="text_field" name="course6" placeholder="Course" type="text" value="">
<input class="text_field" name="school6" placeholder="School/College/University" type="text" value="">
<input class="text_field" name="percentage6" placeholder="Percentage" type="text" value="">
<input class="text_field" name="yearofpassing6" placeholder="Year Of Passing" type="text" value="">
</div>
</field>
<field id="fourth">
<div id="expsub1">
<input class="text_field" name="Organization1" placeholder="Organization" type="text" value="">
<input class="text_field" name="Designation1" placeholder="Designation" type="text" value="">
<input class="text_field" name="Duration1" placeholder="Duration" type="text" value="">
<div id="e1">
<input type="addbutton6" onclick="addfield6()" placeholder="add">
</div>
</div>
<div id="expsub2">
<input class="text_field" name="Organization2" placeholder="Organization" type="text" value="">
<input class="text_field" name="Designation2" placeholder="Designation" type="text" value="">
<input class="text_field" name="Duration2" placeholder="Duration" type="text" value="">
<div id="e2">
<input type="addbutton7" onclick="addfield7()" placeholder="add">
</div>
</div>
<div id="expsub3">
<input class="text_field" name="Organization3" placeholder="Organization" type="text" value="">
<input class="text_field" name="Designation3" placeholder="Designation" type="text" value="">
<input class="text_field" name="Duration3" placeholder="Duration" type="text" value="">
<div id="e3">
<input type="addbutton8" onclick="addfield8()" placeholder="add">
</div>
</div>
<div id="expsub4">
<input class="text_field" name="Organization4" placeholder="Organization" type="text" value="">
<input class="text_field" name="Designation4" placeholder="Designation" type="text" value="">
<input class="text_field" name="Duration4" placeholder="Duration" type="text" value="">
<div id="e4">
<input type="addbutton9" onclick="addfield9()" placeholder="add">
</div>
</div>
<div id="expsub5">
<input class="text_field" name="Organization5" placeholder="Organization" type="text" value="">
<input class="text_field" name="Designation5" placeholder="Designation" type="text" value="">
<input class="text_field" name="Duration5" placeholder="Duration" type="text" value="">
<div id="e5">
<input type="addbutton10" onclick="addfield10()" placeholder="add">
</div>
</div>
<div id="expsub6">
<input class="text_field" name="Organization6" placeholder="Organization" type="text" value="">
<input class="text_field" name="Designation6" placeholder="Designation" type="text" value="">
<input class="text_field" name="Duration6" placeholder="Duration" type="text" value="">
</div>
</field>
<field id="fifth">
<div id="prosub1">
<input class="text_field" name="client1" placeholder="Client" type="text" value="">
<input class="text_field" name="ProjectDescription1" placeholder="Project Description" type="text" value="">
<input class="text_field" name="pDuration1" placeholder="Duration" type="text" value="">
<input class="text_field" name="Role1" placeholder="Role" type="text" value="">
<input class="text_field" name="Teamsize1" placeholder="Teamsize" type="text" value="">
<div id="p1">
<input type="addbutton11" onclick="addfield11()" placeholder="add">
</div>
</div>
<div id="prosub2">
<input class="text_field" name="client2" placeholder="Client" type="text" value="">
<input class="text_field" name="ProjectDescription2" placeholder="Project Description" type="text" value="">
<input class="text_field" name="pDuration2" placeholder="Duration" type="text" value="">
<input class="text_field" name="Role2" placeholder="Role" type="text" value="">
<input class="text_field" name="Teamsize2" placeholder="Teamsize" type="text" value="">
<div id="p2">
<input type="addbutton12" onclick="addfield12()" placeholder="add">
</div>
</div>
<div id="prosub3">
<input class="text_field" name="client3" placeholder="Client" type="text" value="">
<input class="text_field" name="ProjectDescription3" placeholder="Project Description" type="text" value="">
<input class="text_field" name="pDuration3" placeholder="Duration" type="text" value="">
<input class="text_field" name="Role3" placeholder="Role" type="text" value="">
<input class="text_field" name="Teamsize3" placeholder="Teamsize" type="text" value="">
<div id="p3">
<input type="addbutton13" onclick="addfield13()" placeholder="add">
</div>
</div>
<div id="prosub4">
<input class="text_field" name="client4" placeholder="Client" type="text" value="">
<input class="text_field" name="ProjectDescription4" placeholder="Project Description" type="text" value="">
<input class="text_field" name="pDuration4" placeholder="Duration" type="text" value="">
<input class="text_field" name="Role4" placeholder="Role" type="text" value="">
<input class="text_field" name="Teamsize4" placeholder="Teamsize" type="text" value="">
<div id="p4">
<input type="addbutton14" onclick="addfield14()" placeholder="add">
</div>
</div>
<div id="prosub5">
<input class="text_field" name="client5" placeholder="Client" type="text" value="">
<input class="text_field" name="ProjectDescription5" placeholder="Project Description" type="text" value="">
<input class="text_field" name="pDuration5" placeholder="Duration" type="text" value="">
<input class="text_field" name="Role5" placeholder="Role" type="text" value="">
<input class="text_field" name="Teamsize5" placeholder="Teamsize" type="text" value="">
<div id="p5">
<input type="addbutton15" onclick="addfield15()" placeholder="add">
</div>
</div>
<div id="prosub6">
<input class="text_field" name="client6" placeholder="Client" type="text" value="">
<input class="text_field" name="ProjectDescription6" placeholder="Project Description" type="text" value="">
<input class="text_field" name="pDuration6" placeholder="Duration" type="text" value="">
<input class="text_field" name="Role6" placeholder="Role" type="text" value="">
<input class="text_field" name="Teamsize6" placeholder="Teamsize" type="text" value="">
</div>
</field>
<field id="sixth">
<div id="trainsub1">
<input class="text_field" name="Tranning1" placeholder="Tranning & Certification" type="text" value="">
<div id="t1">
<input type="addbutton16" onclick="addfield16()" placeholder="add">
</div>
</div>
<div id="trainsub2">
<input class="text_field" name="Tranning2" placeholder="Tranning & Certification" type="text" value="">
<div id="t2">
<input type="addbutton17" onclick="addfield17()" placeholder="add">
</div>
</div>
<div id="trainsub3">
<input class="text_field" name="Tranning3" placeholder="Tranning & Certification" type="text" value="">
<div id="t3">
<input type="addbutton18" onclick="addfield18()" placeholder="add">
</div>
</div>
<div id="trainsub4">
<input class="text_field" name="Tranning4" placeholder="Tranning & Certification" type="text" value="">
<div id="t4">
<input type="addbutton19" onclick="addfield19()" placeholder="add">
</div>
</div>
<div id="trainsub5">
<input class="text_field" name="Tranning5" placeholder="Tranning & Certification" type="text" value="">
<div id="t5">
<input type="addbutton20" onclick="addfield20()" placeholder="add">
</div>
</div>
<div id="trainsub6">
<input class="text_field" name="Tranning6" placeholder="Tranning & Certification" type="text" value="">
</div>
</field>
<field id="seventh">
<input class="text_field" name="Hobby1" placeholder="Hobbies & Intrests" type="text" value="">
<input class="text_field" name="Hobby2" placeholder="Hobbies & Intrests" type="text" value="">
<input class="text_field" name="Hobby3" placeholder="Hobbies & Intrests" type="text" value="">
<input class="text_field" name="Hobby4" placeholder="Hobbies & Intrests" type="text" value="">
<input class="text_field" name="Hobby5" placeholder="Hobbies & Intrests" type="text" value="">
</field>
<field id="eighth">
<input class="text_field" name="Refrence1" placeholder="Refrence" type="text" value="">
<input class="text_field" name="Refrence2" placeholder="Refrence" type="text" value="">
<input class="text_field" name="Refrence3" placeholder="Refrence" type="text" value="">
</field>
</div>
<input type="submit"   value="Done">
</form>
</body>
</html>