package Test;

import com.demo.beans.Book;
import com.demo.beans.OuterClass;

public class TestNestedClass
{
	public static void main(String[] args)
	{
		Book bk=new Book();
		Book.lesson l1=bk.new lesson(0, null);
		l1.m1();
		System.out.println("****************");
		OuterClass ot=new OuterClass();
		OuterClass.innerclass in=ot.new innerclass();
		ot.m2();
		ot.m1();
	    in.m3();
	}
}
