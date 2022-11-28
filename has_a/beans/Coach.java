package com.demo.beans;

public class Coach 
{
	private int chid;
	private String name;
	private String role;
	private int experience;

	//default constructor
	public Coach()
	{
		this.chid=0;
		this.name=null;
		this.role=null;
		this.experience=0;
	}
	//parameterized constructor
	public Coach(int chid,String name,String role,int experience)
	{
		this.chid=chid;
		this.name=name;
		this.role=role;
		this.experience=experience;
	}
	//getter settter
	public int getChid() 
	{
		return chid;
	}
	public void setChid(int chid) 
	{
		this.chid = chid;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getRole()
	{
		return role;
	}
	public void setRole(String role) 
	{
		this.role = role;
	}
	public int getExperience() 
	{
		return experience;
	}
	public void setExperience(int experience)
	{
		this.experience = experience;
	}
	//to string
	@Override
	public String toString() 
	{
		return "chid="+chid+" name="+name+" role="+role+" experience="+experience;
	}

}
