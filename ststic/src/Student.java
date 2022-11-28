import java.util.Date;

public class Student 
{
   private String id;
   private String sname;
   private String mob;
   private int m1,m2,m3;
   static int pass_per;
   static int count;
   
   static {
	  pass_per=60;
	  count=0;
   }
   private String generateId(String sname) {
	return ++count+sname.substring(0,2)+new Date().getYear();   
   }
   public Student()
   {
	   this.id=generateId("acsdg");
	   this.sname=null;
	   this.mob=null;
	   this.m1=0;
	   this.m2=0;
	   this.m3=0;
   }
   public Student(String sname,String mob,int m1,int m2,int m3)
   {
	   this.id=generateId(sname);
	   this.sname=sname;
	   this.mob=mob;
	   this.m1=m1;
	   this.m2=m2;
	   this.m3=m3;
   }
   public String toString()
   {
	   return "id:"+this.id+"   name :"+this.sname+"  mob:"+this.mob+"  mark1:"+this.m1+"  mark2:"+this.m2+"  mark3:"+m3;
   } 
}
