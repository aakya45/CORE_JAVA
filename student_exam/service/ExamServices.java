package com.demo.service;
import java.util.Scanner;
import com.demo.beans.Exam;
import com.demo.beans.Questions;
public class ExamServices 
{
	private static Questions[] java=new Questions[5];
	private static Questions[] html=new Questions[5];
	static Scanner sc=new Scanner(System.in);
	static
	{
		//java database for checking 
		java[0]=new Questions(1,"Who invented Java Programming?","a) Guido van Rossum","b) James Gosling","c) Dennis Ritchie","d) Bjarne Stroustrup","b",2);	
		java[1]=new Questions(2,"Number of primitive data types in Java are?","a) 6","b) 7","c) 8","d) 9","c",2);
		java[2]=new Questions(3,"Which one of the following is not a Java feature?","a) Object-oriented","b) Use of pointers","c) Portable","d) Dynamic and Extensible","b",2);
		java[3]=new Questions(4,"Which of these cannot be used for a variable name in Java?","a) identifier & keyword","b) identifier","c) keyword","d) none","c",2);
		java[4]=new Questions(5,"What is the extension of java code files?","a) .js","b) .txt","c) .class","d) .java","d",2);
		//html database for checking 
		html[0]=new Questions(1,"Who is the father of HTML?","a) Rasmus Lerdorf","b) Tim Berners-Lee","c) Brendan Eich","d) Sergey Brin","b",2);
		html[1]=new Questions(2,"How do we write comments in HTML?","a) </…….>","b) <!……>","c) </……/>","d) <…….!>","b",2);
		html[2]=new Questions(3,"Which element is used for or styling HTML5 layout?","a) CSS","b) jQuery","c) JavaScript","d) PHP","a",2);
		html[3]=new Questions(4,"HTML is a subset of ___","a) SGMT","b) SGML","c) SGME","d) XHTML","b",2);
		html[4]=new Questions(5,"Which tag is used to underline the text in HTML?","a) <p>","b) <u>","c) <i>","d) <ul>","b",2);
	}
	//exam class object created
	public static void JavaExam() 
	{
		Exam ex1=new Exam(2022_01,"Core_Java","29/11/2022",java);
		ExamDetails(ex1);
		int count=1;
		int total_marks=0;
		//checking question answar and mark count 
		for(int i=0;i<java.length;i++)
		{
			System.out.print(java[i].getQno()+".");
			System.out.println(java[i].getQuestion());
			System.out.println(java[i].getOpt1());
			System.out.println(java[i].getOpt2());
			System.out.println(java[i].getOpt3());
			System.out.println(java[i].getOpt4());
			System.out.println("choose the answer:");
			String ans=sc.next();
			if(java[i].getAns().equals(ans))
			{
				total_marks=(count++)*java[i].getMarks();
			}
		}
		//checking passed or not 
		if(total_marks>=4)
		{
			System.out.println("Congratulations you cleare the EXAM!!!");
			System.out.println("Your Score is:"+total_marks);
		}
		else
		{
			System.out.println("Better luck next time");
			System.out.println("Your Score is:"+total_marks);
		}
	}
	//html exam checking
	//exam class object created
	public static void HtmlExam() 
	{
		Exam ex1=new Exam(2022_02,"HTML","29/11/2022",html);
		ExamDetails(ex1);
		int count=1;
		int total_marks=0;
		//checking question answar and mark count 
		for(int i=0;i<html.length;i++)
		{
			System.out.print(html[i].getQno()+".");
			System.out.println(html[i].getQuestion());
			System.out.println(html[i].getOpt1());
			System.out.println(html[i].getOpt2());
			System.out.println(html[i].getOpt3());
			System.out.println(html[i].getOpt4());
			System.out.println("choose the answer:");
			String ans=sc.next();
			if(html[i].getAns().equals(ans))
			{
				total_marks=(count++)*html[i].getMarks();

			}
		}
		//checking passed or not 
		if(total_marks>=4)
		{
			System.out.println("Congratulations you cleare the EXAM!!!");
			System.out.println("Your Score is:"+total_marks);

		}
		else
		{
			System.out.println("Better luck next time");
			System.out.println("Your Score is:"+total_marks);
		}
	}
	//exam details
	public static void ExamDetails(Exam ex1)
	{
		System.out.println("Welcome to "+ex1.getName()+" Exam");
		System.out.println("Exam Code :"+ex1.getExamid());
		System.out.println("Exam Date :"+ex1.getExamdate());
	}	
}
