package com.atm;

import java.util.Scanner;


public class Test {

	public static void main (String args[]) throws Exception
		{
			serviceI at=new serviceImpl();
			Scanner Sc=new Scanner(System.in);

			while(true)
			{
				System.out.println("Choose any number");
				System.out.println("1.depositeMoney");
				System.out.println("2.Withdrawal\n"
						            +"3.balanceCheck\n"
				                    +"4.Exit");

				int i=Sc.nextInt();
				if(i==1)
			
				{
					at.depositeMoney();
					
				}
				else if(i==2)
				{
				  
					at.Withdrawal();
					
				}
				else if(i==3)
				{
					at.balanceCheck();
					
				}
				else if(i==4)
				{
					break;
					
				}
				else {
					System.out.println("Exit");
				}
		}
		
						       
						           
	}

}

