package com.demo.services;

import com.demo.beans.StudentData;

public class PhdStud extends StudentData{
	private String spesub;
	private int spesubmarks;

	//default constructore
	public PhdStud()
	{
		this.spesub=null;
		this.spesubmarks=0;
	}
	//parameterized constructore
	public PhdStud(int id,String name,String address,int m1,int m2,int m3, String spesub,int spesubmarks)
	{
		super(id,name,address,m1,m2,m3);
		this.spesub=spesub;
		this.spesubmarks=spesubmarks;
	}
	//getter setter
	public String getSpesub() 
	{
		return spesub;
	}
	public void setSpesub(String spesub) 
	{
		this.spesub = spesub;
	}
	public int getSpesubmarks()
	{
		return spesubmarks;
	}
	public void setSpesubmarks(int spesubmarks) 
	{
		this.spesubmarks = spesubmarks;
	}
	//calculate %
	public float calPercentage()
	{
		float per=((getM1()+ getM2()+ getM3())+this.spesubmarks)/4;
		return per;
	}
	//string to string
	public String toString()
	{
		return super.toString()+" "+"Special subject : "+spesub+" Special sub marks : "+spesubmarks+" percentage :"+calPercentage();
	}

}
