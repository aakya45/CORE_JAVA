package com.demo.beans;

public class SavingAccount extends Account{
	public static float interestRate;
	public static float minbal;
	public String cheqbookno;

	//static block for common and shared variables
	static
	{
		interestRate=0.4f;
		minbal=10000;
	}
	//default constructor
	public SavingAccount()
	{
		super();
		this.cheqbookno=null;
	}
	//parameterized constructor
	public SavingAccount(int id,String name,String mobno,float accbal,int pin,String cheqbookno)
	{
		super(id,name,mobno,accbal,pin);
		this.cheqbookno=cheqbookno;
	}
	//getter for interest rate
	public static float getInterestRate() 
	{
		return interestRate;
	}
	//setter for interest rate
	public static void setInterestRate(float interestRate)
	{
		SavingAccount.interestRate = interestRate;
	}
	//getter for min nalance
	public static float getMinbal() 
	{
		return minbal;
	}
	//setter for minbalance
	public static void setMinbal(float minbal) 
	{
		SavingAccount.minbal = minbal;
	}
	//getter for cheqbookno
	public String getCheqbookno() 
	{
		return cheqbookno;
	}
	//setter for cheqbookno
	public void setCheqbookno(String cheqbookno) 
	{
		this.cheqbookno = cheqbookno;
	}
	//to string
	public String toString()
	{
		return super.toString()+" "+"CheqBookNo : "+cheqbookno;
	}
	//withdrawal function
	public void Withdraw(float amount)
	{
		if(accbal-amount>=minbal)
		{
			 this.accbal=this.accbal-amount;
		}
		else
		{
			System.out.println("Insufficient amount to withdrawal!!!");
		}
	}
}
