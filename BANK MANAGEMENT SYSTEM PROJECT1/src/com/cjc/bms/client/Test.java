package com.cjc.bms.client;
import java.util.Scanner;

import com.cjc.bms.service.Rbi;
import com.cjc.bms.serviceImpl.Sbi;

public class Test{
	public static void main (String args[])
	{
		Rbi bank1=new Sbi();
		Scanner Sc=new Scanner(System.in);

		while(true)
		{
			System.out.println("Choose any number");
			System.out.println("1.createAccount");
			System.out.println("2.viewAccountDetails\n"
					            +"3.Deposite\n"
					            +"4.withdrawalMoney\n"
					            +"5.checkAccount Blance\n"
					            +"6.Exit");
			int i=Sc.nextInt();
			if(i==1)
			{
				
			bank1.createAccount();
			}
			else if(i==2)
			{
				bank1.displayAllDetails();
			}
			else if(i==3)
				
			{
				bank1.depositeMoney();
				
			}
			else if(i==4)
			{
				bank1.Withdrawal();
				
			}
			else if(i==5)
			{
				bank1.balanceCheck();
				
			}
			else if(i==6)
			{
				break;
				
			}
			else {
				System.out.println("Exit");
			}
	}
	}
	}

	
	
	
