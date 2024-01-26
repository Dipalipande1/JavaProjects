package com.cjc.ims.app.client;

	import java.util.Scanner;

	import com.cjc.ims.app.serviceimpl.Karvenagar;

	public class Test1 {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		Karvenagar k=new Karvenagar();
		
		while(true)
		{
			System.out.println("Choose Any number");
			System.out.println("1.addCourse");
			System.out.println("2.viewCourse\n"
					            +"3.addFaculty\n"
					            +"4.viewFaculty\n"
					            +"5.addBatch\n"
					            +"6.viewBatch\n"
					            +"7.addStudent\n"
					            + "8.viewStudent\n"
					            +"9.Exit");
			Scanner sc=new Scanner(System.in);
			int i=sc.nextInt();
			if(i==1)
			{
				k.addCourse();
				System.out.println("------------------------------------");
		    }
		else if(i==2)
		{
			k.viewCourse();
			System.out.println("------------------------------------");

		}
		else if(i==3)
			
		{
			k.addFaculty();
			System.out.println("------------------------------------");

		}
		else if(i==4)
		{
			try {
			k.viewFaculty();
			}
			catch(NullPointerException e)
			{
				System.out.println("Exception : "+e);
			}
			System.out.println("------------------------------------");

		}
			else if(i==5)
			{
			k.addBatch();	
			System.out.println("------------------------------------");

			}
			else if(i==6)
			{
				try {
					k.viewBatch();
					}
					catch(NullPointerException e)
					{
						System.out.println("Exception : "+e);
					}
			System.out.println("------------------------------------");

			}
			else if(i==7)
			{
			k.addStudent();
			System.out.println("------------------------------------");

			}
			else if(i==8)
			{
				try {
					k.viewStudent();
					}
					catch(NullPointerException e)
					{
						System.out.println("Exception : "+e);
					}
			System.out.println("------------------------------------");
			}
			else if(i==9)
			{
				System.exit(0);
			}
			else
			{
				System.out.println("Wrong choice");
			}
		
		}
	}
	}
	