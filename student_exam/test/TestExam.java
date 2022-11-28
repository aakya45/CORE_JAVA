package com.demo.test;
import java.util.Scanner;
import com.demo.service.ExamServices;
public class TestExam 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("Welcome To Exam Portal");
			System.out.println("Select the test \n1.JAVA \n2.HTML \n3.exit");
			System.out.println("Enter the choice:");
		    choice=sc.nextInt();
			switch(choice)
			{
			case 1://java exam paper
				ExamServices.JavaExam();
				break;
			case 2://html exam paper
				ExamServices.HtmlExam();
				break;
			case 3://exiting from portal 
				System.out.println("Thank You!!!");
				break;
			}
		}while(choice!=3);
		sc.close();
	}
}
