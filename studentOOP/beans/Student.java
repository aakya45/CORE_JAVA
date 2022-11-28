package com.demo.beans;

public class Student 
{
	private int id;
	private String name;
	private String address;

	//default constructore
	public Student()
	{
		this.id=0;
		this.name=null;
		this.address=null;
	}
	//parameterized constructore
	public Student(int id,String name,String adress)
	{
		this.id=id;
		this.name=name;
		this.address=adress;
	}
	//getter setter
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
    // to string
    public String toString()
    {
    	return "ID : "+id+" Name : "+name+" Address : "+address;
    }
}
