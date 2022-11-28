
public class Student
{
    int id;
	private String name;
	private  int m1;
	private  int m2;
	private  int m3;

	//default constructor
	public Student()
	{
	    //this(0,null,0,0,0);
		this.id=0;
		this.name=null;
		this.m1=0;
		this.m2=0;
		this.m3=0;	
	}
	//parameterized constructor
	public Student(int id,String name,int m1,int m2,int m3)
	{
		this.id=id;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;	
	}
	//generating getter and setter to fetch and set attributes
	public void setId(int id) 
	{
		this.id = id;
	}
	public int getId() 
	{
		return this.id;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
  
	public String getName()
	{
		return this.name;
	}
	public void setM1(int m1) 
	{
		this.m1 = m1;
	}
	public int getM1() 
	{
		return this.m1;
	}
	public void setM2(int m2) 
	{
		this.m2 = m2;
	}
	public int getM2()
	{
		return this.m2;
	}
	
	public void setM3(int m3)
	{
		this.m3 = m3;
	}
	
	public int getM3() 
	{
		return this.m3;
	}
	//to string for printing data 
	public String toString() 
	{
		 return "id :"+id+"  name :"+name+"  mark1: "+m1+"  mark2: "+m2+"  mark3: "+m3;
	}
}
