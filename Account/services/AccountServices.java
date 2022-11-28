package com.demo.services;

import com.demo.beans.Account;
import com.demo.beans.DematAccount;
import com.demo.beans.SavingAccount;

public class AccountServices 
{
	private static Account[] acc=new Account[10];
	private static int count;

	//static block
	static
	{
		//saving accounts
		acc[0]=new SavingAccount(1,"akash","8830626297",89000.2f,1111,"ak4545");
		acc[1]=new SavingAccount(2,"Vaibhav","8830955580",49000.2f,2222,"va4545");
		acc[2]=new SavingAccount(3,"akshay","8969325686",23000.2f,3333,"ak4747");
		acc[3]=new SavingAccount(4,"pritam","7895683215",87000.2f,4444,"pk4556");
		//demat accounts
		acc[4]=new DematAccount(5,"suraj","8545956325",7841.2f,5555,2100.00f);
		acc[5]=new DematAccount(6,"karan","7985698651",85695.2f,6666,1150.00f);
		acc[6]=new DematAccount(7,"baba","9565626368",48004.2f,7777,7890.00f);
		acc[7]=new DematAccount(8,"mayur","7859656325",80040.2f,8888,7850.00f);
		count=8;
	}
	//pin matches withdraw amount else return false
	public static boolean WithdarawAmt(int accno,int pin,float amt)
	{
		Account acc=SearchAcc(accno);
		if(acc!=null)
		{
			if(pin==acc.getPin())
			{
				acc.Withdraw(amt);
				return true;
			}
		}
		return false;
	}
	//search the accno if finds return position to 
	//withdraw amount function
	public static Account SearchAcc(int accno)
	{
		for(int i=0;i<count;i++)
		{
			if(accno==acc[i].getId())
			{
				return acc[i];
			}
		}	
		return null;
	}
	//find account check pin match if matches change pin return true  
	public static boolean ChangePin(int accno,int pin,int newpin)
	{
		Account acc=SearchAcc(accno);
		if(acc!=null && pin==acc.getPin())
		{
			acc.setPin(newpin);
			return true;
		}
		return false;	
	}
	//for opening new account function
	public static void openAccount()
	{
		
	}
}
