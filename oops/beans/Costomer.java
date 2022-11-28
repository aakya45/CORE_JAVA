package com.demo.beans;

public class Costomer extends Person{
	private String type,deladdress;

	//defauult constructore
	public Costomer()
	{
		this.type = null;
		this.deladdress = null;
	}
	//parameterized constructore
	public Costomer(int id,String name,String email,String type, String deladdress)
	{
		super(id,name,email);
		this.type = type;
		this.deladdress = deladdress;
	}
	//getter setter
	public String getType() 
	{
		return type;
	}
	public void setType(String type) 
	{
		this.type = type;
	}
	public String getDeladdress() 
	{
		return deladdress;
	}
	public void setDeladdress(String deladdress) 
	{
		this.deladdress = deladdress;
	}
	//to string
	public String toString()
	{
		return super.toString()+" "+"Costomer Type : "+type+" Address : "+deladdress;
	}
}
