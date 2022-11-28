
import java.util.Scanner;

import Student;

public class StudentServices 
{
	
	static Scanner sc=new Scanner(System.in);
	static int count=0;
	public static void acceptStudentData(Student[] st)
	{
		
		for(int i=count;i<st.length;)
		{
			System.out.println("Enter id:");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name:");
			String name=sc.nextLine();
			System.out.println("Enter 1st subject mark:");
			int m1=sc.nextInt();
			System.out.println("Enter 2nd subject mark:");
			int m2=sc.nextInt();
			System.out.println("Enter 3rd subject mark:");
			int m3=sc.nextInt();
			st[i]=new Student(id,name,m1,m2,m3);
			System.out.println(st[i]);
			count++;
			break;
		}
	}
	//% calculation function 
	public static float calPercentage(Student [] st,int id)
	{
		float percentage=0;
		for(int i=0;i<count;i++)
		{
			if(id==st[i].getId())
			{
				percentage=(st[i].getM1()+st[i].getM2()+st[i].getM3())/3;
			}
		}
		return percentage;	
	}
	//calculation of GPA
	public 	static String GPA(Student [] st,int id)
	{
		String a=null;
		String GPA="";
		float per=calPercentage(st,id);
		for(int i=0;i<count;i++)
		{ 
			if(id==st[i].getId())
			{

				if(per>80)
				{
					GPA="Grade A";
				}
				else if(per<80 && per>70)
				{
					GPA="Grade B";
				}
				else if(per>70 && per<60)
				{
					GPA="Grade C";
				}
				else
				{
					GPA="Grade D";
				}
			}
			a="gpa :"+GPA+"  percentage :"+per; 
		}
		return a;
	}
	//searching by id
	public static void searchbyId(Student[] st,int id)
	{
		for(int i=0;i<count;i++)
		{
			if(id==st[i].getId())
			{
				System.out.println(st[i]);
			}
		}
	}
	//display all elements
	public static void Display(Student [] st)	
	{
		System.out.println("Final array of student");
		for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i]);
		}
	}

}

