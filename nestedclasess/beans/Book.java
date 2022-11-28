package com.demo.beans;

public class Book 
{
  private int bookid;
  private String bname;
  lesson l1;
  //inner class lesson
  public class lesson
  {
	  int lsid;
	  String lsname;
	  //parameterized constructor of leson 
	  public lesson(int lsid,String lsname)
	  {
		  this.lsid=lsid;
		  this.lsname=null;
	  }
	  //method in lesson
	  public void m1()
	  {
		  System.out.println("in lesson class");
		  m2();
	  }
  }
  //book class method
  public void m2()
  {
	  System.out.println("in book class outside lesson");
  }
}
