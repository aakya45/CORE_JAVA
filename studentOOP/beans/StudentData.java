package com.demo.beans;

abstract public class StudentData extends Student {
	private int m1,m2,m3;

	//default constructore
	public StudentData() 
	{
		this.m1=0;
		this.m2=0;
		this.m3=0;
	}
	//parameterized constructore
	public StudentData(int id,String name,String address,int m1,int m2,int m3)
	{
		super(id,name,address);
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	//getter setter
	public int getM1()
	{
		return m1;
	}
	public void setM1(int m1) 
	{
		this.m1 = m1;
	}
	public int getM2() 
	{
		return m2;
	}
	public void setM2(int m2) 
	{
		this.m2 = m2;
	}
	public int getM3() 
	{
		return m3;
	}
	public void setM3(int m3)
	{
		this.m3 = m3;
	}
	abstract public float calPercentage();
    // to string
	public String toString()
	{
		return super.toString()+" "+"marks 1 : "+m1+" marks : "+m2+" marks3 : "+m3; 
	}
}
