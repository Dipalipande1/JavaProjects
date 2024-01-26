package com.cjc.ims.app.client;

import java.util.Scanner;

import com.cjc.ims.app.serviceimpl.Karvenagar;


public class Test {
public static void main(String[] args) {
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
		switch (i) {
		case 1: k.addCourse();
		break;
		case 2:k.viewCourse();
		break;
		case 3:k.addFaculty();
		break;
		case 4 :k.viewFaculty();
		break;
		case 5: k.addBatch();
		break;
		case 6: k.viewBatch();
		break;
		case 7: k.addStudent();
		break;
	    case 8: k.viewStudent();
		break;
		
		}
		
	}
}
}
