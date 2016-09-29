package Core;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
public class Handler extends HttpServlet 
{
	PdfWriter writer;
	String typeonelocation="C:\\Users\\sudeep ghosh\\workspace\\ResumeBuilderPrototype2\\pdffiles\\ResumeType3.pdf";
	String typetwolocation="C:\\Users\\sudeep ghosh\\workspace\\ResumeBuilderPrototype2\\pdffiles\\ResumeType4.pdf";
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		response.setContentType("test/html");
		PrintWriter out=response.getWriter();
		//String fullname="Abhinav Anand";
		String fullname=request.getParameter("fullname"); 
		String tjobprofile="Job Profile - ";
		//String jobprofile="Database Admin";
		String jobprofile=request.getParameter("jobprofile");
		String tcontactnumber="Contact Number - ";
		//String contactnumber="+917358011548";
		String contactnumber=request.getParameter("phonenumber");
		String temailid="Email Id - ";
		//String emailid="Abhinavanand010@gmail.com";
		String emailid=request.getParameter("emailid");
		String taddress="Address - ";
		String address=request.getParameter("address");
		//String address=request.getParameter("address");
		String tintro="My Work and area of intrest";
		//String intro="A passionate programmer, an admirer and strict follower of Object Orient Programming. Obsessed about coding standards and code quality. As a developer in HCL I have extensively worked with JAVA Reflection API to create generic frameworks which are plug-gable and can be easily extended. As a part of my work have created Validation Framework, Role based permission checking framework. Annotation Processing and meta programming are my other work area. I have also been working with Spring 3 and Hibernate 4.1 to create a Restful web services. Overall 17 months of experience in development of Web & Enterprise applications using JAVA and J2EE";
		String intro=request.getParameter("introduction");
		String tacademicdetails="Academic Details";
		String stcourse="* Course/Degree - ";
		String stschool="  School/College/University Name - ";
		String stmarks="  Percentage/CGPA - ";
		String stpassing="  Passing Date/Pursuring";
		String[] course=new String[6];
		course[0]=request.getParameter("course1");
		course[1]=request.getParameter("course2");
		course[2]=request.getParameter("course3");
		course[3]=request.getParameter("course4");
		course[4]=request.getParameter("course5");
		course[5]=request.getParameter("course6");
		String[] uni=new String[6];
		uni[0]=request.getParameter("school1");
		uni[1]=request.getParameter("school2");
		uni[2]=request.getParameter("school3");
		uni[3]=request.getParameter("school4");
		uni[4]=request.getParameter("school5");
		uni[5]=request.getParameter("school6");
		String[] marks=new String[6];
		marks[0]=request.getParameter("percentage1");
		marks[1]=request.getParameter("percentage2");
		marks[2]=request.getParameter("percentage3");
		marks[3]=request.getParameter("percentage4");
		marks[4]=request.getParameter("percentage5");
		marks[5]=request.getParameter("percentage6");
		String[] yop=new String[6];
		yop[0]=request.getParameter("yearofpassing1");
		yop[1]=request.getParameter("yearofpassing2");
		yop[2]=request.getParameter("yearofpassing3");
		yop[3]=request.getParameter("yearofpassing4");
		yop[4]=request.getParameter("yearofpassing5");
		yop[5]=request.getParameter("yearofpassing6");
		
		String texp="Experience Details";
		String storg="* Organization - ";
		String stdes="  Designation - ";
		String stdur="  Duration ";
		String[] org=new String[6];
		org[0]=request.getParameter("Organization1");
		org[1]=request.getParameter("Organization2");
		org[2]=request.getParameter("Organization3");
		org[3]=request.getParameter("Organization4");
		org[4]=request.getParameter("Organization5");
		org[5]=request.getParameter("Organization6");
		String[] des=new String[6];
		des[0]=request.getParameter("Designation1");
		des[1]=request.getParameter("Designation2");
		des[2]=request.getParameter("Designation3");
		des[3]=request.getParameter("Designation4");
		des[4]=request.getParameter("Designation5");
		des[5]=request.getParameter("Designation6");
		String[] dur=new String[6];
		dur[0]=request.getParameter("Duration1");
		dur[1]=request.getParameter("Duration2");
		dur[2]=request.getParameter("Duration3");
		dur[3]=request.getParameter("Duration4");
		dur[4]=request.getParameter("Duration5");
		dur[5]=request.getParameter("Duration6");
		String tproject="Project Details";
		String stclient="* Client - ";
		String stdesc="  Project Description - ";
		String stdura="  Duration - ";
		String strole="  Role - ";
		String stteam="  Teamsize - ";
		String[] client=new String[6];
		client[0]=request.getParameter("client1");
		client[1]=request.getParameter("client2");
		client[2]=request.getParameter("client3");
		client[3]=request.getParameter("client4");
		client[4]=request.getParameter("client5");
		client[5]=request.getParameter("client6");
		String[] projectdes=new String[6];
		projectdes[0]=request.getParameter("ProjectDescription1");
		projectdes[1]=request.getParameter("ProjectDescription2");
		projectdes[2]=request.getParameter("ProjectDescription3");
		projectdes[3]=request.getParameter("ProjectDescription4");
		projectdes[4]=request.getParameter("ProjectDescription5");
		projectdes[5]=request.getParameter("ProjectDescription6");
		String[] dura=new String[6];
		dura[0]=request.getParameter("pDuration1");
		dura[1]=request.getParameter("pDuration2");
		dura[2]=request.getParameter("pDuration3");
		dura[3]=request.getParameter("pDuration4");
		dura[4]=request.getParameter("pDuration5");
		dura[5]=request.getParameter("pDuration6");
		String[] role=new String[6];
		role[0]=request.getParameter("Role1");
		role[1]=request.getParameter("Role2");
		role[2]=request.getParameter("Role3");
		role[3]=request.getParameter("Role4");
		role[4]=request.getParameter("Role5");
		role[5]=request.getParameter("Role6");
		String[] teamsize=new String[6];
		teamsize[0]=request.getParameter("Teamsize1");
		teamsize[1]=request.getParameter("Teamsize2");
		teamsize[2]=request.getParameter("Teamsize3");
		teamsize[3]=request.getParameter("Teamsize4");
		teamsize[4]=request.getParameter("Teamsize5");
		teamsize[5]=request.getParameter("Teamsize6");
		for(int i=0;i<6;i++)
		{
			System.out.println(teamsize[i]);
		System.out.println(client[i]);	
		}
		String cert="Trainning & Certification";
		String[] train=new String[10];
		train[0]=request.getParameter("Tranning1");
		train[1]=request.getParameter("Tranning2");
		train[2]=request.getParameter("Tranning3");
		train[3]=request.getParameter("Tranning4");
		train[4]=request.getParameter("Tranning5");
		train[5]=request.getParameter("Tranning6");
		train[6]=request.getParameter("Tranning7");
		train[7]=request.getParameter("Tranning8");
		train[8]=request.getParameter("Tranning9");
		train[9]=request.getParameter("Tranning10");
		String interest="Interest";
		String[] intr=new String[5];
		intr[0]=request.getParameter("Hobby1");
		intr[1]=request.getParameter("Hobby2");
		intr[2]=request.getParameter("Hobby3");
		intr[3]=request.getParameter("Hobby4");
		intr[4]=request.getParameter("Hobby5");
		String refrences="References";
		String ref=request.getParameter("Refrence1");
		Type1 type1=new Type1();
		Document d1=new Document();
		
		int lineindex=0;
		
		int verticalindex=800;
		
		try {
			
			//Creates a pdf writer instance and opens the document and returns a writer type
			
			PdfWriter writer=type1.getWriter(d1,typeonelocation);
			
			//Create a border for 1st page
			
			type1.border(writer);
			
			//fullname
			if((fullname.length())>1)
{
			if((fullname.length())>1)
			{
				
			verticalindex=type1.createHeader(writer, verticalindex, fullname,d1);
			
			//underline
			lineindex=lineindex-10;
			type1.underLine(writer, d1, 104, lineindex);
			}
			//inserts the job profile title and the content
			
			if(jobprofile!=null && (jobprofile.length())>=1)
			{
				verticalindex=type1.normalText(writer, verticalindex, tjobprofile+jobprofile);
				lineindex=lineindex-21;
			}
			
			//inserts the contact number title and the content
			
			if(contactnumber!=null && (contactnumber.length())>=1)
			{
				verticalindex=type1.normalText(writer, verticalindex, tcontactnumber+contactnumber);
				lineindex=lineindex-21;
			}
			
			//inserts the email id title and the content
			
			if(emailid!=null && (emailid.length())>=1)
			{
				verticalindex=type1.normalText(writer, verticalindex, temailid+emailid);
				lineindex=lineindex-21;
			}
			
			//inserts the address title and the content
			
			if(address!=null && (address.length())>=1)
			{
				verticalindex=type1.normalText(writer, verticalindex, taddress+address);
				lineindex=lineindex-21;
			}
		type1.underLine(writer, d1, 104, lineindex);
			//inserts the intro title and the content
}		
			if(intro!=null && (intro.length())>=1)
			{
				//verticalindex=verticalindex-10;
				verticalindex=type1.createSubHeader(writer, verticalindex, tintro);
				lineindex=lineindex-27;
				verticalindex=type1.paragraphText(writer, verticalindex, intro);
				 int j=0;
				   do
				   {
					   lineindex=lineindex-21;
				  j=j+138;
				   }while(j<intro.length());
				   type1.underLine(writer, d1, 104, lineindex);
			}
			
			
			
			
			if(course[0]!=null && uni[0]!=null && marks[0]!=null && yop[0]!=null && course[0].length()>=1)
			{
				verticalindex=type1.createSubHeader(writer, verticalindex, tacademicdetails);
				lineindex=lineindex-25;
				int i=0;
				while(i<6 && (course[i].length())>1 && uni[i]!=null && marks[i]!=null && yop[i]!=null)
				{
					verticalindex=type1.normalText(writer, verticalindex, stcourse+course[i]);
					lineindex=lineindex-20;
					verticalindex=type1.normalText(writer, verticalindex, stschool+uni[i]);
					lineindex=lineindex-20;
					verticalindex=type1.normalText(writer, verticalindex, stmarks+marks[i]);
					lineindex=lineindex-21;
					verticalindex=type1.normalText(writer, verticalindex, stpassing+yop[i]);
					lineindex=lineindex-21;
					System.out.println(i);
					i++;
				}
				type1.underLine(writer, d1, 104, lineindex);
			}
			
		
			
			if(org[0].length()>1 &&des[0]!=null&&dur[0]!=null)
			{
				verticalindex=verticalindex-15;
				verticalindex=type1.createSubHeader(writer, verticalindex, texp);
				lineindex=lineindex-25;
				int i=0;
				while(i<6 && (org[i].length())>1 && des[i]!=null && dur[i]!=null)
				{
					verticalindex=type1.normalText(writer, verticalindex,storg+org[i]);
					lineindex=lineindex-21;
					 if(verticalindex<5)
					    {
					    	type1.newPage(d1);
					    	type1.border(writer);
					    	verticalindex=800;
					    	lineindex=-10;
					    }
					verticalindex=type1.normalText(writer, verticalindex, stdes+des[i]);
					lineindex=lineindex-21;
					 if(verticalindex<5)
					    {
					    	type1.newPage(d1);
					    	type1.border(writer);
					    	verticalindex=800;
					    	lineindex=-10;
					    }
					verticalindex=type1.normalText(writer, verticalindex, stdur+dur[i]);
					lineindex=lineindex-20;
					i++;
					 if(verticalindex<5)
					    {
					    	type1.newPage(d1);
					    	type1.border(writer);
					    	verticalindex=800;
					    	lineindex=-10;
					    }
				}
				type1.underLine(writer, d1, 104, lineindex);
			}
			//closes the document

			if(client[0]!=null && projectdes[0]!=null && dura[0]!=null && role[0]!=null && teamsize[0]!=null)
			{
				verticalindex=verticalindex-15;
				verticalindex=type1.createSubHeader(writer, verticalindex, tproject);
				lineindex=lineindex-25;
				int i=0;
				while(i<6 && (client[i].length())>1 && projectdes[i]!=null && dura[i]!=null && role[i]!=null && teamsize[i]!=null)
				{
					verticalindex=type1.normalText(writer, verticalindex,stclient+client[i]);
					lineindex=lineindex-19;
					System.out.println(client[i]);
					verticalindex=type1.normalText(writer, verticalindex, stdesc+projectdes[i]);
					lineindex=lineindex-19;
					verticalindex=type1.normalText(writer, verticalindex, stdura+dura[i]);
					lineindex=lineindex-19;
					verticalindex=type1.normalText(writer, verticalindex, strole+role[i]);
					lineindex=lineindex-19;
					verticalindex=type1.normalText(writer, verticalindex, stteam+teamsize[i]);
					lineindex=lineindex-19;
				    if(verticalindex<5)
				    {
				    	type1.newPage(d1);
				    	type1.border(writer);
				    	verticalindex=800;
				    	lineindex=-10;
				    }
					i++;
				}
			}
			type1.underLine(writer, d1, 104, lineindex);
			
			if((train[0].length())>1)
			{
				verticalindex=verticalindex-15;
				verticalindex=type1.createSubHeader(writer, verticalindex, cert);
			    lineindex=lineindex-25;
			    int i=0;
			    while((train[i].length())>1)
			    {
			    	verticalindex=type1.normalText(writer, verticalindex, "*"+train[i]);
			    	lineindex=lineindex-20;
			    	 if(verticalindex<5)
					    {
					    	type1.newPage(d1);
					    	type1.border(writer);
					    	verticalindex=800;
					    	lineindex=-10;
					    }
			    	 i++;
			    	 if(i==5)
			    	 {
			    		 break;
			    	 }
			    }
			}
			type1.underLine(writer, d1, 104, lineindex);
			if((intr[0].length())>1)
			{
				verticalindex=verticalindex-10;
				verticalindex=type1.createSubHeader(writer, verticalindex, interest);
				lineindex=lineindex-25;
				int i=0;
				while(i<5 && (intr[i].length())>1)
				{
					verticalindex=type1.normalText(writer, verticalindex,"*"+ intr[i]);
					lineindex=lineindex-22;
					i++;
				}
			}
			type1.underLine(writer, d1, 104, lineindex);
			if((ref.length())>1)
			{
			verticalindex=verticalindex-10;
			verticalindex=type1.createSubHeader(writer, verticalindex, refrences);
			lineindex=lineindex-25;
			verticalindex=type1.normalText(writer, verticalindex, ref);
			lineindex=lineindex-25;
			}
			type1.underLine(writer, d1, 104, lineindex);
			//closes the document
			
			
			type1.close(d1);
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Type2 type2=new Type2();
		Document d2=new Document();
		
		lineindex=-10;
		
		verticalindex=800;
		
		try {
			
			//Creates a pdf writer instance and opens the document and returns a writer type
			
			PdfWriter writer=type2.getWriter(d2,typetwolocation);
			
			//Create a border for 1st page
			
			type2.border(writer);
			
			//fullname
			if(fullname.length()>1)
			{
			verticalindex=type2.createHeader(writer, verticalindex, fullname,d1);
			type2.underLine(writer, d2, 104, lineindex);
			}
			//underline
			
			
			
			//inserts the job profile title and the content
			
			if((jobprofile.length())>1)
			{
				verticalindex=type2.normalText(writer, verticalindex, tjobprofile+jobprofile);
				lineindex=lineindex-22;
			}
			
			//inserts the contact number title and the content
			
			if((contactnumber.length())>1)
			{
				verticalindex=type2.normalText(writer, verticalindex, tcontactnumber+contactnumber);
				lineindex=lineindex-22;
			}
			
			//inserts the email id title and the content
			
			if((emailid.length())>1)
			{
				verticalindex=type2.normalText(writer, verticalindex, temailid+emailid);
				lineindex=lineindex-22;
			}
			
			//inserts the address title and the content
			
			if((address.length())>1)
			{
				verticalindex=type2.normalText(writer, verticalindex, taddress+address);
				lineindex=lineindex-22;
				type2.underLine(writer, d2, 104, lineindex);
				//inserts the intro title and the content
			}
			
			
			if((intro.length())>1)
			{
				verticalindex=verticalindex-10;
				verticalindex=type2.createSubHeader(writer, verticalindex, tintro);
				lineindex=lineindex-27;
				verticalindex=type2.paragraphText(writer, verticalindex, intro);
				 int j=0;
				   do
				   {
					   lineindex=lineindex-21;
				  j=j+138;
				   }while(j<intro.length());
			}
			
			
			type2.underLine(writer, d2, 104, lineindex);
			
			if((course[0].length())>1 && uni[0]!=null && marks[0]!=null && yop[0]!=null)
			{
				verticalindex=type2.createSubHeader(writer, verticalindex, tacademicdetails);
				lineindex=lineindex-25;
				int i=0;
				while(i<6 && course[i].length()>1 && uni[i]!=null && marks[i]!=null && yop[i]!=null)
				{
					verticalindex=type2.normalText(writer, verticalindex, stcourse+course[i]);
					lineindex=lineindex-21;
					verticalindex=type2.normalText(writer, verticalindex, stschool+uni[i]);
					lineindex=lineindex-21;
					verticalindex=type2.normalText(writer, verticalindex, stmarks+marks[i]);
					lineindex=lineindex-21;
					verticalindex=type2.normalText(writer, verticalindex, stpassing+yop[i]);
					lineindex=lineindex-21;
					i++;
				}
				type2.underLine(writer, d2, 104, lineindex);
			}
			
			
			
			if((org[0].length())>1 &&des[0]!=null&&dur[0]!=null)
			{
				verticalindex=verticalindex-15;
				verticalindex=type2.createSubHeader(writer, verticalindex, texp);
				lineindex=lineindex-25;
				int i=0;
				while(i<5 && (org[i].length())>1 && des[i]!=null && dur[i]!=null)
				{
					verticalindex=type2.normalText(writer, verticalindex,storg+org[i]);
					lineindex=lineindex-21;
					verticalindex=type2.normalText(writer, verticalindex, stdes+des[i]);
					lineindex=lineindex-21;
					verticalindex=type2.normalText(writer, verticalindex, stdur+dur[i]);
					lineindex=lineindex-21;
					i++;
					 if(verticalindex<5)
					    {
					    	type2.newPage(d1);
					    	type2.border(writer);
					    	verticalindex=800;
					    	lineindex=-10;
					    }
				}
				type2.underLine(writer, d2, 104, lineindex);	
			}
			//closes the document
			
			if(client[0]!=null && projectdes[0]!=null && dur[0]!=null && role[0]!=null && teamsize[0]!=null)
			{
				verticalindex=verticalindex-15;
				verticalindex=type2.createSubHeader(writer, verticalindex, tproject);
				lineindex=lineindex-25;
				int i=0;
				System.out.println(client[2]);
				while((client[i].length())>1 && projectdes[i]!=null && dura[i]!=null && role[i]!=null && teamsize[i]!=null && i<10)
				{
					verticalindex=type2.normalText(writer, verticalindex,stclient+client[i]);
					lineindex=lineindex-19;
					System.out.println(client[i]);
					verticalindex=type2.normalText(writer, verticalindex, stdesc+projectdes[i]);
					lineindex=lineindex-19;
					verticalindex=type2.normalText(writer, verticalindex, stdura+dura[i]);
					lineindex=lineindex-19;
					verticalindex=type2.normalText(writer, verticalindex, strole+role[i]);
					lineindex=lineindex-19;
					verticalindex=type2.normalText(writer, verticalindex, stteam+teamsize[i]);
					lineindex=lineindex-19;
				    if(verticalindex<5)
				    {
				    	type1.newPage(d2);
				    	type1.border(writer);
				    	verticalindex=800;
				    	lineindex=-10;
				    }
					i++;
				}
			}
			type2.underLine(writer, d2, 104, lineindex);
			
			if((train[0].length())>0)
			{
				verticalindex=verticalindex-15;
				verticalindex=type2.createSubHeader(writer, verticalindex, cert);
			    lineindex=lineindex-25;
			    int i=0;
			    while((train[i].length())>1 && i<10)
			    {
			    	verticalindex=type2.normalText(writer, verticalindex, "*"+train[i]);
			    	lineindex=lineindex-20;
			    	 if(verticalindex<5)
					    {
					    	type2.newPage(d2);
					    	type2.border(writer);
					    	verticalindex=800;
					    	lineindex=-10;
					    }
			    	 i++;
			    }
			}
			type2.underLine(writer, d2, 104, lineindex);
			if((intr[0].length())>0)
			{
				verticalindex=verticalindex-10;
				verticalindex=type2.createSubHeader(writer, verticalindex, interest);
				lineindex=lineindex-25;
				int i=0;
				while(i<5 && (intr[i].length())>1)
				{
					verticalindex=type2.normalText(writer, verticalindex,"*"+ intr[i]);
					lineindex=lineindex-22;
					i++;
					if(verticalindex<5)
				    {
				    	type2.newPage(d2);
				    	type2.border(writer);
				    	verticalindex=800;
				    	lineindex=-10;
				    }
				}
				type2.underLine(writer, d2, 104, lineindex);
			}
			
			if((ref.length())>1)
			{
			verticalindex=verticalindex-10;
			verticalindex=type2.createSubHeader(writer, verticalindex, refrences);
			lineindex=lineindex-25;
			verticalindex=type2.normalText(writer, verticalindex, ref);
			lineindex=lineindex-25;
			
			
			type2.underLine(writer, d2, 104, lineindex);
			
			//closes the document
			}
			
			type2.close(d2);
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpSession session=request.getSession();
		RequestDispatcher rs=request.getRequestDispatcher("WebContent/DownloadPage.html");
		try {
			rs.forward(request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
