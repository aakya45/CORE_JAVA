package com.demo.beans;

public class Player
{
	private int jercyno;
	private String name;
	private String speciality;

	//default constructor
	public Player()
	{
		this.jercyno=0;
		this.name=null;
		this.speciality=null;
	}
	//parameterized constructor
	public Player(int jercyno,String name,String speciality)
	{
		this.jercyno=jercyno;
		this.name=name;
		this.speciality=speciality;
	}
	//getter setter
	public int getJercyno() 
	{
		return jercyno;
	}
	public void setJercyno(int jercyno)
	{
		this.jercyno = jercyno;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getSpeciality() 
	{
		return speciality;
	}
	public void setSpeciality(String speciality)
	{
		this.speciality = speciality;
	}
	@Override
	public String toString()
	{
		return "Jercyno= "+jercyno+" name="+name+" speciality="+speciality;
	}
}
