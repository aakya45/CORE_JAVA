package com.demo.beans;

abstract public class Employee extends Person{
	private String desg;
	private String dept;

	//default constructor
	public Employee()
	{
		this.desg=null;
		this.dept=null;
	}
	//parameterized constructor
	public Employee(int id,String name,String email,String desg,String dept)
	{
		super(id,name,email);
		this.desg=desg;
		this.dept=dept;
	}
	//getter setters
	public String getDesg() 
	{
		return desg;
	}
	public void setDesg(String desg) 
	{
		this.desg = desg;
	}
	public String getDept() 
	{
		return dept;
	}
	public void setDept(String dept) 
	{
		this.dept = dept;
	}  
	//to string
	public String toString()
	{
		return super.toString()+" "+"Desg : "+desg+" Dept : "+dept;
	}
	//function declaration 
	abstract public double calSalary();	
}
