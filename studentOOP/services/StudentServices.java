package com.demo.services;
import java.util.Scanner;
public class StudentServices 
{
	static Scanner sc=new Scanner(System.in);
	static int count=0;
	//for msc student
	//add student
	public static void addMscstudent(MscStud[] m)
	{
		for(int i=count;i<m.length;)
		{
			System.out.println("Enter id:");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name:");
			String name=sc.nextLine();
			System.out.println("Enter address:");
			String address=sc.nextLine();
			System.out.println("Enter 1st subject mark:");
			int m1=sc.nextInt();
			System.out.println("Enter 2nd subject mark:");
			int m2=sc.nextInt();
			System.out.println("Enter 3rd subject mark:");
			int m3=sc.nextInt();
			m[i]=new MscStud(id,name,address,m1,m2,m3);
			System.out.println(m[i]);
			count++;
			break;
		}
		System.out.println("Class is full");		
	}
	//searching students by id
	public static void searchbyId(MscStud[] m,int id)
	{
		for(int i=0;i<count;i++)
		{
			if(id==m[i].getId())
			{
				System.out.println(m[i]);
			}
		}
	}
	//display all students
	public static void Display(MscStud [] m)	
	{
		System.out.println("Final array of student");
		for(int i=0;i<m.length;i++)
		{
			System.out.println(m[i]);
		}
	}
	
	//phd students
	//add students
	public static void addPhdstudent(PhdStud[] p)
	{
		for(int i=count;i<p.length;)
		{
			System.out.println("Enter id:");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name:");
			String name=sc.nextLine();
			System.out.println("Enter address:");
			String address=sc.nextLine();
			System.out.println("Enter 1st subject mark:");
			int m1=sc.nextInt();
			System.out.println("Enter 2nd subject mark:");
			int m2=sc.nextInt();
			System.out.println("Enter 3rd subject mark:");
			int m3=sc.nextInt();
			System.out.println("Enter Special subject name:");
			String spesub=sc.nextLine();
			System.out.println("Enter Special subject marks:");
			int spesubmarks=sc.nextInt();
			p[i]=new PhdStud(id,name,address,m1,m2,m3,spesub,spesubmarks);
			System.out.println(p[i]);
			count++;
			break;
		}
		System.out.println("Class is full");	
	}
	//searching students by id
	public static void searchbyId(PhdStud[] p,int id)
	{
		for(int i=0;i<count;i++)
		{
			if(id==p[i].getId())
			{
				System.out.println(p[i]);
			}
		}
	}
	//display all students
	public static void Display(PhdStud [] p)	
	{
		System.out.println("PHD STUDENTSs");
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i]);
		}
	}

}

