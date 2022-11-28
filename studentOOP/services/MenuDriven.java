package com.demo.services;

import java.util.Scanner;

public class MenuDriven
{
	public static void DisplyMenu()
	{
		Scanner sc=new Scanner(System.in);
		MscStud []m=new MscStud[1];
		PhdStud[] p=new PhdStud[3];	
		int choice;
		do
		{
			System.out.print("********Admission Cell********");
			System.out.println("\n1.MSC STUDENTS \n2.PHD STUDENTS \n3.EXIT");
			System.out.println("Enter the choice :");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1 :
				int choice1;
				do
				{
					System.out.print("Welcome to Msc student Class");
					System.out.println("\n1.Add Student \n2.Search Student \n3.Display all class students list \n4.Exit");
					System.out.println("Enter Choice :");
					choice1=sc.nextInt();
					switch(choice1)
					{
					case 1 :
						StudentServices.addMscstudent(m);
						break;
					case 2 :
						System.out.println("Enter id :");
						int id=sc.nextInt();
						StudentServices.searchbyId(m, id);
						break;
					case 3 :
						StudentServices.Display(m);
						break;
					case 4 :
						break;
					}
				}while(choice1!=4);
				break;
			case 2 :
				int choice2;
				do
				{
					System.out.print("Welcome to PHD student Class");
					System.out.println("\n1.Add Student \n2.Search student \n3.Display all class students list \n4.Exit");
					System.out.println("Enter Choice :");
					choice2=sc.nextInt();
					switch(choice2)
					{
					case 1 :
						StudentServices.addPhdstudent(p);
						break;
					case 2 :
						System.out.println("Enter id :");
						int id=sc.nextInt();
						StudentServices.searchbyId(p, id);
						break;
					case 3 :
						StudentServices.Display(p);
						break;
					case 4 :
						break;
					}
				}while(choice2!=4);
               break;
			case 3 :
				break;
			}
		}while(choice!=3);
	}
}
