package com.cjc.ims.app.serviceimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cjc.ims.app.servicei.Cjc;
import com.cjc.ums.app.model.Batch;
import com.cjc.ums.app.model.Course;
import com.cjc.ums.app.model.Faculty;
import com.cjc.ums.app.model.Student;

    public class Karvenagar implements Cjc
    {
    List<Course> clist=new ArrayList<>();
    List<Faculty> flist =new ArrayList<>();
    List<Batch>blist=new ArrayList<>();
    List<Student>slist=new ArrayList<>();
    Scanner Sc= new Scanner(System.in);
    
    @Override
	public void addCourse() 
    {
	Course c=new Course();
	System.out.println("Adding Course");
	System.out.println("set CourseCid");
	c.setCid(Sc.nextInt());
	System.out.println("set CourseCname");
	c.setCname(Sc.next());
	clist.add(c);
	}
    
	@Override
	public void viewCourse() 
	{
		if(clist.isEmpty())
		{
			System.out.println("List is empty");
	
		}
		else
		{
			Iterator<Course>itr=clist.iterator();
			while (itr.hasNext())
			{
			Course c1=itr.next();
			System.out.println("course id :"+c1.getCid());
			System.out.println("Course Name :"+c1.getCname() );
			}
		}
	}
	
    @Override
    public void addFaculty()
    {
	Faculty f=new Faculty();
	boolean bool = false;
    
   if(clist.isEmpty()) {
	   System.out.println("Course not added  yet...");
   }
   else
   {
	   System.out.println("Adding Faculty");
		System.out.println("set facultyFid");
		int fid =Sc.nextInt();
		f.setFid(fid);
		System.out.println("set FacultyFname");
		f.setFname(Sc.next());
		flist.add(f);
		
		
	    Iterator<Course> citr=clist.iterator();
	    while (citr.hasNext())
	    {
		 Course course=citr.next();
		if(fid==course.getCid())
		{
			f.setCourse(course);
			bool=true;
			break;
		}
	    }
   }
    }
   
    


   public void viewFaculty()  throws NullPointerException
   {
	   if(clist.isEmpty())
		{
			System.out.println("List is empty");
	
		}
		else
		{
	Iterator<Faculty> itr=flist.iterator();
	while (itr.hasNext())
	{
		Faculty f1=itr.next();
		System.out.println("Faculty id :"+f1.getFid());
		System.out.println("Faculty Nmae :"+f1.getFname());
		System.out.println("Course Id :" +f1.getCourse().getCid());
		System.out.println("Course Name : "+f1.getCourse().getCname());
		
	}
		}
	   
   }


@Override
public void addBatch() {
Batch b=new Batch();
boolean bool=false;
System.out.println("Adding batch");
System.out.println("set BatchBid");
int bid=Sc.nextInt();
b.setBid(bid);
System.out.println("set BatchBname");
b.setBname(Sc.next());
blist.add(b);
Iterator<Faculty>bitr=flist.iterator();
while (bitr.hasNext())
{
Faculty faculty =bitr.next();
if(bid==faculty.getFid())
{
	b.setFaculty(faculty);
	bool=true;
	break;
	}
}
if(bool==true)
	System.out.println("Batch added succussfully");
else
{
	System.out.println("enter correct batch id..");
	System.out.println(0);
	

}
	
}

@Override
public void viewBatch() throws NullPointerException
{
Iterator<Batch> itr=blist.iterator();
while(itr.hasNext())
{
	Batch b1=itr.next();
	System.out.println("Batch id:"+b1.getBid());
	System.out.println("Batch name:"+b1.getBname());
	System.out.println("Faculty Id:"+b1.getFaculty().getFid());
	System.out.println("Faculty name:"+b1.getFaculty().getFname());
	System.out.println("Course id:"+b1.getFaculty().getCourse().getCid());
	System.out.println("Course name:"+b1.getFaculty().getCourse().getCname());
}
	
}
@Override
public void addStudent()  { 
	
	Student s=new Student();
    boolean bool=false;
    System.out.println("adding student");
    System.out.println("set StudentSid"); 
    int Sid=Sc.nextInt();
    s.setSid(Sid);
    System.out.println("set studentSname");
    s.setSname(	Sc.next());
    slist.add(s);
    Iterator<Batch>sitr=blist.iterator();
    while(sitr.hasNext())
    {
    	Batch batch=sitr.next();
    if(Sid==batch.getBid())
    {
    	s.setBatch(batch);
    	bool=true;
    	
    	break;
    }
    }

}
@Override
public void viewStudent() throws NullPointerException   {
	Iterator<Student>itr=slist.iterator();
	while(itr.hasNext())
	{
		Student s1=itr.next();
		System.out.println("student id:"+s1.getSid());
		System.out.println("student name:"+s1.getSname());
        System.out.println("Batch id:"+s1.getBatch().getBid());
        System.out.println("Batch name:"+s1.getBatch().getBname());
        System.out.println("faculty id:"+s1.getBatch().getFaculty().getFid());
        System.out.println("faculty name:"+s1.getBatch().getFaculty().getFname());
        System.out.println("Course id:"+s1.getBatch().getFaculty().getCourse().getCid());
        System.out.println("course name:"+s1.getBatch().getFaculty().getCourse().getCname());
	
	}      
	
}
}

