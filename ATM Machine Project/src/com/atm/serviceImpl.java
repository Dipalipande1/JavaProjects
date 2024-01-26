package com.atm;

import java.util.Scanner;

public class serviceImpl implements serviceI {

	
	Scanner sc=new Scanner(System.in);
    
	ATM at=new ATM();
    
   double balance;
   
   
 
 @Override
	public void depositeMoney() 
	{
	 System.out.println("Enter amount to be debited:  ");
		double a=sc.nextDouble();
		balance=at.getBalance()+a;
		at.setBalance(balance);
		System.out.println(at.getBalance());
		System.out.println("Your money has been debited: ");
				
	}
      @Override
		public void Withdrawal() {
			System.out.println("Enter amount to be withdrawal: ");
		
			double a=sc.nextDouble();
			
			double balance = at.getBalance()-a;
			at.setBalance(balance);
			System.out.println(at.getBalance());
	 		System.out.println("Your money has been withdrawal:  ");
			
	}

	  @Override
		public void balanceCheck() {
	   
		System.out.println("Balance is: "+at.getBalance());
	    System.out.println("Balance is" + at.getBalance());
	}
	}


