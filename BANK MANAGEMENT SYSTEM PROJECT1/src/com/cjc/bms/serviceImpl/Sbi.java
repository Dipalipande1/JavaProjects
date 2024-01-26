package com.cjc.bms.serviceImpl;

import java.util.Scanner;

import com.cjc.bms.service.Rbi;
import com.model.Account;


public class Sbi implements Rbi{
Scanner sc=new Scanner(System.in);

Account ac=new Account();

double balance;

	@Override
	public void createAccount() {
		System.out.println("Enter Account number:  ");
		ac.setAccNo(sc.nextInt());
		
		System.out.println("Enter name: ");
		ac.setName(sc.next());
		
		System.out.println("Enter mobile number:  ");
		ac.setMobNo(sc.nextLong());
		
		System.out.println("Enter Adhar number : ");
		ac.setAdharNo(sc.nextLong());
		
		System.out.println("Enter gender: ");
		ac.setGender(sc.next());
	    
		System.out.println("enter age: "); 
		ac.setAge(sc.nextInt());
		
		System.out.println("Enter balance :   ");
		ac.setBalance(sc.nextDouble());
		
		System.out.println("Your data has been saved: ");
	}

 	@Override
	public void displayAllDetails() {
		System.out.println("Account number:"+ac.getAccNo());
		System.out.println("Name: "+ac.getName());
		System.out.println("Mobile number:"+ac.getMobNo());
		System.out.println("Adhar number :"+ac.getAdharNo());
		System.out.println("Gender :"+ac.getGender());
		System.out.println("Age:"+ac.getAge());
		System.out.println("Balance:"+ac.getBalance());
		
		
	
	}

	@Override
	public void depositeMoney() {
		System.out.println("Enter amount to be debited:  ");
		double a=sc.nextDouble();
		balance=ac.getBalance()+a;
		ac.setBalance(balance);
		System.out.println(ac.getBalance());
		System.out.println("Your money has been debited: ");
				
	}

	@Override
	public void Withdrawal() {
		System.out.println("Enter amount to be withdrawal: ");
		double a=sc.nextDouble();
		balance=ac.getBalance()-a;
		ac.setBalance(balance);
		System.out.println(ac.getBalance());
 		System.out.println("Your money has been withdrawal:  ");
		
	}

	@Override
	public void balanceCheck() {
    System.out.println("Balance is: "+ac.getBalance());
    System.out.println("Balance is" + ac.getBalance());
}
}
