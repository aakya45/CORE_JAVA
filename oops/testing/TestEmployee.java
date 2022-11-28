package com.demo.testing;
import java.util.Scanner;
//import com.demo.beans.Employee;
//import com.demo.beans.Person;
//import com.demo.beans.SalariedEmp;
import com.demo.beans.*;
public class TestEmployee
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("***********Menu**********");
			System.out.println("\n1.Salaried Employees \n2.Contracted Employees \n3.Costomers");
			System.out.println("Enter the choice : ");
			choice=sc.nextInt();
			Person p=null;
			switch(choice)
			{
			case 1 ://Salariedemp
				p=new SalariedEmp(1,"Akash","akash@gmail.com","Hr","Manager",50000);	
				System.out.println(((Employee) p).calSalary());
				break;
				
			case 2 ://contemp
				p=new ContEmp(10,"Vaibhv","vaibhav@gmail.com","Hr","Manager",20,3000);
				System.out.println(((Employee) p).calSalary());
				break;
				
			case 3 : //costmere
				p=new Costomer(1,"HP","hp.pvt.ltd@gmail.com","loyal","pune");
				System.out.println(p);
				continue;
				
			case 4 :
				break;
				default:System.out.println("wrong choice");
			}
			System.out.println(p);

		}
		while(choice!=4);
		/*SalariedEmp s=new SalariedEmp(1,"Akash","akash@gmail.com","Hr","Manager",50000);
		s.calSalary();
		System.out.println(s);
		ContEmp e=new ContEmp(10,"Vaibhv","vaibhav@gmail.com","Hr","Manager",20,3000);
		e.calSalary();
		System.out.println(e);
		Costomer c=new Costomer(1,"HP","hp.pvt.ltd@gmail.com","loyal","pune");
		System.out.println(c);
		 */

	}


}
