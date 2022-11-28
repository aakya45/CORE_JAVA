 package com.demo.beans;

abstract public class Account 
{
	private int id;
	private String name;
	private String mobno;
	protected float accbal;
	private int pin;

	//default constructor
	public Account()
	{
		this.id=0;
		this.name=null;;
		this.mobno=null;
		this.accbal=0;
		this.pin=0;
	}
	//parameterized constructor
	public Account(int id,String name,String mobno,float accbal,int pin)
	{
		this.id=id;
		this.name=name;
		this.mobno=mobno;
		this.accbal=accbal;
		this.pin=pin;
	}
	//getter for id
	public int getId() 
	{
		return id;
	}
	//setter for id
	public void setId(int id)
	{
		this.id = id;
	}
	//getter for name
	public String getName() 
	{
		return name;
	}
	//setter for name
	public void setName(String name) 
	{
		this.name = name;
	}
	//getter for mobno
	public String getMobno() 
	{
		return mobno;
	}
	//setter for mobno
	public void setMobno(String mobno) 
	{
		this.mobno = mobno;
	}
	//getter for balance
	public float getAccbal()
	{
		return accbal;
	}
	//setter for balance
	public void setAccbal(float accbal)
	{
		this.accbal = accbal;
	}
	//getter for pin
	public int getPin() 
	{
		return pin;
	}
	//setter for pin
	public void setPin(int pin) 
	{
		this.pin = pin;
	}
	//deposite funtion
	public void Deposit(float amount)
	{
		this.accbal=this.accbal+amount;
	}
	//for common calling in main
	abstract public void Withdraw(float amount);
	//to string
	public String toString()
	{
		return "Id : "+id+" Name : "+name+" MobNo : "+mobno+" Account Balnce : "+accbal+" PIN : "+pin;
	}
}
