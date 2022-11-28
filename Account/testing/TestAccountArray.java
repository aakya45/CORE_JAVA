package com.demo.testing;
import java.util.Scanner;

import com.demo.beans.Account;
import com.demo.beans.DematAccount;
import com.demo.beans.SavingAccount;
import com.demo.services.AccountServices;

public class TestAccountArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("******menu*******");
			System.out.println("\n1.Withdraw Amount \n2.Deposit Amount \n3.Check Balance \n4.Change pin num\n5.Open new account \n6.Exit");
			System.out.println("Enter the choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1 ://withdraw amount call
				System.out.println("Enter accno:");
				int accno=sc.nextInt();
				System.out.println("Enter pin num");
				int pin=sc.nextInt();
				System.out.println("Enter ammount :");
				float amt=sc.nextFloat();
				AccountServices.WithdarawAmt(accno, pin, amt);
				System.out.println("Transaction Succsessfull!!");
				break;
			case 2 ://deposite amount call
				break;
			case 3 ://check balance call
				break;
			case 4 ://change pin no call
				System.out.println("Enter accno:");
				int accno1=sc.nextInt();
				System.out.println("Enter old pin num");
				int pin1=sc.nextInt();
				System.out.println("Enter new pin no:");
				int newpin=sc.nextInt();
				boolean status=AccountServices.ChangePin(accno1, pin1, newpin);
					if(status)
					{
						System.out.println("Pin changed!!");
					}
					else
					{
						System.out.println("Pin NOT changed!!");
					}
				break;
			case 5 ://open new account call 
				break;
			case 6 ://exit
				System.out.println("thak you!!");
				sc.close();
				break;
			}
		}while(choice!=6);
	}

}
