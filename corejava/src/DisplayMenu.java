import java.util.Scanner;

//import com.demo.services.StudentServices;

public class DisplayMenu 
{
	static Scanner sc=new Scanner(System.in);
	public static void Menudriven()
	{
		Student[] st=new Student[10];
		int choice;
		do
		{
			System.out.println("********* MENU *********");
			System.out.println("\n1.ADD STUDENTS \n2.PERCENTAGE AND GPA CALCULATE \n3.SEARCH BY ID \n4.DISPLAY ALL STUDENTS");
			System.out.println("Enter the choice:");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1 ://add students
				StudentServices.acceptStudentData(st);
				break;
			case 2 ://% and gap
				System.out.println("Enter the id:");
				int id=sc.nextInt();
				String GPA=StudentServices.GPA(st, id);
				System.out.println(GPA);
				break;
			case 3 ://display by id
				System.out.println("Enter the id:");
				int id1=sc.nextInt();
				StudentServices.searchbyId(st, id1);
				break;
			case 4 ://display all students
				StudentServices.Display(st);
				break;
			case 5 :
				break;
			default:System.out.println("Wrong choice!!!");
			}
		}while(choice!=5);

	}
}
