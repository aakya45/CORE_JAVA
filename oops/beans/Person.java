package com.demo.beans;

public class Person 
{
	private int id;
	private String name;
	private String email;

	//default constructor
	public Person()
	{
		this.id=0;
		this.name=null;
		this.email=null;
	}
	//parameterized constructor
	public Person(int id,String name,String email)
	{
		this.id=id;
		this.name=name;
		this.email=email;
	}
	//getters and setters
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
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	} 
	//to string
	public String toString()
	{
		return "ID : "+id+" Name : "+name+" Email : "+email; 
	}
}
