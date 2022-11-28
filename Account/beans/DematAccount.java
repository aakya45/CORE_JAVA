package com.demo.beans;

public  class DematAccount extends Account{
	public static float interestRate;
	private float commision;

	//static block for common and shared variables
	static
	{
		interestRate=0.8f;
	}
	//default constructor
	public DematAccount()
	{
		super();
		this.commision=0;
	}
	//parameterized constructor
	public DematAccount(int id,String name,String mobno,float accbal,int pin,float commision)
	{
		super(id,name,mobno,accbal,pin);
		this.commision=commision;
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
	//getter for commition
	public float getCommision() 
	{
		return commision;
	}
	//setter for commition
	public void setCommision(float commision) 
	{
		this.commision = commision;
	}
	//withdrawal function
	public void Withdraw(float amount)
	{
		if(accbal-amount<=5000 && accbal-amount>0)
		{
				this.accbal=this.accbal-amount;
		}
		else
		{
			System.out.println("exceeding withdrawal limit!!!");
		}
	}
	//string 
	public String toString()
	{
		return super.toString()+" "+"Commition : "+commision;

	}

}
