package com.demo.beans;

public class ContEmp extends Employee{

	private int hr;
	private double chrg;
	//default constructor
	public ContEmp()
	{
		this.hr=0;
		this.chrg=0;
	}
	//parameterized constructor
	public ContEmp(int id,String name,String email,String desg,String dept,int hr,double chrg)
	{
		super(id,name,email,desg,dept);
		this.hr=hr;
		this.chrg=chrg;
	}
	//getter setter
	public int getHr() 
	{
		return hr;
	}
	public void setHr(int hr) 
	{
		this.hr = hr;
	}
	public double getChrg() 
	{
		return chrg;
	}
	public void setChrg(double chrg) 
	{
		this.chrg = chrg;
	}
	//calsalary 
	public double calSalary()
	{
		chrg=hr*chrg;
		return chrg;
	}
	// to string
	public String toString()
	{
		return super.toString()+" "+"Hours : "+hr+" Charges : "+chrg;
	}
}
