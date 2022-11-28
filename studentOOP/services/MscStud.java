package com.demo.services;

import com.demo.beans.StudentData;

public class MscStud extends StudentData
{
	//default cvonstructor
	public MscStud()
	{
		super();
	}
	//parameterrized constructore
	public MscStud(int id,String name,String address,int m1,int m2,int m3)
	{
		super(id,name,address,m1,m2,m3);
	}
    //calculate %
	public float calPercentage()
	{
	  float per=(getM1()+ getM2()+ getM3())/3;
	  return per;
	}
	//to string 
	public String toString()
	{
		return super.toString()+" percentage :"+calPercentage();
	}
}
