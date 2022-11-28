package com.demo.beans;

public class Questions 
{
	private int qno;
	private String question;
	private String opt1;
	private String opt2;
	private String opt3;
	private String opt4;
	private String ans;
	private static int marks;
	//default constructor
	public Questions() 
	{
		super();
		this.qno = 0;
		this.question = null;
		this.opt1 = null;
		this.opt2 = null;
		this.opt3 = null;
		this.opt4 = null;
		this.ans = null;
		this.marks = 0;
	}
	//parameterized constructor
	public Questions(int qno, String question, String opt1, String opt2, String opt3, String opt4, String ans, int marks) 
	{
		super();
		this.qno = qno;
		this.question = question;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.opt4 = opt4;
		this.ans = ans;
		this.marks = marks;
	}
	//getter for qno
	public int getQno() 
	{
		return qno;
	}
	//getter for qno
	public void setQno(int qno) 
	{
		this.qno = qno;
	}
	//getter for questions
	public String getQuestion() 
	{
		return question;
	}
	//setter for questions
	public void setQuestion(String question) 
	{
		this.question = question;
	}
	//getter for option1
	public String getOpt1() 
	{
		return opt1;
	}
	////setter for option1
	public void setOpt1(String opt1)
	{
		this.opt1 = opt1;
	}
	//getter for option2
	public String getOpt2() 
	{
		return opt2;
	}
	////setter for option2
	public void setOpt2(String opt2) 
	{
		this.opt2 = opt2;
	}
	//getter for option3
	public String getOpt3() 
	{
		return opt3;
	}
	////setter for option3
	public void setOpt3(String opt3) 
	{
		this.opt3 = opt3;
	}
	//getter for opt4
	public String getOpt4()
	{
		return opt4;
	}
	//setter for option4
	public void setOpt4(String opt4) 
	{
		this.opt4 = opt4;
	}
	//getter for ans
	public String getAns()
	{
		return ans;
	}
	//setter for ans
	public void setAns(String ans) 
	{
		this.ans = ans;
	}
	//getter for marks
	public int getMarks() 
	{
		return marks;
	}
	//setter for marks
	public void setMarks(int marks) 
	{
		this.marks = marks;
	}
	//string for print questions
	@Override
	public String toString() 
	{
		return "qno= "+qno+" question="+question+" opt1="+opt1+" opt2="+opt2+" opt3="
				+opt3+" opt4="+opt4+" ans="+ans+" marks="+marks;
	}
}
