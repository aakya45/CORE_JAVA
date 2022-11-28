package com.demo.beans;

public class OuterClass 
{
	//non static method
	public void m1()
	{
		System.out.println("in non static m1 of outer class");
	}
	//static method
	public static void m2()
	{
		System.out.println("in static m2 of outer class");
	}
	//inner class
	public class innerclass
	{
		//inner class method
		public void m3()
		{
			System.out.println("in inner class");
		}
	}
}
