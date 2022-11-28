package com.demo.beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Exam
{
	private int examid;
	private String  name;
	private Date examdate;
	public String dt;
	private Questions Q[];
	//default constructor
	public Exam() 
	{
		super();
	}
	//parameterized constructor
	
	public Exam(int examid, String name, String examdate, Questions[] q) 
	{
		super();
		this.examid = examid;
		this.name = name;
		dt=examdate;
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	    try {
			this.examdate=sdf.parse(dt);
		} catch (ParseException e)
	    {
			e.printStackTrace();
		} 
		this.Q = q;
	}
	//getter for examid
	public int getExamid() 
	{
		return examid;
	}
	//setter for examid
	public void setExamid(int examid)
	{
		this.examid = examid;
	}
	//getter for name
	public String getName() 
	{
		return name;
	}
	//setter for name
	public void setName(String name) 
	{
		this.name = name;
	}
	//gettter for examdate
	public String getExamdate() 
	{
		return dt;
	}
	//setter for examdate
	public void setExamdate(Date examdate) 
	{
		this.examdate = examdate;
	}
	//getter for questions
	public Questions[] getQ() 
	{
		return Q;
	}
	//setter for names;
	public void setQ(Questions[] q)
	{
	 this.Q=q;
	}
	//printing exam details
	@Override
	public String toString() 
	{
		//convert date to string
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String dt=sdf.format(examdate);
		return "Examid="+examid+" name="+name+" examdate="+dt+" Q="+Arrays.toString(this.Q);	
	}
}
