package com.demo.beans;

public class SalariedEmp extends Employee{
	private double sal,bonus;
	//default constructor
	public SalariedEmp()
	{
		this.sal=0;
		this.bonus=0;
	}
	//parameterized constructor
	public SalariedEmp(int id,String name,String email,String desg,String dept,double sal)
	{   
		super(id,name,email,desg,dept);
		this.sal=sal;
		this.bonus=0.10*sal;
	}
	//getters and setters
	public double getSal() 
	{
		return sal;
	}
	public void setSal(double sal) 
	{
		this.sal = sal;
	}
	public double getBonus() 
	{
		return bonus;
	}
	public void setBonus(double bonus) 
	{
		this.bonus = bonus;
	}
	//calSalary function
	public double calSalary()
	{
		sal = sal+0.10*sal+0.15*sal-0.09*sal+this.bonus;
		return sal;
		//return sal+0.10*sal+0.10*sal-0.01*sal+this.bonus;
	}
	//to string
	public String toString()
	{
		return super.toString()+" "+"Salary : "+sal+" Bonus : "+bonus;
	}
}
